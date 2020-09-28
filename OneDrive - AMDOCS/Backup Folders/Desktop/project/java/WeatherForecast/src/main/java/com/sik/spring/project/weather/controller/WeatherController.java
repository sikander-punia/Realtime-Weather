package com.sik.spring.project.weather.controller;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.sik.spring.project.weather.model.Example;
import com.sik.spring.project.weather.model.WeatherResponse;

@RestController
@RequestMapping("/weather")
public class WeatherController {

	@GetMapping("/city/{id}")
	public String getWeather(@PathVariable("id") String location) throws IOException {

		Properties prop = new Properties();
		FileReader reader = new FileReader("src/main/resource/apikey.properties");
		prop.load(reader);
		RestTemplate restTemplate = new RestTemplate();
		String uri = "http://api.openweathermap.org/data/2.5/find?appid=" + prop.getProperty("apikey") + location;
		String result = restTemplate.getForObject(uri, String.class);

		Gson gson = new Gson();
		Example weather = gson.fromJson(result, Example.class);
		Float temp = Float.parseFloat(weather.getList().get(0).getMain().getTemp()) - Float.parseFloat("273.15");
		WeatherResponse res = new WeatherResponse();
		res.setTemperature(String.valueOf(temp));
		String response = gson.toJson(res);

		return response;
	}
}

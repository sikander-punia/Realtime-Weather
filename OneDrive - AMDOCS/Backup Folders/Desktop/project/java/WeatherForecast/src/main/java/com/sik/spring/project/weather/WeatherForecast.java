package com.sik.spring.project.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class WeatherForecast {
	public static void main(String[] args) {
		SpringApplication.run(WeatherForecast.class, args);
	}
}
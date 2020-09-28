
package com.sik.spring.project.weather.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Example {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("cod")
    @Expose
    private String cod;
    @SerializedName("count")
    @Expose
    private String count;
    @SerializedName("list")
    @Expose
    private java.util.List<com.sik.spring.project.weather.model.List> list = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Example() {
    }

    /**
     * 
     * @param count
     * @param cod
     * @param message
     * @param list
     */
    public Example(String message, String cod, String count, java.util.List<com.sik.spring.project.weather.model.List> list) {
        super();
        this.message = message;
        this.cod = cod;
        this.count = count;
        this.list = list;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public java.util.List<com.sik.spring.project.weather.model.List> getList() {
        return list;
    }

    public void setList(java.util.List<com.sik.spring.project.weather.model.List> list) {
        this.list = list;
    }

}

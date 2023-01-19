package ru.geekbrains.core.lesson7;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherResponse {
    @JsonProperty("Link")
    private String CITY;
    @JsonProperty("Date")
    private String DATE;
    @JsonProperty("IconPhrase")
    private String WEATHER_TEXT;
    @JsonProperty("Temperature")
    private String TEMPERATURE;

    public WeatherResponse(String CITY, String DATE, String WEATHER_TEXT, String TEMPERATURE) {
        this.CITY = CITY;
        this.DATE = DATE;
        this.WEATHER_TEXT = WEATHER_TEXT;
        this.TEMPERATURE = TEMPERATURE;
    }

    public String getCITY() {
        return CITY;
    }

    public String getDATE() {
        return DATE;
    }

    public String getWEATHER_TEXT() {
        return WEATHER_TEXT;
    }

    public String getTEMPERATURE() {
        return TEMPERATURE;
    }

    public void setCITY(String CITY) {
        this.CITY = CITY;
    }

    public void setDATE(String DATE) {
        this.DATE = DATE;
    }

    public void setWEATHER_TEXT(String WEATHER_TEXT) {
        this.WEATHER_TEXT = WEATHER_TEXT;
    }

    public void setTEMPERATURE(String TEMPERATURE) {
        this.TEMPERATURE = TEMPERATURE;
    }
}

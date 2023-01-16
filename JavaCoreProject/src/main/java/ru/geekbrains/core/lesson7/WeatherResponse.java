package ru.geekbrains.core.lesson7;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class WeatherResponse {
    private String CITY;
    private String DATE;
    private String WEATHER_TEXT;
    private String TEMPERATURE;

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

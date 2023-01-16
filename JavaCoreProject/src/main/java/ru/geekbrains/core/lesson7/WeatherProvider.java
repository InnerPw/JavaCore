package ru.geekbrains.core.lesson7;

import ru.geekbrains.core.lesson7.enums.Periods;

import java.io.IOException;

public interface WeatherProvider {

    void getWeather(Periods periods) throws IOException;

}

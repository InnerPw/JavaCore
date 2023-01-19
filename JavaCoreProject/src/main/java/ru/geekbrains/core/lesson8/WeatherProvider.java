package ru.geekbrains.core.lesson8;



import ru.geekbrains.core.lesson7.enums.Periods;
import ru.geekbrains.core.lesson8.entity.WeatherData;

import java.io.IOException;

public interface WeatherProvider {

    WeatherData getWeather(Periods periods) throws IOException;

    WeatherData getAllFromDb() throws IOException;
}


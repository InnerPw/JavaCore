package ru.geekbrains.core.lesson8;

import ru.geekbrains.core.lesson8.entity.WeatherData;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

// Репозиторий для работы
public interface DatabaseRepository {

    boolean saveWeatherData(WeatherData weatherData) throws SQLException;

    List<WeatherData> getAllSavedData() throws IOException;
}


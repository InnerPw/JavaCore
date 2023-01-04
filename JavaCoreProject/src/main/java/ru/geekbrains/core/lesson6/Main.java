package ru.geekbrains.core.lesson6;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.*;
import java.io.IOException;
import java.io.StringReader;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Main {
    //static Properties prop = new Properties();

    public static void main(String[] args) throws IOException {
        //loadProperties();
        OkHttpClient client = new OkHttpClient();

        // Сегментированное построение URL
        HttpUrl url = new HttpUrl.Builder()
                .scheme("http")
                .host("dataservice.accuweather.com")
                .addPathSegment("forecasts")
                .addPathSegment("v1")
                .addPathSegment("daily")
                .addPathSegment("5day")
                .addPathSegment("295212_PC")
                .addQueryParameter("apikey", "5c8J5qhgvDXs2SAxTIRWjQT1H1yE7WxW")
                .addQueryParameter("language", "ru-ru")
                .addQueryParameter("metric", "true")
                .build();

        System.out.println(url.toString());

        // При необходимости указать заголовки
        Request requesthttp = new Request.Builder()
                .addHeader("accept", "application/json")
                .url(url)
                .build();

        String jsonResponse = client.newCall(requesthttp).execute().body().string();
        System.out.println(jsonResponse);
        //ObjectMapper mapper = new ObjectMapper();
        //StringReader reader = new StringReader(jsonResponse);

        //Example example = mapper.readValue(reader, Example.class);
        System.out.println();
    }
}

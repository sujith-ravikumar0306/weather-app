package com.example.weather.weather_app.service;

import com.example.weather.weather_app.constants.WeatherConstants;
import com.example.weather.weather_app.util.WeatherUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.example.weather.weather_app.payload.WeatherOutput;


import java.util.Map;

@Service
public class WeatherService {
    
    private final Environment environment;

    public WeatherService(Environment environment) {
        this.environment = environment;
    }

    public WeatherOutput getWeatherByCity(String cityName)
    {
        try
        {
            String apiKey = environment.getProperty("weather_api.api_key");
            String apiUrl = WeatherConstants.OPEN_WEATHER_API_URL
                    + cityName
                    + "&units=metric"
                    + "&appid=" + apiKey;


            RestTemplate restTemplate = new RestTemplate();
            Map<String, Object> response = restTemplate.getForObject(apiUrl, Map.class);

            return WeatherUtil.getWeatherOutputFromResponseMap(response);
        } catch (Exception ex)
        {
            throw new IllegalArgumentException("Internal error while making API request");
        }
    }
}

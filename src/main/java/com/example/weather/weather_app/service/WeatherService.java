package com.example.weather.weather_app.service;

import com.example.weather.weather_app.constants.WeatherConstants;
import com.example.weather.weather_app.payload.CityObject;
import com.example.weather.weather_app.util.WeatherUtil;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.example.weather.weather_app.payload.WeatherOutput;


import java.net.URI;
import java.util.List;
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
            String apiKey   =   environment.getProperty("weather_api.api_key");
            String apiUrl   =   WeatherConstants.GET_WEATHER_DATA_ENDPOINT
                                + cityName
                                + "&units=metric"
                                + "&appid=" + apiKey;


            RestTemplate restTemplate       =   new RestTemplate();
            Map<String, Object> response    =   restTemplate.getForObject(apiUrl, Map.class);

            return WeatherUtil.getWeatherOutputFromResponseMap(response);
        } catch (Exception ex)
        {
            throw new IllegalArgumentException("Internal error while making API request - Get Weather report");
        }
    }

    public List<CityObject> getCitiesFromSearchKey(String searchKey)
    {
        try
        {
            String apiKey   =   environment.getProperty("locationiq_api.api_key");
            String apiUrl   =   WeatherConstants.SEARCH_CITIES_ENDPOINT
                                + apiKey
                                + "&q=" + searchKey;

            RestTemplate restTemplate           =   new RestTemplate();
            List<Map<String, Object>> response  =   restTemplate.getForObject(apiUrl, List.class);

            return WeatherUtil.getCitiesListFromResponseMap(response);

        }
        catch (Exception ex)
        {
            throw new IllegalArgumentException("Internal error while making API request - Get cities list");
        }
    }
}

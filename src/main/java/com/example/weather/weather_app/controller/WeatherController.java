package com.example.weather.weather_app.controller;

import com.example.weather.weather_app.payload.CityObject;
import com.example.weather.weather_app.payload.WeatherOutput;
import com.example.weather.weather_app.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/weather")
public class WeatherController
{

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/search")
    public List<CityObject> getSearchedCities(@RequestParam String searchKey)
    {
        return weatherService.getCitiesFromSearchKey(searchKey);
    }

    @GetMapping("/report")
    public WeatherOutput getWeather(@RequestParam String city) {
        return weatherService.getWeatherByCity(city);
    }
}

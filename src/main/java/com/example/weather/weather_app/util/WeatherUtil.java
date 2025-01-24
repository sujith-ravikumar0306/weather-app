package com.example.weather.weather_app.util;

import com.example.weather.weather_app.constants.WeatherConstants.ResponseKeys;
import com.example.weather.weather_app.payload.*;

import java.util.List;
import java.util.Map;

public class WeatherUtil
{


    public static WeatherOutput getWeatherOutputFromResponseMap(Map<String, Object> response)
    {
        Coordinates coordinates             =   getCoordinates(response);
        GeologicalFactors factors           =   getGeologicalFactors(response);
        SolarEventObject solarEventObject   =   getSolarEventObject(response);

        String cityName                     =   (String) response.get(ResponseKeys.CITY_NAME);
        String description                  =   (String) ((Map)((List) response.get(ResponseKeys.WEATHER)).get(0)).get(ResponseKeys.DESCRIPTION);

        WeatherOutput weatherOutput         =   new WeatherOutput();
        weatherOutput.setCityName(cityName);
        weatherOutput.setDescription(description);
        weatherOutput.setIdealTemperature(factors.getTemperature());
        weatherOutput.setGeologicalFactors(factors);
        weatherOutput.setCoordinates(coordinates);
        weatherOutput.setSolarEventObject(solarEventObject);

        return weatherOutput;
    }

    private static SolarEventObject getSolarEventObject(Map<String, Object> response)
    {
        Map<String, Object> sys =   (Map)response.get(ResponseKeys.SYS);
//        Integer timezone        =   (Integer) response.get(ResponseKeys.TIMEZONE);
        Integer sunrise            =   (Integer) sys.get(ResponseKeys.SUNRISE);
        Integer sunset             =   (Integer) sys.get(ResponseKeys.SUNSET);

        return new SolarEventObject(sunrise, sunset);
    }

    private static GeologicalFactors getGeologicalFactors(Map<String, Object> response)
    {
        Map<String, Object> mainFactors =   (Map)response.get(ResponseKeys.MAIN);

        Double temperature              =   (Double) mainFactors.get(ResponseKeys.TEMPERATURE);
        Double feelsLikeTemp            =   (Double) mainFactors.get(ResponseKeys.FEELS_LIKE_TEMP);
        Double minTemp                  =   (Double) mainFactors.get(ResponseKeys.MIN_TEMP);
        Double maxTemp                  =   (Double) mainFactors.get(ResponseKeys.MAX_TEMP);
        Integer pressure                =   (Integer) mainFactors.get(ResponseKeys.PRESSURE);
        Integer humidity                =   (Integer) mainFactors.get(ResponseKeys.HUMIDITY);
        Integer seaLevel                =   (Integer) mainFactors.get(ResponseKeys.SEA_LEVEL);
        Integer groundLevel             =   (Integer) mainFactors.get(ResponseKeys.GROUND_LEVEL);

        Integer clouds                  =   (Integer) ((Map)response.get(ResponseKeys.CLOUDS)).get(ResponseKeys.ALL);

        Map<String, Object> wind        =   (Map) response.get(ResponseKeys.WIND);
        WindObject windObject           =   new WindObject((Double) wind.get(ResponseKeys.SPEED), (Integer) wind.get(ResponseKeys.DIRECTION_IN_DEG), (Double) wind.get(ResponseKeys.GUST));

        GeologicalFactors geologicalFactors =   new GeologicalFactors();
        geologicalFactors.setTemperature(temperature);
        geologicalFactors.setFeelsLikeTemp(feelsLikeTemp);
        geologicalFactors.setMinTemp(temperature < minTemp ? temperature : minTemp);
        geologicalFactors.setMaxTemp(temperature > maxTemp ? temperature : maxTemp);
        geologicalFactors.setPressure(pressure);
        geologicalFactors.setHumidity(humidity);
        geologicalFactors.setSeaLevel(seaLevel);
        geologicalFactors.setGroundLevel(groundLevel);
        geologicalFactors.setWindObject(windObject);
        geologicalFactors.setCloudPercentage(clouds);

        return geologicalFactors;
    }

    private static Coordinates getCoordinates(Map<String, Object> response)
    {
        Map<String, Object> coords  =   (Map)response.get(ResponseKeys.COORDINATES);
        Double latitude, longitude;

        if(coords.get(ResponseKeys.LATITUDE) instanceof Integer)
        {
            Integer lat =   (Integer) coords.get(ResponseKeys.LATITUDE);
            latitude    =   (double) lat;
        }
        else
        {
            latitude    =   (double) coords.get(ResponseKeys.LATITUDE);
        }

        if(coords.get(ResponseKeys.LATITUDE) instanceof Integer)
        {
            Integer lon  =   (Integer) coords.get(ResponseKeys.LATITUDE);
            longitude    =   (double) lon;
        }
        else
        {
            longitude    =   (double) coords.get(ResponseKeys.LATITUDE);
        }


        return new Coordinates(latitude, longitude);
    }
}

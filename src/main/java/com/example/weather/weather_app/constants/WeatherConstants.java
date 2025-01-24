package com.example.weather.weather_app.constants;

public class WeatherConstants
{
    public static final String GET_WEATHER_DATA_ENDPOINT    =   "https://api.openweathermap.org/data/2.5/weather?q=";
    public static final String SEARCH_CITIES_ENDPOINT       =   "https://api.locationiq.com/v1/autocomplete?key=";

    public static class ResponseKeys
    {
        public static final String CITY_NAME        =   "name";
        public static final String WEATHER          =   "weather";
        public static final String DESCRIPTION      =   "description";

        public static final String SYS              =   "sys";
        public static final String TIMEZONE         =   "timezone";
        public static final String SUNRISE          =   "sunrise";
        public static final String SUNSET           =   "sunset";

        public static final String MAIN             =   "main";
        public static final String TEMPERATURE      =   "temp";
        public static final String FEELS_LIKE_TEMP  =   "feels_like";
        public static final String MIN_TEMP         =   "temp_min";
        public static final String MAX_TEMP         =   "temp_max";
        public static final String PRESSURE         =   "pressure";
        public static final String HUMIDITY         =   "humidity";
        public static final String SEA_LEVEL        =   "sea_level";
        public static final String GROUND_LEVEL     =   "grnd_level";

        public static final String CLOUDS           =   "clouds";
        public static final String ALL              =   "all";

        public static final String WIND             =   "wind";
        public static final String SPEED            =   "speed";
        public static final String DIRECTION_IN_DEG =   "deg";
        public static final String GUST             =   "gust";

        public static final String COORDINATES      =   "coord";
        public static final String LATITUDE         =   "lat";
        public static final String LONGITUDE        =   "lon";
    }
}

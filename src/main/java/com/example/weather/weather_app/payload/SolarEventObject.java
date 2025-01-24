package com.example.weather.weather_app.payload;

public class SolarEventObject
{
    private Integer sunrise;
    private Integer sunset;

    public SolarEventObject(Integer sunrise, Integer sunset) {
        this.sunrise = sunrise;
        this.sunset = sunset;
    }

    public Integer getSunrise() {
        return sunrise;
    }

    public void setSunrise(Integer sunrise) {
        this.sunrise = sunrise;
    }

    public Integer getSunset() {
        return sunset;
    }

    public void setSunset(Integer sunset) {
        this.sunset = sunset;
    }
}

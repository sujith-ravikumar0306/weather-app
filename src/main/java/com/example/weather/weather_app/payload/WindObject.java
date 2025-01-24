package com.example.weather.weather_app.payload;

public class WindObject
{
    private Double speed;
    private Integer direction;
    private Double gust;

    public WindObject(Double speed, Integer direction, Double gust)
    {
        this.speed = speed;
        this.direction = direction;
        this.gust   =   gust;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Integer getDirection() {
        return direction;
    }

    public void setDirection(Integer direction) {
        this.direction = direction;
    }

    public Double getGust() {
        return gust;
    }

    public void setGust(Double gust) {
        this.gust = gust;
    }
}

package com.example.weather.weather_app.payload;

public class GeologicalFactors
{
    private Double temperature;
    private Double feelsLikeTemp;
    private Double minTemp;
    private Double maxTemp;
    private Integer pressure;
    private Integer humidity;
    private Integer seaLevel;
    private Integer groundLevel;
    private WindObject windObject;
    private Integer cloudPercentage;

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getFeelsLikeTemp() {
        return feelsLikeTemp;
    }

    public void setFeelsLikeTemp(Double feelsLikeTemp) {
        this.feelsLikeTemp = feelsLikeTemp;
    }

    public Double getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(Double minTemp) {
        this.minTemp = minTemp;
    }

    public Double getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(Double maxTemp) {
        this.maxTemp = maxTemp;
    }

    public Integer getPressure() {
        return pressure;
    }

    public void setPressure(Integer pressure) {
        this.pressure = pressure;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Integer getSeaLevel() {
        return seaLevel;
    }

    public void setSeaLevel(Integer seaLevel) {
        this.seaLevel = seaLevel;
    }

    public Integer getGroundLevel() {
        return groundLevel;
    }

    public void setGroundLevel(Integer groundLevel) {
        this.groundLevel = groundLevel;
    }

    public WindObject getWindObject() {
        return windObject;
    }

    public void setWindObject(WindObject windObject) {
        this.windObject = windObject;
    }

    public Integer getCloudPercentage() {
        return cloudPercentage;
    }

    public void setCloudPercentage(Integer cloudPercentage) {
        this.cloudPercentage = cloudPercentage;
    }
}

package com.example.weather.weather_app.payload;


public class WeatherOutput
{
    private String cityName;
    private String description;
    private Double idealTemperature;
    private Coordinates coordinates;
    private GeologicalFactors geologicalFactors;
    private SolarEventObject solarEventObject;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Double getIdealTemperature() {
        return idealTemperature;
    }

    public void setIdealTemperature(Double idealTemperature) {
        this.idealTemperature = idealTemperature;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public GeologicalFactors getGeologicalFactors() {
        return geologicalFactors;
    }

    public void setGeologicalFactors(GeologicalFactors geologicalFactors) {
        this.geologicalFactors = geologicalFactors;
    }

    public SolarEventObject getSolarEventObject() {
        return solarEventObject;
    }

    public void setSolarEventObject(SolarEventObject solarEventObject) {
        this.solarEventObject = solarEventObject;
    }
}

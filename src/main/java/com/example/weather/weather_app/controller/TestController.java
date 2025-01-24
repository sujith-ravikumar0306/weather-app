package com.example.weather.weather_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*
*
*   This class is for testing purpose only.
*
*/

@RestController
public class TestController
{

    @GetMapping("/test")
    public String testEndpoint(@RequestParam String param) {
        return "Received param: " + param;
    }
}

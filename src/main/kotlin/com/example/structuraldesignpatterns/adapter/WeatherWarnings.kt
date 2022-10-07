package com.example.structuraldesignpatterns.adapter

private const val MAX_TEMPERATURE = 100
private const val MIN_TEMPERATURE = 16

class WeatherWarnings {
    fun postWarning(city: City) {
        val cityTemperature = city.getCityTemperature()
        val cityName = city.getCityName()
        if (cityTemperature >= MAX_TEMPERATURE || cityTemperature <= MIN_TEMPERATURE) {
            println("Warning! Current temperature in $cityName is " +
                    "$cityTemperature + ${city.getCityTemperatureScale()}")
            city.setHasWeatherWarning(true)
        } else {
            println("Temperature in $cityName is OK.")
        }
    }
}
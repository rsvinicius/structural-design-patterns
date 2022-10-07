package com.example.structuraldesignpatterns.adapter

interface City {
    fun getCityTemperature(): Double
    fun getCityTemperatureScale(): String
    fun getCityName(): String
    fun isWeatherWarningEnabled(): Boolean?
    fun setHasWeatherWarning(isWeatherWarningEnabled: Boolean)
}
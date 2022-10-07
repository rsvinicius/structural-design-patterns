package com.example.structuraldesignpatterns.adapter

class NorthAmericanCity(
    private val name: String,
    private val temperature: Double,
    private var isWeatherWarningEnabled: Boolean? = null
) : City {
    override fun getCityTemperature(): Double {
        return temperature
    }

    override fun getCityTemperatureScale(): String {
        return "Fahrenheit"
    }

    override fun getCityName(): String {
        return name
    }

    override fun isWeatherWarningEnabled(): Boolean? {
        return isWeatherWarningEnabled
    }

    override fun setHasWeatherWarning(isWeatherWarningEnabled: Boolean) {
        this.isWeatherWarningEnabled = isWeatherWarningEnabled
    }
}
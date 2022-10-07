package com.example.structuraldesignpatterns.adapter

class Adapter(private val city: City) : City {
    private fun celsiusToFahrenheitConversion(celsiusTemperature: Double): Double {
        return celsiusTemperature * 1.8 + 32
    }

    override fun getCityTemperature(): Double {
        val cityTemperature = city.getCityTemperature()
        return if (city.getCityTemperatureScale() == "Celsius") {
            celsiusToFahrenheitConversion(cityTemperature)
        } else {
            cityTemperature
        }
    }

    override fun getCityTemperatureScale(): String {
        return "Fahrenheit"
    }

    override fun getCityName(): String {
        return city.getCityName()
    }

    override fun isWeatherWarningEnabled(): Boolean? {
        return city.isWeatherWarningEnabled()
    }

    override fun setHasWeatherWarning(isWeatherWarningEnabled: Boolean) {
        city.setHasWeatherWarning(isWeatherWarningEnabled)
    }
}
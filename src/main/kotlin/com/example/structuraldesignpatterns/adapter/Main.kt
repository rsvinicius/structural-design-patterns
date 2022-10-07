package com.example.structuraldesignpatterns.adapter

fun main() {
    val weatherWarnings = WeatherWarnings()

    val chicago = NorthAmericanCity("Chicago", 16.0)
    weatherWarnings.postWarning(chicago)

    val phoenix = NorthAmericanCity("Phoenix", 104.0)
    weatherWarnings.postWarning(phoenix)

    val portland = NorthAmericanCity("Portland", 70.0)
    weatherWarnings.postWarning(portland)

    val singapore = AsianCity("Singapore", 50.0)
    val adapter = Adapter(singapore)
    weatherWarnings.postWarning(adapter)
}
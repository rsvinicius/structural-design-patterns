package com.example.structuraldesignpatterns.decorator

class PizzaHawaiian : Pizza {
    private val toppings: MutableList<String> = mutableListOf("cheese","tomato","ham","pineapple")
    private val name: String = "Hawaiian"

    override fun toppings(): MutableList<String> {
        return toppings
    }

    override fun name(): String {
        return name
    }
}
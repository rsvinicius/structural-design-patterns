package com.example.structuraldesignpatterns.decorator

class PizzaWithExtraCheese(private val pizza: Pizza) : Pizza {
    override fun toppings(): MutableList<String> {
        pizza.toppings().add("extra cheese")
        return pizza.toppings()
    }

    override fun name(): String {
        return pizza.name()
    }
}
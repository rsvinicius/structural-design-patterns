package com.example.structuraldesignpatterns.decorator

class PizzaPepperoni : Pizza {
    private val toppings: MutableList<String> = mutableListOf("cheese","tomato","pepperoni")
    private val name: String = "Pepperoni"

    override fun toppings(): MutableList<String> {
        return toppings
    }

    override fun name(): String {
        return name
    }
}
package com.example.structuraldesignpatterns.decorator

class PizzaMarguerita : Pizza {
    private val toppings: MutableList<String> = mutableListOf("cheese","tomato")
    private val name: String = "Margherita"

    override fun toppings(): MutableList<String> {
        return toppings
    }

    override fun name(): String {
        return name
    }
}
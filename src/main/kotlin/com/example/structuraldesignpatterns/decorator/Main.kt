package com.example.structuraldesignpatterns.decorator

fun main() {
    order(PizzaMarguerita())
    order(PizzaHawaiian())
    order(PizzaWithExtraCheese(PizzaHawaiian()))
    order(PizzaPepperoni())
}

fun order(pizza: Pizza) {
    println("You hava ordered a ${pizza.name()} pizza. The toppings are ${pizza.toppings()}.")
}
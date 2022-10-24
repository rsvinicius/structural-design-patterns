package com.example.structuraldesignpatterns.decorator

interface Pizza {
    fun toppings(): MutableList<String>
    fun name(): String
}
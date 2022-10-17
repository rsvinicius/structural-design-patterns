package com.example.structuraldesignpatterns.composite

class Manager(private val name: String) : Payee {
    override fun payExpenses(amount: Int) {
        println("$name has been paid $$amount")
    }
}
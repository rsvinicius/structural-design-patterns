package com.example.structuraldesignpatterns.composite

class Salesperson(
    private val name: String,
    private val manager: Manager
) : Payee {
    override fun payExpenses(amount: Int) {
        println("$name has been paid $$amount")
    }
}
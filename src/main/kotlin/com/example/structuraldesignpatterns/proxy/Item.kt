package com.example.structuraldesignpatterns.proxy

class Item(
    private val name: String,
    private val price: Double,
    private val quantity: Int
) {
    override fun toString(): String {
        return "$name, price: $$price, quantity: $quantity"
    }
}
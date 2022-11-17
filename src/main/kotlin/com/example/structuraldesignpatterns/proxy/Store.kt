package com.example.structuraldesignpatterns.proxy

class Store(
    private val name: String,
    private val location: String,
    private val inventory: Inventory
) {
    fun printName() {
        println(name)
    }

    fun printLocation() {
        println(location)
    }

    fun printInventory() {
        inventory.getInventory().forEach { item -> println(item) }
    }
}
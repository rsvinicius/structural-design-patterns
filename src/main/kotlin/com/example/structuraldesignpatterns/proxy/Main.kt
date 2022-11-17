package com.example.structuraldesignpatterns.proxy

fun main() {
    val inventory = SuperstoreInventoryProxy()
    val store = Store("Healthy Wholefoods", "Los Angeles", inventory)

    store.printName()
    store.printLocation()
    store.printInventory()
}
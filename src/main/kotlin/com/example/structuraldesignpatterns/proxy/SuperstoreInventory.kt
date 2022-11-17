package com.example.structuraldesignpatterns.proxy

class SuperstoreInventory : Inventory {
    private val inventory: ArrayList<Item> = ArrayList()

    init {
        inventory.add(Item("Bread", 1.0, 500))
        inventory.add(Item("Milk", 0.5, 400))
        inventory.add(Item("Eggs", 0.7, 300))
        inventory.add(Item("Coffee", 4.0, 100))
        inventory.add(Item("Ham", 2.0, 300))
        inventory.add(Item("Orange Juice", 0.2, 400))
        inventory.add(Item("Cereal", 1.0, 400))
        inventory.add(Item("Butter", 0.3, 300))
        inventory.add(Item("Pasta", 1.0, 300))
        inventory.add(Item("Apples", 0.2, 200))
        inventory.add(Item("Bananas", 0.2, 200))
        inventory.add(Item("Onions", 0.1, 500))
    }

    override fun getInventory(): ArrayList<Item> {
        return inventory
    }
}
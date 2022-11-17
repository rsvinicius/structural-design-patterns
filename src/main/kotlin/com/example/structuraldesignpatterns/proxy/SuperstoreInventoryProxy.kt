package com.example.structuraldesignpatterns.proxy

class SuperstoreInventoryProxy : Inventory {
    private var inventory: Inventory? = null

    override fun getInventory(): ArrayList<Item> {
        if (inventory == null) {
            inventory = SuperstoreInventory()
        }

        return inventory!!.getInventory()
    }
}
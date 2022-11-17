package com.example.structuraldesignpatterns.flyweight

class Car : Vehicle {
    private val location = IntArray(2)

    override fun getType(): String = "Car"

    override fun getLocation(): IntArray = location

    override fun setLocation(latitude: Int, longitude: Int) {
        location[0] = latitude
        location[1] = longitude
    }
}
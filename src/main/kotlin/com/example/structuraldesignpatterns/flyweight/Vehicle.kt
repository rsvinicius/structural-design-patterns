package com.example.structuraldesignpatterns.flyweight

interface Vehicle {
    fun getType(): String
    fun getLocation(): IntArray
    fun setLocation(latitude: Int, longitude: Int)
}
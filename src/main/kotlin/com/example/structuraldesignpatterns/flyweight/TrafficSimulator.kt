package com.example.structuraldesignpatterns.flyweight

import java.util.Random
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

var vehicles: ArrayList<Vehicle> = ArrayList()
var factory: VehicleFactory = VehicleFactory()

fun main() {
    val createVehicles = Runnable { createRandomCar() }

    val removeVehicles = Runnable { removeCar() }

    val executor = Executors.newScheduledThreadPool(1)
    executor.scheduleAtFixedRate(createVehicles, 0, 3, TimeUnit.SECONDS)
    executor.scheduleAtFixedRate(removeVehicles, 5, 5, TimeUnit.SECONDS)
}

private fun createRandomCar() {
    val random = Random()
    val randInt = random.nextInt(2)
    val vehicle: Vehicle? = factory.getVehicle(randInt)

    vehicle!!.setLocation(random.nextInt(1000), random.nextInt(1000))
    println(
        "Creating $vehicle, type: ${vehicle.getType()}, " +
                "location: ${vehicle.getLocation()[0]} ${vehicle.getLocation()[1]}"
    )
    vehicles.add(vehicle)
}

private fun removeCar() {
    println("Removing ${vehicles[0]}")
    vehicles.removeAt(0)
}
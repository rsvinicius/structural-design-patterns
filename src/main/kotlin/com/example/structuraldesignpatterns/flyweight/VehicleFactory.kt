package com.example.structuraldesignpatterns.flyweight


class VehicleFactory {
    var vehicles: HashMap<Int, Vehicle> = HashMap()

    fun getVehicle(type: Int): Vehicle {
        if (vehicles.containsKey(type)) return vehicles[type]!!

        val vehicle: Vehicle = if (type == 0) Car() else Truck()
        vehicles[type] = vehicle
        return vehicle
    }
}
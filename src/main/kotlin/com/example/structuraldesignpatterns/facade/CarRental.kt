package com.example.structuraldesignpatterns.facade

import java.time.LocalDate

class CarRental {
    fun book(start: LocalDate, end: LocalDate) {
        println("Booking car for $start to $end")
    }
}
package com.example.structuraldesignpatterns.facade

import java.time.LocalDate

class Hotel {
    fun book(checkinDate: LocalDate, checkoutDate: LocalDate) {
        println("Booking hotel for $checkinDate to $checkoutDate")
    }
}
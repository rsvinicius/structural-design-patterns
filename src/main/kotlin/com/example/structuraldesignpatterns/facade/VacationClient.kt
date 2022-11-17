package com.example.structuraldesignpatterns.facade

import java.time.LocalDate

fun main() {
    val startDate = LocalDate.of(2021, 8, 1)
    val endDate = LocalDate.of(2021, 8, 15)

    val vacationFacade = VacationFacade()
    vacationFacade.book(startDate, endDate)
}
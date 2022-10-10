package com.example.structuraldesignpatterns.bridge

fun main() {
    val checkboxButton = CheckboxButton(SmallButtonSize())
    checkboxButton.draw()

    val radioButton = RadioButton(MediumButtonSize())
    radioButton.draw()

    val dropdownButton = DropdownButton(LargeButtonSize())
    dropdownButton.draw()
}
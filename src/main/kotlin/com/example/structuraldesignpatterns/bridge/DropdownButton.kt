package com.example.structuraldesignpatterns.bridge

class DropdownButton(private val buttonSize: ButtonSize) : Button() {
    override fun draw() {
        buttonSize.setSize()
        println("Drawing a dropdown button.\n")
    }
}
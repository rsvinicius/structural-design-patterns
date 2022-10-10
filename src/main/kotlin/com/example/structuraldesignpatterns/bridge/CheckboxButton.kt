package com.example.structuraldesignpatterns.bridge

class CheckboxButton(private val buttonSize: ButtonSize) : Button() {
    override fun draw() {
        buttonSize.setSize()
        println("Drawing a checkbox button.\n")
    }
}
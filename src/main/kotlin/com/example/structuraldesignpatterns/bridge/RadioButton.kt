package com.example.structuraldesignpatterns.bridge

class RadioButton(private val buttonSize: ButtonSize) : Button() {
    override fun draw() {
        buttonSize.setSize()
        println("Drawing a radio button.\n")
    }
}
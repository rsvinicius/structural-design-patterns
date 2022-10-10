package com.example.structuraldesignpatterns.bridge

class LargeButtonSize : ButtonSize {
    override fun setSize() {
        println("Setting size to large...")
    }
}
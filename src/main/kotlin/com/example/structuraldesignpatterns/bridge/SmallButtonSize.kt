package com.example.structuraldesignpatterns.bridge

class SmallButtonSize : ButtonSize {
    override fun setSize() {
        println("Setting size to small...")
    }
}
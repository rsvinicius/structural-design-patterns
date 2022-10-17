package com.example.structuraldesignpatterns.composite

fun main() {
    val jane = Manager("Jane")
    val bob = Salesperson("Bob", jane)
    val sue = Salesperson("Sue", jane)

    val team = SalesTeam()
    team.addPayee(jane)
    team.addPayee(bob)
    team.addPayee(sue)

    payPayee(jane, 100)
    payPayee(bob, 300)
    payPayee(team, 200)
}

private fun payPayee(payee: Payee, amount: Int) {
    println("Expenses have been requested")
    payee.payExpenses(amount)
    println("Expenses have been paid\n")
}
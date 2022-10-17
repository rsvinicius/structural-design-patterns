package com.example.structuraldesignpatterns.composite

class SalesTeam(
    private var payees: MutableList<Payee> = ArrayList()
) : Payee {
    fun addPayee(payee: Payee) {
        payees.add(payee)
    }

    override fun payExpenses(amount: Int) {
        payees.forEach { payee -> payee.payExpenses(amount) }
    }
}
package com.gos.expenseservice.domain.expense

interface ExpenseRepository {

    fun save(expense: Expense)

    fun delete(expense: Expense)

    fun getAll()
}
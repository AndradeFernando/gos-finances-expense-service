package com.gos.expenseservice.domain.expense

interface ExpenseService {

    fun saveExpense(expense: Expense)
}
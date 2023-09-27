package com.gos.expenseservice.domain.expense

import com.gos.expenseservice.infrasctructure.persistence.nosqldb.ExpenseEntity

data class Expense(val description: String, val value: Double) {

    fun toEntity() = ExpenseEntity("", description, value )
}
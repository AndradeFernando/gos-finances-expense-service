package com.gos.expenseservice.infrasctructure.persistence.nosqldb

import com.gos.expenseservice.domain.expense.Expense
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document


@Document(collection = "Expense")
data class ExpenseEntity (

    @Id
    val id: String,

    val description: String,

    val value: Double
)

{

    fun toDomain() = Expense(description, value)

}
package com.gos.expenseservice.infrasctructure.persistence.nosqldb

import com.gos.expenseservice.domain.expense.Expense
import com.gos.expenseservice.domain.expense.ExpenseRepository
import org.springframework.stereotype.Repository


@Repository
class ExpenseRepositoryImpl(val expensePersistenceRepository: ExpensePersistenceRepository): ExpenseRepository {
    override fun save(expense: Expense) {
        expensePersistenceRepository.save(expense.toEntity())
    }

    override fun delete(expense: Expense) {
        TODO("Not yet implemented")
    }

    override fun getAll() {
        TODO("Not yet implemented")
    }
}
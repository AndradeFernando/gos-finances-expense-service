package com.gos.expenseservice.infrasctructure.persistence.nosqldb

import com.gos.expenseservice.domain.expense.ExpenseRepository
import org.springframework.data.mongodb.repository.MongoRepository

interface ExpensePersistenceRepository: MongoRepository<ExpenseEntity, String> {
}
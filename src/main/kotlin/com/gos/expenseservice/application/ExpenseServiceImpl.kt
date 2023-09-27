package com.gos.expenseservice.application

import com.gos.expenseservice.domain.expense.Expense
import com.gos.expenseservice.domain.expense.ExpenseRepository
import com.gos.expenseservice.domain.expense.ExpenseService
import org.springframework.stereotype.Service

@Service
class ExpenseServiceImpl(val expenseRepository: ExpenseRepository): ExpenseService {
    override fun saveExpense(expense: Expense) {
        expenseRepository.save(expense)
    }


}
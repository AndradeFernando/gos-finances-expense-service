package com.gos.expenseservice.resource

import com.gos.expenseservice.domain.expense.Expense
import com.gos.expenseservice.domain.expense.ExpenseService
import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatusCode
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@Validated
@RestController
@RequestMapping("gos/expense", produces = [])
class ExpenseController(val expenseService: ExpenseService) {

    private val logger = LoggerFactory.getLogger(ExpenseController::class.java)

    @PostMapping
    fun saveExpense( @RequestBody expense: Expense) : ResponseEntity<String> {
        logger.info("ExpenseService $expenseService")

        expenseService.saveExpense(expense)
        return ResponseEntity(HttpStatusCode.valueOf(200))
    }



}
package org.example.lesson2

import kotlin.math.pow

fun main() {

    val initialInvestmentAmount = 70_000
    val interestRate = 0.167
    val daysOfIncomeAccrual = 365
    val daysAYear = 365
    val numberOfInterestPaymentPeriods = 20

    val compoundInterest = initialInvestmentAmount * (1 + interestRate * daysOfIncomeAccrual / daysAYear * 1).pow(
        numberOfInterestPaymentPeriods
    )

    println(String.format("%.3f", compoundInterest))
}
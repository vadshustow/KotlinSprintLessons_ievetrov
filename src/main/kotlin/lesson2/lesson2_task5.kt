package org.example.lesson2

import kotlin.math.pow

const val CONVERSION_PERCENT_TO_DECIMAL = 100

fun main() {

    val initialInvestmentAmount = 70_000
    val interestRate = 16.7
    val daysOfIncomeAccrual = 365
    val daysAYear = 365
    val numberOfInterestPaymentPeriods = 20

    val compoundInterest = initialInvestmentAmount * (1 + (interestRate / CONVERSION_PERCENT_TO_DECIMAL) * daysOfIncomeAccrual / daysAYear * 1).pow(
        numberOfInterestPaymentPeriods
    )

    println(String.format("%.3f", compoundInterest))
}
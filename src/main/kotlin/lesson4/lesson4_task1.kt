package org.example.lesson4

const val TABLES_IN_THE_RESTAURANT = 13

fun main() {

    val reservedToday = 13
    val reservedTomorrow = 9

    println(
        "Доступность столиков на сегодня: ${reservedToday < TABLES_IN_THE_RESTAURANT}\n" +
                "Доступность столиков на завтра: ${reservedTomorrow < TABLES_IN_THE_RESTAURANT}"
    )
}
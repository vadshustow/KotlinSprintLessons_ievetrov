package org.example.lesson1

const val CONVERSION_TIME_SIXTY = 60
const val CONVERSION_TIME_THREE_THOUSAND_SIX_HUNDRED = 3600

fun main() {

    var seconds = 6480

    val hour = seconds / CONVERSION_TIME_THREE_THOUSAND_SIX_HUNDRED
    val minute = (seconds - (hour * CONVERSION_TIME_THREE_THOUSAND_SIX_HUNDRED)) / CONVERSION_TIME_SIXTY
    seconds = (seconds - (hour * CONVERSION_TIME_THREE_THOUSAND_SIX_HUNDRED)) - (minute * CONVERSION_TIME_SIXTY)

    println("${"%02d".format(hour)}:${"%02d".format(minute)}:${"%02d".format(seconds)}")
}
package org.example.lesson1

const val SIXTY = 60
const val THREE_THOUSAND_SIX_HUNDRED = 3600

fun main() {

    var seconds = 6480

    val hour = seconds / THREE_THOUSAND_SIX_HUNDRED
    val minute = (seconds - (hour * THREE_THOUSAND_SIX_HUNDRED)) / SIXTY
    seconds = (seconds - (hour * THREE_THOUSAND_SIX_HUNDRED)) - (minute * SIXTY)

    println("${"%02d".format(hour)}:${"%02d".format(minute)}:${"%02d".format(seconds)}")
}
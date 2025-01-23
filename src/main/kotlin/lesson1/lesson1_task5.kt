package org.example.lesson1

fun main() {

    var seconds = 6480

    val hour = seconds / 3600
    val minute = (seconds - (hour * 3600)) / 60
    seconds = (seconds - (hour * 3600)) - (minute * 60)

    println("${"%02d".format(hour)}:${"%02d".format(minute)}:${"%02d".format(seconds)}")
}
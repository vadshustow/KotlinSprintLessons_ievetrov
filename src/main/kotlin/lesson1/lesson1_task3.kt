package org.example.lesson1

fun main() {

    val year: Short = 1961
    var hour: Byte = 9
    var minute: Byte= 7

    println(year)
    println("%02d".format(hour))
    println("%02d".format(minute))

    hour = 10
    minute = 55

    println("$hour:$minute")
}
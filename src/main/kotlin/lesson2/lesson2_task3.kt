package org.example.lesson2

const val SIXTY = 60

fun main() {

    val departureHours = 9
    val departureMinutes = 39
    val minutesOnTheRoad = 457

    val totalMinutes = ((departureHours * SIXTY) + departureMinutes) + minutesOnTheRoad
    val arrivalHours = totalMinutes / SIXTY
    val arrivalMinutes = totalMinutes - (arrivalHours * SIXTY)

    println("Время прибытия поезда: $arrivalHours:$arrivalMinutes")
}
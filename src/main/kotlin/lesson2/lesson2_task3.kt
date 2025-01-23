package org.example.lesson2

fun main() {

    val departureHours = 9
    val departureMinutes = 39
    val minutesOnTheRoad = 457

    val totalMinutes = ((departureHours * 60) + departureMinutes) + minutesOnTheRoad
    val arrivalHours = totalMinutes / 60
    val arrivalMinutes = totalMinutes - (arrivalHours * 60)

    println("Время прибытия поезда: $arrivalHours:$arrivalMinutes")
}
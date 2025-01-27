package org.example.lesson4

fun main() {

    val weather = true
    val awning = true
    val humidity = 20
    val season = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${weather && awning && humidity == 20 && season != "зима"}")
}
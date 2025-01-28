package org.example.lesson3

fun main() {

    val move = "D2-D4;0"

    val part = move.split("-", ";")

    val startMove = part[0]
    val endMove = part[1]
    val moveNumber = part[2]

    println("$startMove\n$endMove\n$moveNumber")
}
package org.example.lesson2

fun main() {

    val schoolchildren: Int = 4
    val sbScore1: Float = 3f
    val sbScore2: Float = 4f
    val sbScore3: Float = 3f
    val sbScore4: Float = 5f

    val arithmeticAverage: Float = (sbScore1 + sbScore2 + sbScore3 + sbScore4) / schoolchildren

    println(String.format("%.2f", arithmeticAverage))
}
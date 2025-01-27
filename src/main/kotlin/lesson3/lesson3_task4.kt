package org.example.lesson3

fun main() {

    var startOfMove = "E2"
    var endOfMove = "E4"
    var moveNumber = 1

    var move = "[$startOfMove-$endOfMove;$moveNumber]"

    println(move)

    startOfMove = "D2"
    endOfMove = "D3"
    moveNumber = 2

    move = "[$startOfMove-$endOfMove;$moveNumber]"

    println(move)
}
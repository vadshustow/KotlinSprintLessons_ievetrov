package org.example.lesson4

fun main() {

    val trainingDay = 5

    val handExercises = trainingDay % 2 == 1
    val legExercises = trainingDay % 2 == 0
    val backExercises = trainingDay % 2 == 0
    val pressExercises = trainingDay % 2 == 1

    println("""
        Упражнения для рук:    $handExercises
        Упражнения для ног:    $legExercises
        Упражнения для спины:  $backExercises
        Упражнения для пресса: $pressExercises
    """.trimIndent())
}
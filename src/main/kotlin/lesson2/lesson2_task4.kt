package org.example.lesson2

fun main() {

    val buff= 0.2
    val crystalOre = 7
    val ironOre = 11

    val bonusCrystalOre = (crystalOre * buff).toInt()
    val bonusIronOre = (ironOre * buff).toInt()

    println(bonusCrystalOre)
    println(bonusIronOre)
}
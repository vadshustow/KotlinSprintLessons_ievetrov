package org.example.lesson2

const val CONVERSION_PERCENT_TO_DECIMAL = 100

fun main() {

    val buffPercent = 20
    val crystalOre = 7
    val ironOre = 11

    val buff = buffPercent.toDouble() / CONVERSION_PERCENT_TO_DECIMAL

    val bonusCrystalOre = (crystalOre * buff).toInt()
    val bonusIronOre = (ironOre * buff).toInt()

    println(bonusCrystalOre)
    println(bonusIronOre)
}
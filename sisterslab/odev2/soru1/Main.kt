package com.example.hafta2.odev2.soru1

fun main (){

    val dikdortgen = Dikdortgen(7.0, 5.0)
    println("Dikdörtgenin alanı:  ${dikdortgen.alan()}")

    println("Dikdörtgenin çevresi:  ${dikdortgen.cevre()}")

    val daire = Daire(1.5)
    println("Dairenin alanı:  ${daire.alan()}")

    println("Dairenin çevresi ${daire.cevre()}")


}
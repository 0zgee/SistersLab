package com.example.hafta2.odev2.soru2

class Futbolcu (var isim: String, var yas:Int): Oyuncu() {

    override fun oyna() {

        println("$yas yaşındaki $isim isimli futbolcu oynuyor")
    }

    fun gol() {
        println("$isim gol attı")
    }
}
package com.example.hafta2.odev2.soru2

class Basketbolcu (var isim: String , var boy: Int):Oyuncu() {

    override fun oyna() {
        println("$boy boyundaki $isim isimli oyuncu oynuyor ")
    }

    fun basket() {
        println("$isim sayı aldı")
    }
}
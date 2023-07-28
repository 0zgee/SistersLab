package com.example.hafta2.odev2.soru5

class Kullanici(val ad: String?, val soyad: String?) {

}

fun main() {

    val kullanici = Kullanici(null, null)
    println("Ad: ${kullanici.ad ?: "Bilgi yok"}")
    println("Soyad: ${kullanici.soyad ?: "Bilgi yok"}")
}
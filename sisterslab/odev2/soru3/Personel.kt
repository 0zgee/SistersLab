package com.example.hafta2.odev2.soru3


class Personel (
    var ad: String,
    var soyad: String,
    var pozisyon: String,
    var maas: Double ) {


    fun maasArttir(artis: Double) {
        maas += artis
        println("$ad $soyad isimli personelin maaşı $artis arttırıldı. Yeni maaş: $maas")
    }


}

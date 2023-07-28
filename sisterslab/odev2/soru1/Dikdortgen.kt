package com.example.hafta2.odev2.soru1

class Dikdortgen (val uzunluk: Double, val genislik: Double) : GeometrikSekil() {

    override fun alan() : Double {

        return uzunluk * genislik
    }

    override fun cevre() : Double {

            return 2 * (uzunluk + genislik)
    }
}
package com.example.hafta2.odev2.soru1

class Daire (val yaricap: Double ) : GeometrikSekil() {
    override fun alan () : Double {

       return Math.PI * yaricap * yaricap
    }

    override fun cevre () : Double {

        return 2 * Math.PI * yaricap
    }

}
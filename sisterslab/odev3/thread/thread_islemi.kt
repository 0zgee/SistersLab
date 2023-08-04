package com.example.odev3.thread

fun main() {
    // İlk işlemi temsil eden thread
    val firstThread = Thread {
        println("İlk işlem başladı.")

        Thread.sleep(5000) // 5 saniye uyutuyoruz.
        println("İlk işlem bitti.")
    }

    // İkinci işlemi temsil eden thread
    val secondThread = Thread {
        println("İkinci işlem başladı.")

        Thread.sleep(3000) // 3 saniye uyutuyoruz.
        println("İkinci işlem bitti.")
    }

    // İşlemleri başlatıyoruz
    firstThread.start()
    secondThread.start()

    // Ana thread 6 saniye uyuyor
    Thread.sleep(6000)
    println("Ana thread uyandı.")

    // İşlemlerin bitmesini bekliyoruz
    firstThread.join()
    secondThread.join()
    println("Tüm işlemler tamamlandı.")
}
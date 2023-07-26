package com.example.sisterslab.hafta1.odev2
import java.util.Scanner

/* Kullanıcıdan yaşını girmesini isteyecek Girilen yaşa göre,18 veya daha büyükse "Oy kullanabilirsiniz!" mesajını,
küçükse "Oy kullanamazsınız." mesajını ekrana yazdırır. Eğer geçerli bir sayı girilmezse,"Geçerli bir yaş girmediniz."
mesajını ekrana yazdırsın ve sayı dışında text girdiğinde uygulama hata vermesin sayı giriniz uyarısı versin
Not: try-cacth bloğu kullanılmalı */

fun main(args: Array<String>) {
    try {
        print("Yaşınızı giriniz: ")
        val input = readLine() // Kullanıcıdan yaş bilgisini alıyor

        // input null olmadığı sürece işlem yapılır
        val age = input?.toInt()

        if (age != null && age >= 18) {
            println("Oy kullanabilirsiniz!")
        } else if (age != null && age < 18) {
            println("Oy kullanamazsınız!")
        } else {
            println("Geçerli bir yaş girmediniz.")
        }
    } catch (e: NumberFormatException) {
        println("Geçerli bir sayı girmediniz. Lütfen tekrar deneyin ")
    }


}


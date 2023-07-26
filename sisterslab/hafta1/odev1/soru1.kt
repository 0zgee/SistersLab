package com.example.sisterslab.hafta1.odev1
import java.util.Scanner


/* 1.Dışardan kullanıcı adı ve şifre girişi alınacak, girilen bu kullanıcı adı ve şifre önceden belirlenen kullanıcı
 adı ve şifreyle  eşleştirilecek. Kullanıcı adında büyük-küçük harf farkı göz ardı edilecek, ancak şifrede büyük-küçük
 harf farkı olması gerekmektedir. kullanıcı adı ve şifre daha önce belirlenen kullanıcı adı ve şifreyle uyuşuyorsa
 hoş geldiniz diyecek eşleşmiyorsa kullanıcı adı veya şifre hatalı uyarı verecek program yazılmalı
    */


fun main(args: Array<String>) {

    val dogruKullaniciAdi = "özge"
    val dogruSifre = "SiFre123"

    val scanner = Scanner(System.`in`)
    print("Kullanıcı adını giriniz: ")

    val kullaniciAdi = scanner.next().toLowerCase()

    print("Şifreyi giriniz: ")
    val sifre = scanner.next()

    if (kullaniciAdi == dogruKullaniciAdi && sifre == dogruSifre) {
        println("Hoş geldiniz!")
    } else {
        println("Kullanıcı adı veya şifre hatalı.")
    }
}
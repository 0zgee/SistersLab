package com.example.hafta2.odev2.soru6

/*

Kotlin, null-safety özelliği ile null referans hatalarını (NullPointerException) en aza indirir ve
programcıların null değerlerle çalışırken daha güvenli kodlar yazmasına yardımcı olur.
Kotlin'de, null-safety, bir değişkenin null değer alabileceği durumları açıkça belirtmenizi ve bu
durumları dikkate alarak kodunuzu yazmanızı gerektirir.

Null-safety özelliği Kotlin'de şu şekilde ifade edilir:
Bir değişken null olabilecekse, tipinin sonuna "?" işareti eklenir. Örneğin: String?, Int?, MyClass?

Bir değişken null olamazsa (null olmayan veya nullable olmayan değişken), tip normal olarak belirtilir.
Örneğin: String, Int…

Kotlin'de null değere sahip bir değişkeni kullanırken, derleyici sizden null kontrolü yapmanızı ister.
Bu sayede null değerlerle çalışırken dikkatli olmanız ve hataları önlemeniz kolaylaşır.


Null-safety'nin diğer programlama dilleriyle karşılaştırıldığında bazı avantajları şunlardır:

1-> Daha güvenli kod: Null-safety, null referanslar nedeniyle oluşan programlama
 hatalarının ve çökmelerinin önlenmesine yardımcı olur.
2-> Daha okunabilir kod: Null-safety, kodda null referansların açıkça belirtilmesi sayesinde daha
 okunabilir ve anlaşılır hale gelir.
3-> Daha sürdürülebilir kod: Null-safety, kodun daha sürdürülebilir olmasına yardımcı olur çünkü
null referanslar nedeniyle oluşan hatalara daha kolay müdahale edilebilir.


Null-safety özelliği sayesinde, NullPointerException hatası, programların en yaygın hatalarından biri
olan "null referans hatası" azaltılır ve programların daha güvenli hale gelmesi sağlanır. Bu nedenle,
Kotlin'in null-safety özelliği, dilin güvenli ve hatasız kod yazma imkanlarını artıran önemli bir
özelliktir.

*/

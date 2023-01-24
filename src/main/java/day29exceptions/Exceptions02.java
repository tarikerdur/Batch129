package day29exceptions;

public class Exceptions02 {

            /*
        "throw" ile "throws" keywordleri arasindaki fark nedir ? (interview question)
        1-  "throw" method body'si icinde, "throws" ise method parantezinden hemen sonra kullanilir.
        2-  "throw" method body'si icinde, istenilen yerde istenildigi kadar kullanilir.
            "throws" ise method parantezinden hemen sonra sadece bir kere kullanilabilir.
        3-  "throw"dan sonra "new" keyword ve "constructor" kullanilarak object olusturulur.
            "throws"dan sonra sadece Exception Class ismi yazilir.
        4-  "throw" belli sartlar icin Exception atmada kullanilir, "throws" ise application'i Exception attiktan sonra durdurur.

            */

    public static void main(String[] args) throws IllegalArgumentException { // ama burada cozum uretilmez. kod calismayi durdurur.

        try {
            printAge(-18); // method parantezine yazilan deger argument oluyor
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

            /*
        Belli sartlar altinda biz kendimi exception throw edebiliriz.
        Mesela kullanici negatif yas girerse java hata vermeyecegi icin
        exception throw etmesini biz javaya soylemis oluruz.

        Java gercek hayati bilmez. Biz burada tabiri caizse Java'ya age'in negatif olmayacagini soyledik.
                                                                "IllegalArgumentException"
            */
//        try {
//            getMark(-900);
//        } catch (IllegalArgumentException e){
//            System.out.println(e.getMessage());
//        }

        // try catch cozum uretir ( main methodun yaninda throws yazdik onun yanindaki notu da oku)

        getMark(-90);


    }
    //"throw" keyword bir methodun bodysi icinde istedigimiz yerde, istedigimiz kadar,
    // istedigimiz kosullar icin Exception throw etmemizi saglar.

    // "throw" keyword yazildiktan sonra bir Exception Class object'i olusturulur.
    // Exception Class constructorinin parantezi icine istediginiz Exception mesajini yazabilirsiniz.
    static void printAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        System.out.println(age);
    }

    // Ogrenci notlari girisi yapan ve notu consolea yazdiran bir method olusturunuz.
    static void getMark(double d) {
        if (d < 0) {
            throw new IllegalArgumentException("Marks cannot be less then zero");
        } else if (d > 100) {
            throw new IllegalArgumentException("Marks cannot be greater then hundred");
        } else {
            System.out.println(d);
        }
    }

}



package day01variables; //package ismi kucuk harflerden olusturulur. Asla buyuk harf yer almaz.

public class Variables01 {
    public static void main(String[] args) {

        /*
        Veriabe olusturuyoruz.
        Data typeini yaziniz.       veriable ismi yazin     assigment operator (=) yaz
        Data type + veriable name  ==> Veriable Declaration
        Assigment operator + veriable value ==> Assigment

        veriable declaration yapar assigment yapmazsak java kendi default deger koyar.
        Default degerler sayilar icin 0 (sifir)`dir.
                         String`de null`dir.
        */
        int age = 12; // access modifier koymadigimiz zaman bu otomatikmen default olur.

        // Ornek 1: ogrenci ismi icin veriable olusturup deger olarak Ali Can atayiniz
        String studentName = "Ali Can"; // Stringde assign cift tirnak icine yazilir.



        /*
        Data types in Java:
        1) Primitive data types (Stack Memory)                  2) Non-Primitive data types (Heap Memory)    3) Wrapping Class (Heap Memory)
                        1.1 - Numeric Primitive Data Types         String                                       Byte
    (1 byte yer kaplar)     1.1.1 - byte                                                                        Short
    (2 byte yer kaplar)     1.1.2 - short                                                                       Integer
    (4 byte yer kaplar)     1.1.3 - int                                                                         Long
    (8 byte yer kaplar)     1.1.4 - long (java hata verirse sonuna L ya da l koy)                               Float
    (4 byte yer kaplar)     1.1.5 - float =======> kesirli sayilar. sonuna f veya F konulur.                    Double
    (8 byte yer kaplar)     1.1.6 - double ======> kesirli sayilar                                              Character
                                                                                                                Boolean
                        1.2 - Non-Numeric Primitive Data Types
                            1.2.1 - char ========> tek karakterler return eder ' ' icine yazilir.
                            1.2.2 - boolean =====> true or false return eder
         */

        // Hangi data type memoryi daha az kullanirsa o data typeini kullanmak lazim.

        // Ornek 2: char data typeinda ilk ismin ilk harfi olarak bir veriable olusturun ve bir deger atayin.
        char isminIlkHarfi = 'A';

        // Ornek 3: boolean data type emekli misin diye sor false degerini assign et.
        boolean emekliMisin = false;

        // Ornek 4: byte data type ogrenci yasi yaz veriable ata.
        byte studentAge = 23;

        // Ornek 5: Site nufusu icin veriable olustur. Deger ata
        short siteNufusu = 1200;

        // Ornek 6: Ulke nufuslari icin bir veriable olustur deger ata
        int countryPopulation = 1864184648; // Cin nufusu

        // Ornek 7: insan vucudundaki hucre sayisi icin bir veriable olustur deger ata
        long cellNumberOfHumanBody = 234234234234L; /* long cok yer kaplayacagi icin java salagi bunu int kabul eder.
                                                    bu hatayi vermemesi icin sayinin yanina L ya da l harfi koyariz. */

        long weightOfSun = 1234567; // long`a atanan deger int siniri icinde ise hata vermez.


    }

}

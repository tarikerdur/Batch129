package day05typecastinstringmanipulations;

public class TypeCasting01 {

     /*
        Numeric data type'larin birbirine donusturulmesine TYPE CASTING denir.
        Numeric Data Types ==> byte < short < int < long < float < double

        AUTO WIDENING - EXPLICIT NARROWING
        Note 1: Kucuk data type'lerini buyuk data type'lerine cevirmeyi Java otomatik yapabilir. Buna AUTO WIDENING denir.

        Note 2: Buyuk data type'lerini kucuk data type'lerine cevirmek riskli bir istir Java bunu otomatik yapmaz.
        Bu islemi kod yazanlar yapar. Bu isleme EXPLICIT NARROWING denir. Bu islem veri kaybina yol acabilir.
     */

    public static void main(String[] args) {

        // byte data type'i int data type'a cevirin
        byte age = 13;
        int ageInt = age; // byte age'i int ageInt'in icine koyduk. (Auto Widening)

        // long data type'ini short data type'a ceviriniz.
        long weight = 234;
        short weightShort = (short) weight; /* long weight'i short weightInt'in icine
                                        JAVAYI ZORLAYARAK PARANTEZ ICINDE YAZARAK koyduk. (Explicit Narrowing) */

        // int datayi floata cast edin.
        int population = 700000;
        System.out.println(population);
        float populationFloat = population;
        System.out.println(populationFloat);

        // double datayi short'a cast edin.
        double a = 12.934;
        System.out.println(a); //12.934
        short b = (short) a;
        System.out.println(b); // 12

        // Dikkat
        /*
        Cast yaptigimiz sayi (260) donuseceginiz data type'inin sinirlari disinda ise
        Java kullandigimiz sayi ile mod islemi yapar ve mod isleminin sonucu bizim yeni degerimiz olur.
        byte -128 ~ 127 araligindadir 256 tane sayi degeri vardir.
        260/256 mod == 4 olur.
        260 ==explicit narrowing==> 4 oldu.
         */
        // Example 1:
        short num = 260;
        System.out.println(num); // 260
        byte numByte = (byte) num;
        System.out.println(numByte); // 4

        // Example 2:
        short n = 1023;
        System.out.println(n); // 1023
        byte nByte = (byte) n;
        System.out.println(nByte); // 255 yazmak yerine -1 yazmak Java icin daha kolaydir sonuc -1 yazar.
    }
}

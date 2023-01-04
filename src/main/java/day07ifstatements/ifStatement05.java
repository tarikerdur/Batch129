package day07ifstatements;

import java.util.Scanner;

public class ifStatement05 {
    public static void main(String[] args) {


//equals() METODU
//equalsIgnoreCase() METODU
        // Example 1: Haftanin ay isimlerini alip kacinci ay oldugunu yazdir
        Scanner input = new Scanner(System.in);
        System.out.println("Ay ismi girin");
        String month = input.next().trim(); // kullanici basinda/sonunda bosluk birakir diye trim() koydum.

        // String'lerde equals() methodu kullaniriz. Bu methodda (Java'da) buyuk kucuk harf hassasiyeti vardir.
        // Bu nedenle equalsIgnoreCase() metodu kullaniriz. Bu metodda buyuk kucuk harf hassasiyeti devre disi birakilir.

        if (month.equalsIgnoreCase("January")){
            System.out.println(1);
        } else if (month.equalsIgnoreCase("February")) {
            System.out.println(2);
        } else if (month.equalsIgnoreCase("March")) {
            System.out.println(3);
        } else if (month.equalsIgnoreCase("April")) {
            System.out.println(4);
        } else if (month.equalsIgnoreCase("May")) {
            System.out.println(5);
        } else if (month.equalsIgnoreCase("June")) {
            System.out.println(6);
        } else if (month.equalsIgnoreCase("July")) {
            System.out.println(7);
        } else if (month.equalsIgnoreCase("August")) {
            System.out.println(8);
        } else if (month.equalsIgnoreCase("September")) {
            System.out.println(9);
        } else if (month.equalsIgnoreCase("October")) {
            System.out.println(10);
        } else if (month.equalsIgnoreCase("November")) {
            System.out.println(11);
        } else if (month.equalsIgnoreCase("December")) {
            System.out.println(12);
        } else System.out.println("Invalid month name...");

        /*
        String'lerin esitliklerini kontrol ederken "==" yerine "equals()" kullaniriz.
                Niye???
                     Cunku; "stack" memory ve "HEAP" memory var. stack'te primitive datalar ve
                     non-primitivelerin adresleri (reference) vardir.
                     HEAP'te non-primitiveler, bizim olusturdugumuz classlar, wrapper classlar ve methodlar vardir.

                String s = "Tom"
                String t = "Tom"

                    s==t kullanirsak REFERENCE'leri ve DEGERLERI kontrol eder.
                        Ornegimizde degerleri aynidir. Ama referenceleri farklidir.
                        Bu yuzden "false" return eder. Kod yazarken reference bizi alakadar etmez.
                    Bu nedenle;
                    s.equals(t) kullanirsak Java SADECE DEGERE bakar.
                        Degerleri ayni oldugundan "true" return eder.
                        Kod yazarken bu bizim isimizi gorur.
         */
        String s = "Tom";
        String t = "Terry";
        String r = new String("Tom");
        String m = "Tom";

        System.out.println(s==t); // false. Cunku degerler ve reference farkli
        System.out.println(s.equals(t)); // false. Cunku degerler farkli


        System.out.println(s==r); // false. Cunku reference farkli. Cunku yeni bir adres var.
                                  // "new" keywordu ile Java'ya zorla yeni bir "Tom" olustur dedik.
                                  // bu yuzden adres farkli oldugundan false verdi.
        System.out.println(s.equals(r)); // true. Cunku equals() sadece degere bakti reference'i kontrol etmedi.


        System.out.println(s==m); // true. Java'ya "new" diyerek yeni bir kutu olustur diye zorlamakdik.
                                  // Boyle olunca Java zaten "Tom" diye bir kutucuk var diyerek
                                  // yeni bir adres olusturmaz. Var olan String'i kullanmaya devam eder.
        System.out.println(s.equals(m)); // true. Cunku equals() sadece degere bakti reference'i kontrol etmedi.


    }
}

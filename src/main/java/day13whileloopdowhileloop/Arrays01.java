package day13whileloopdowhileloop;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        /*
        IT'de yeni bir sey ogrenirken;
            i) "Ne? Nedir?" oldugunu ogren
            ii) "Neden var? Nicin var?" oldugunu ogren
            iii) "Simple Implementation - Basit Uygulama"
                 "Mid-Level Implementation - Orta Duzey Uygulama"
                 "Advance-Level Implementation - Ileri Duzey Uygulama"
                 "Project-Level Implementation - Proje Duzeyinde Uygulama"
            yapmak lazim.

            Piyasadakiler simple'da takilir. Siz simple-mid arasi levelde takilirsaniz ise girersiniz, dedi

         */


        int a = 12; // Bu yapinin icinde sadece bir tane data depolanabilir.
        /*
        Ama biz code yazarken bir yapinin icinde coklu data depolama ihtiyaci hissederiz.
        Bir yapinin icinde coklu data depolayabilmek icin Java "Array"leri olusturmustur.
        Array'ler coklu datayi bir variable icinde depolama imkani verir. Yeni data eklenince eskisi silinmez.

        Bir Array sadece bir data turunu kabul eder. String, int, boolean falan beraber koyamazsin.
        */


        // Array nasil olusturulur?
        String stdNames[] = new String[5];
        // Obje olusturur gibi olusturuyoruz.
        // Java ilk [] parantezini gorunce data tipi "String" ve ismi "stdNames" olan bir Array olusturdugumuzu anladi.
        // Array olustururken Java'ya data tipini ve esitligin sagindaki [] parantezin icine
        // kac eleman koyacagimizi soylememiz lazim. [5] --> 5 eleman koyacagiz demek oluyor.

        System.out.println(stdNames); // [Ljava.lang.String;@3ac3fd8b
        // [Ljava.lang.String;@3ac3fd8b ---> Java'nin stack memory'de heap memory icin olusturdugu referencedir.

        //Biz bu reference'i gormek icin :
        System.out.println(Arrays.toString(stdNames)); // [null, null, null, null, null]
        /*                                                  0     1     2     3     4 ---> Array'de indexler 0'dan baslar.
         "Arrays" classini import edip toString() methodu kullanilir.
         Bu method bu adresi alip bize yazdirir.
         Ancak bu java'nin arka planinda calisan bir sistemdir bunu bilmek zorunda degilsiniz.
         Ama bilirseniz artistlik olur.
        */

        // Array'e eleman ekleme nasil yapilir?
        stdNames[0] = "Cuneyt";
        stdNames[1] = "Kemal";
        stdNames[2] = "Ajda";
        stdNames[3] = "Ezel";
        stdNames[4] = "Besir";
        System.out.println(Arrays.toString(stdNames)); // [Cuneyt, Kemal, Ajda, Ezel, Besir]

        // Array'den spesific bir elemani almak:
        System.out.println(stdNames[2]); // Ajda


        // Example 1: Array'deki her elemani sonuna "!" isareti koyarak ekrana yazdiriniz.
        for (int i = 0; i < stdNames.length; i++) { // Array'lerde length methoduna parantez "()" koymadik dikkat et.
            System.out.print(stdNames[i] + " ! ");
        }

    }
}

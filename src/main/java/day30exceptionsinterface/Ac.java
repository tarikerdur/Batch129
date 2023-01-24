package day30exceptionsinterface;

public interface Ac {
        /*
             Interface ==> Birden fazla (multiple inheritence) parenta
             sahip olabilmek icin java tarafindan uretilen class type'idir.

             Interface Class demeyin. Dalga gecerler dedi. Interface, Interface'dir. CLASS DEGILDIR.

             "interface"lerin icine concrete method konulamaz. Cunku concrete methodlarda
             body vardir ve body o methodun isi nasil yapacagini belirtir. Isin nasil yapilacagi
             bir cok detay icerir ve bu Child Class'larda kafa karisikligina sebep olur.
             Halbuki sadece yapilmasi gereken isi soyleyip nasil yapilacagini Child'a birakirsaniz.
             Child Class'in kafa karisikligini engellemis olursunuz.

             interface'deki tum method'lar KENDILIGINDEN "public"tir, "abstract"tir. ("static" degil. DIKKAT ET!!!)*****
             interface'deki tum variable'lar KENDILIGINDEN "public"tir, "final"dir, "static"dir. ***********************
             Ekstra olarak yazmamiza gerek yoktur. "abstract" methodlar child'lar tarafindan "implement" (override)
             edilmek zorundadir.

             interface'lerde concrete method bulunamaz. (Abstract Class'ta concrete method olabilir). Dolayisiyla
             interface icindeki her sey child'lar tarafindan "implement" edilmek zorundadir.
             Interface tam bir diktatorluktur diyebiliriz.
             Bu yüzden interface'lere "to do list" derler.

             Coklu interface parent'larin her birinin icine ayni isimli methodlar koyabiliriz.
             Mesela Ac'nin, Engine'nin ve Security'nin her birinin iclerine "run()" methodu koymak gibi.
             Child class herhangi birini implement ettiginde hepsini implement etmis gibi olur.
             Sonra da body'i Child Class'da yazarak uygulamasini yapmis olur.
        */


    /*
       1)  Bir interface'i bir Class'in parent'i yapmak icin "implement" keyword'unu kullaniniz.
       Bir Class'i bir Class'in parent'i yapmak icin "extends" keyword'unu kullaniniz.

       2)  Java parent'lar "Class" oldugunda "multiple parent"a musade etmez.
       Ama biz bazen "multiple parent"a ihtiyac duyariz.
       Bu ihtiyaci gidermek icin Java "interface" ismini verdigi yeni bir yapi olusturdu.
       Bu yapi sayesinde bir "Class" icin coklu "interface" parent olusturabiliriz.
           */
    void cool();
    void run();

    public static final int price = 2000;
    String model = "Mitsubishi";






}

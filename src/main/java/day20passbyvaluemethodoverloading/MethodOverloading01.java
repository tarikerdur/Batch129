package day20passbyvaluemethodoverloading;

public class MethodOverloading01 {
    public static void main(String[] args) {
                /*
        Method overloading ayni isimde farkli isler yapan methodlardir.
        (overload (ENG) === asiri yuklenme (TR))

            Mesela subString() methodu 2 farkli sekilde calisabiliyor.
            Mesela replace() methodu 2 farkli sekilde calisabiliyor.
            Mesela startsWith() methodu 2 farkli sekilde calisabiliyor.
            Mesela lastIndexOf() methodu 4 farkli sekilde calisabiliyor. e.t.c.
        Burada method overloading olmus oluyor.

        Biz kendimiz method olustururken de method overloading yapabiliriz.


        1) Method overloading yaparken method ismi degistirilmez.
                Method ismi degisirse o zaten baska bir method olur.

        2) Method overloading yaparken parametreler degistirilir.
                    2.1) Parametre degistirirken parametrelerin data typelari degistirilebilir.
                    2.2) Parametre degistirirken parametrelerin yerleri degisebilir.
                (parametrelerin data typelari farkliysa parametrelerin yerini
                degistirmek mantiklidir yoska mantiksiz olur)
                    2.3) Parametre degistirirken parametrelerin sayisi degistirilebilir.

        3) Java icin ismi ve parametreleri ayni olan iki method tamamiyle aynidir.
                (Yapilan is sayisi ayni ise return type ister void ister int olsun java icin fark etmez.
                Return typelar bizim icin farklidir. Ama Java'ya gore yapilan is aynidir.)
                Bu yuzden method ismi ve parametresi "method signature" olarak adlandirilir.

        4) Method Overloading olustururken return type'i degistirmenin hicbir etkisi yoktur.
        5) Method Overloading olustururken access modifier'i degistirmenin hicbir etkisi yoktur.
        6) Method Overloading olustururken methodu static veya non-static yapmanin hicbir etkisi yoktur.
        7) Method Overloading olustururken method body'i yani {curly braces} degistirmenin hicbir etkisi yoktur.
        8) "private" methodlar overload edilebilir. Cunku method overloading sadece bir classin icinde olur.
                "private" olmak ise baska class'lara gidildiginde problem olusturur.
                ("private" sadece olusturuldugu class'a ozeldir.)
        9) "static" methodlar overload edilebilir.




            STATIC nedir ??
        "static" olan data types/methods olusturuldugu classla olusturulmus tum objelerde gorulur.
            Uzerinde yapilacak degisiklikler tum classlari/objeleri etkiler.
        "static" olmazsa sadece bulundugu classtakiler gorur/etkilenir.


                    (Class'lar object'lerin kalibidir. Object'ler Class'larin yansimasidir.
                    Mesela   --->   Scanner == Class         input == Object)
        Bir class baska bir classta obje olusturulurak kullanilirken static olan datalar o objelere gitmez.
        olusturuldugu yerde durur. ama baska classta da kullanilabilir. cunku static'tir.
        static olanlar classa yapistirilir. non-static olanlar objeye yapistirilir.
        static olanlar 1 kere olusturulur. non-static olanlar obje sayisi kadar olusturulur.
        Bir suru insan varsa insan sayisi kadar kafa vardir. Ama 1 tane ay vardir ve o Ay herkese aittir. gibi

        Gokteki Ay gibidir. Ay yerinde durur ama dunyanin her yerinden gorulur.
            Ama benim cebimdeki telefonu sadece ben kendim gorurum
            baskasinin gormesi icin baskalarina benim o telefonu gostermem gerekir.

         Obje olusturmadan non-static datalara ulasamayiz. cunku non-static objeye bagli obje de class'a baglidir.

         Birden fazla ayni isimde farkli is yapan method olursa
         Java hangi methodu kullanacagina nasil karar verir ?
             Java nerede daha az is yaparsa o methodu kullanir.
             Mesela asagida Auto Widening yapmaya gerek kalmayan ilk siradaki methodu java kullanir.

                */

        add(3, 5);


    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void add(double a, double b) {
        System.out.println(a + b);
    }

    public static void add(double a, int b) {
        System.out.println(a + b);
    }

    public static void add(int a, double b) {
        System.out.println(a + b);
    }

    public static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}

package day05typecastinstringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {
        String s = "Learn Java earn money";

        // Example 1: "s" String'inin "money" ile bitip bitmedigini kontrol ediniz.
        boolean isEnd = s.endsWith("money"); // ends with ... (ENG) ==> ... ile biter (TR)
        System.out.println(isEnd);// true

        // Example 2: "s" String'indeki "money" kelimesini "dollar" kelimesine ceviriniz.
        String s1 = s.replace("money","dollar"); // replace (ENG) ==> degistir (TR)
        System.out.println(s1); // Learn Java earn dollar        // target=degistirilcek kelime, replacement=yerine konan kelime

        // Example 3: "s" String'indeki "earn" kelimesini "win" kelimesine ceviriniz.
        String s2 = s.replace("earn","win");
        System.out.println(s2); // Lwin Java win money

        // Example 4: "s" String'indeki "a" harflerini "*" char'ina  ceviriniz.
        String s3 = s.replace('a','*'); // coklu karakterde "", tekli karakterde '' veya "" kullanilir.
        System.out.println(s3); // Le*rn J*v* e*rn money   // fakat ya ikisi de '' olmali ya da ikisi de "" olmalidir.

        // Example 5: "s" String'indeki "n" harflerini "XXX" char'ina  ceviriniz.
        String s4 = s.replace("n","XXX");
        System.out.println(s4); // LearXXX Java earXXX moXXXey

        // Example 6: "s" String'indeki butun "e" harflerini siliniz.
        // "Hicbir sey" char data type'inda yok bu yuzden replace() methodu kullanarak silme islemi yaparsaniz mutlaka "" kullaniniz.
        String s5 = s.replace("e","");
        System.out.println(s5); // Larn Java arn mony


        String t = "Ali 13 yasindadir!...";
        // Example 7: "t" String'indeki tum rakamlari yildiza ceviriniz.
        // Note: Bir grup datayi degistirmek icin replaceAll() kullanilir.
        String t1 = t.replaceAll("[0-9]","*"); // koseli parantez [] ==> "... ile ... arasindaki her sey" anlamina gelir.
        System.out.println(t1); // Ali ** yasindadir!...        [] yazim tarzina "Regular Expressions" (kisaltmasi: regex) kullanilir.


        /*
                Regex ~ Replacement iliskisi sudur: bir karakter yerine baska bir karakter yazdirmak icin kullanilir.
                Regex ornekleri:
                    1) Tum rakamlar ==> [0-9]
                    2) Tum kucuk harfler ==> [a-z]
                    3) Tum buyuk harfler ==> [A-Z]
                    4) Tum kucuk ve buyuk harfler ==> [a-zA-Z]
                    5) Tum harfler ve rakamlar ==> [a-zA-Z0-9]
                    6) Tum noktalama isaretleri ==> \\p{Punct}  -------  BUNU EZBERLE !!!!!!!!!
                    7) Tum sesli harfler ==> [aeiou]  ----------------   BUNU EZBERLE !!!!!!!!!
                         i) x, q, w harfleri ==> [xqw]    charlarin arasina tire koyarsan ...'dan ...'a kadar anlamina gelir.
                                                          bir sey koymazsan sadece o charlari (ayri ayri) regex yapar.


                    8) Kucuk harflerden farkli tum karakterler ==> [^a-z]   -------   ^ karakteri ==> "...'den farkli" anlamina gelir
                    9) Buyuk harflerden farkli tum karakterler ==> [^A-Z]
                    10) Tum harflerden farkli tum karakterler ==> [^a-zA-Z]



                   1) \\d    ==> tum rakamlar digit
                      \\D    ==> tum rakam disi character ler
                   2) \\w   ==> A->Z    a->z         0->9    _tum buyuk, kucuk harf ve rakamlar
                      \\W  ==> A->Z    a->z         0->9    _ disindaki hersey
                   3) \\s   ==> space tum bosluklar space
                      \\S   ==> space disindaki hersey


         */

        // Example 8) "t" String'indeki tum rakamlari ve harfleri "!"'e ceviriniz.
        String t2 = t.replaceAll("[a-zA-Z0-9]","!");
        System.out.println(t2); // !!! !! !!!!!!!!!!!...

        // Example 9) "t" String'indeki tum sesli harfleri "?"'e ceviriniz.
        String t3 = t.replaceAll("[aeiouAEIOU]","?");
        System.out.println(t3); // ?l? 13 y?s?nd?d?r!...

        // Example 10) "t" String'indeki kucuk harfler disindaki tum karakterleri "<>"'e ceviriniz.
        String t4 = t.replaceAll("[^a-z]","<>");
        System.out.println(t4); // <>li<><><><>yasindadir<><><><>

        // Example 11) "t" String'indeki tum harfler disindaki tum karakterleri "+"'ya ceviriniz.
        String t5 = t.replaceAll("[^a-zA-Z]","+");
        System.out.println(t5); // Ali++++yasindadir++++

        // Example 12) "t" String'indeki tum space (bosluk)lar disindaki tum karakterleri "+"'a ceviriniz.
        String t6 = t.replaceAll("[^ ]", "+");
        System.out.println(t6); // +++ ++ ++++++++++++++

        // Example 13) "t" String'indeki sesli harfler DISINDAKI tum karakterleri "&"'e ceviriniz.
        String t7 = t.replaceAll("[^AEIOUaeiou]","&");
        System.out.println(t7); // A&i&&&&&a&i&&a&i&&&&&


    }
}

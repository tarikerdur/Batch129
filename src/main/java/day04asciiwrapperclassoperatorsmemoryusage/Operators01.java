package day04asciiwrapperclassoperatorsmemoryusage;

public class Operators01 {


        /*
             1) +,-,/,* islemleri Java'da matematikte kullanildigi gibi kullanilir.
             Note 1: int/int ==> int olur.
             Note 2: double/ {veya +,-,* islemleri} int ==> double olur. (hangisi buyukse sonuc onun tipinden olur)

             2) Java'da mantik "logical operator"lar vardir. "ve/and", "veya/or" logical operator'lardir. Sonucu true/false dondurur.
             ve/and ==> &&
             veya/or ==> ||
             not operator'u ==> "!" degili/tersi anlamina gelir. Mesela "!true = false" olur gibi.

             3) Comparison (Karsilastirma) Operators
             < kucuktur
             > buyuktur
             <= kucuk esittir
             >= buyuk esittir
             == esittir (Java'da tek esittir atama operatorudur. karsilastirma degil)
             != esit degildir
                Note: Karsilastirma operatorleri kullanildiginda kesinlikle boolean return eder.

         And islemi icin "&&" kullanilir ama sadece "&" kullanim da gecerlidir. Java'da teamul olarak && kullanilir.
            Farklari nedir?
                "&&" kullanim ilk ifade false oldugunda digerlerini kontrol etmez dolayisiyla hizli calisir.
                "&" kullanim ilk ifade ne olursa olsun digerlerini kontrol eder dolayisiyla yavas calisir.
                Bu yuzden hep "&&" seklinde kullanilir.
         */



        public static void main(String[] args) {

            boolean first = 3<5; // ture
            boolean second = 2 + 3 != 5; // false
            boolean third = 2+3*5>=19; // false

            System.out.println(first + " - " + second + " - " + third ); // ture - false - false
            System.out.println(first && second); // false
            System.out.println(first || second || third); // true

        }

}

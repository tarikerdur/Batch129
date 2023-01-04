package day09incrementdecrementternaryswitch;

public class IncrementDecrement01 {
    public static void main(String[] args) {

                /*
        Variable'a verilen deger sonradan arttirilmak ya da azaltilmak istenebilir.
        Increment ve decrement bu ise yariyor.

        pre ===> once
        post ==> sonra

        pre-increment ==> once arttirip atama yap sonra kullan
        post-increment --> once kullan sonra arttirip atama yap

        pre-decrement ==> once azaltip atama yap sonra kullan
        post-decrement --> once kullan sonra azaltip atama yap
                */

        // increment 1: ==> toplamayla arttirma
        int a = 5;
        a = a + 2;
        System.out.println(a); // 7
        a += 2;
        System.out.println(a); // 9

        // Example 1: Bir tane int variable olustur ve degerini 5 arttir.
        int b = 10;
        System.out.println(b); // 10
        b = b + 5;
        System.out.println(b); // 15
        b += 5;
        System.out.println(b); // 20


        // Decrement ==> azaltma
        int c = 8;
        System.out.println(c); // 8
        c = c - 3;
        System.out.println(c); // 5
        c -= 2;
        System.out.println(c); // 3


        // increment 2: ==> carpmayla arttirma
        int d = 6;
        System.out.println(d); // 6
        d = d * 2;
        System.out.println(d); // 12
        d *= 2;
        System.out.println(d); // 24


        // decrement 2: ==> bolmeyle azaltma
        int e = 24;
        System.out.println(e); // 24
        e = e / 2;
        System.out.println(e); // 12
        e /= 2;
        System.out.println(e); // 6


        // "1" ile increment
        int f = 12;
        f = f + 1;
        f++; //==> 1 arttirma yaparken boyle yapin diger yollarla degil, dedi

        // "1" ile decrement
        int h = 10;
        h -= 1;
        h--; //==> 1 azaltma yaparken boyle yapin diger yollarla degil, dedi


        //"post-increment" ve "pre-increment"
        int i = 10;
        int k = i++; // post increment. cunku variablein isminden SONRA yazildi.
        System.out.println(k); // 10 ==> once degeri aldi k'ya koydu. sonra i'yi arttirdi.
        System.out.println(i); // 11

        int m = 15;
        int n = ++m; // pre increment. cunku variablein isminden ONCE yazildi.
        System.out.println(n); // 16 ==> once m'nin degerini arttirdi sonra atadigi degeri n'nin icine atadi.
        System.out.println(m); // 16

        // "post-decrement" ve "pre-decrement"
        int p = 17;
        int r = p--; // post decrement. cunku variablein isminden SONRA yazildi.
        System.out.println(r); // 17 ==> once degeri aldi i'ye koydu. sonra p'yi azaltti.
        System.out.println(p); // 16

        int s = 20;
        int t = --s; // pre decrement. cunku variablein isminden ONCE yazildi.
        System.out.println(t); // 19 ==> once s'nin degerini azaltti sonra atadigi degeri t'nin icine atadi.
        System.out.println(s); // 19


    }
}

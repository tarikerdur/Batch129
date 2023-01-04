package day16multidimensionalarrays;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {

        /*
        Array'lerin element'leri (elemanlari) de Array'lerden olusuyorsa buna "Multi Dimensional Array" denir.
        Ic ice array olusturulabilir.
        */


        // Multi Dimensional Array nasil olusturulur?
        int a[][] = new int[3][2]; // ilk koseli parantez Outer Array'i ikinci koseli parantez Inner Array'i temsil eder.
        // [[0, 0], [0, 0], [0, 0]]  ===>  Bu kodla beraber Java tarafindan boyle bir array olusturuldu.

        // Multi Dimensional Array'ler nasil yazdirilir? deepToString() ==> DIBINE KADAR YAZDIRMAK ISTIYORUZ ==> DEEP
        System.out.println(Arrays.toString(a)); // [[I@3ac3fd8b, [I@5594a1b5, [I@6a5fc7f7]
        System.out.println(Arrays.deepToString(a)); // [[0, 0], [0, 0], [0, 0]]


        // Multi Dimensional Array'lere nasil eleman eklenir?
        a[0][0] = 5; // indeksi 0 ve 0 olan elemani 5 yaptik.
        a[1][1] = 45; // indeksi 1 ve 1 olan elemani 45 yaptik.
        a[2][0] = 123; // indeksi 2 ve 0 olan elemani 123 yaptik.
        a[0][1] = 12; // indeksi 0 ve 1 olan elemani 12 yaptik.
        a[1][0] = 81; // indeksi 1 ve 0 olan elemani 81 yaptik.
        a[2][1] = 0; // indeksi 2 ve 1 olan elemani 0 yaptik. (Assign yapmasaydik da default olarak 0 olurdu)
        System.out.println(Arrays.deepToString(a)); // [[5, 12], [81, 45], [123, 0]]


        /*
        Note : Array'lere non-primitive data konulamaz.

        Arraylerin icindeki String gibi Array gibi non primitive elemanlarin kendileri degil, reference'lari bulunur.
        Esasinda reference'lar non primitive olmadigi icin Array'lere non primitive data konulamaz, diyebiliriz.
        Arraylere primitive data veya reference konulur.

        Biz bir Array'i yazdirmak istedigimizde Java adresler yardimiyla non primitive dataya ulasir
        ve o non Primitive datayi sanki Array'in icindeymis gibi gosterir.
        */


        // Multi Dimensional Array'lerdeki belli elemanlara nasil ulasilir?
        // [[5, 12], [81, 45], [123, 0]] ===> hedefimiz sadece [123, 0]'i yazdirmak
        System.out.println(Arrays.toString(a[2])); // [123, 0]
        // inner arraylerin elemanlarini istemedigimiz icin deepToString kullanmiyoruz.

        // 81'i yazdiralim yani inner arraylerden bir eleman yazdircaz
        System.out.println(a[1][0]); // 81
        // yazdirmak istedigimiz eleman "int" oldugu icin yani primitive oldugu icin sout'in icine koymamiz yeterli.
        // cunku int zaten stack memoryde bulunur yani reference'iyla bulunacak bir data degil.
        // toString() kullanmamiza gerek yok.

        System.out.println(Arrays.toString(a[0])); // [5, 12] ==> elemanimiz Array yani non primitive oldugu icin toString kullaniyoruz.
        System.out.println(a[0][1]); // 12 ==> aradigimiz eleman zaten int yani primitive oldugu icin
        // toString() ile referanstan dataya ulasmaya gerek yok.
        System.out.println(a[2][1]); // 0 ==> aradigimiz eleman zaten int yani primitive oldugu icin
        // toString() ile referanstan dataya ulasmaya gerek yok.


    }
}

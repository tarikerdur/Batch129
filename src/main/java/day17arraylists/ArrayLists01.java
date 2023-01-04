package day17arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayLists01 {
    public static void main(String[] args) {

        /*
                Listler gelismis yapilardir
                Arrayler gelismemis fakir yapilardir

                                ARRAY LIST'LER NEDIR ?
                Array List'ler coklu data depolamak icin kullanilir.
                Array'ler de   coklu data depolamak icin kullanilir.

                Array List'ler non primitive data type'indaki coklu datalari depolamak icin kullanilir.
                Fakat Array'lere non primitive konulmaz. primitive ve reference konulur.

                                ARRAY LIST'LER NEDEN VAR ?
                Array List'leri olustururken icine koyacagimiz ELEMAN SAYISINI basta soylemek zorunda degiliz.
                Bu yuzden Array List'ler "flexible"dir. (Ben List diyince Array list oldugunu anlayin, dedi.)
                Fakat Array'lerde elemanlarin DATA TYPE'INI ve ELEMAN SAYISINI soylemek zorundayiz.

                Madem "Array"ler eleman sayisinda flexible degil nicin Java Array'leri iptal etmiyor ?
                     i) Eleman sayisi belli olan datalari depolamak icin Arrays tercih edilir. (Haftanin gunleri gibi)
                     ii) Arrays cok hizli calisir. (Super fast)
                     iii) Arrays Memory'de cok az yer kaplar.
        */

        // Array List nasil olusturulur ?
        ArrayList<Integer> ages = new ArrayList<>();
        // Class    + data type + name +   =  + "new" ==> keyword   +  constructor
        System.out.println(ages); // []


        // List'lere element nasil eklenir ?
        // List'e eleman eklemek icin add() methodunu kullaniriz.
        // add() methodu elemanlari bizim verdigimiz sirada List'e ekler.
        // Buna Java'da "Insertion Order" denir.
        ages.add(9); // index yazip virgul koymazsan en sona eklenir
        ages.add(12);
        ages.add(10);

        ages.add(1, 656); // bu method da index 1'i bulur ve 656'yi index 1'e koyar.
        ages.add(3, 777); // bu method da index 3'u bulur ve 777'yi index 3'e koyar.
        ages.add(888); // en sona ekleme yapmak istedigimiz icin index girmeye gerek yok.
        System.out.println(ages); // [9, 656, 12, 777, 10, 888]

        // List'e coklu eleman nasil eklenir ? veya List'e baska bir List nasil eklenir ?
        // Bir "List"e coklu eleman eklemek icin, o elemanlari once bir List'in icine koymalisiniz.
        ArrayList<Integer> newAges = new ArrayList<>();
        newAges.add(8); // index yazip virgul koymazsan en sona eklenir
        newAges.add(9);
        newAges.add(10);

        ages.addAll(newAges); // add (ENG) ==> ekle (TR) --- All (ENG) ==> Hepsi (TR)
        ages.addAll(2, newAges); // 2. indekse de ages list'i ekledik.
        System.out.println(ages); // [9, 656, 8, 9, 10, 12, 777, 10, 888, 8, 9, 10]


        // List'teki tum elemanlar nasil silinir ?
        ages.clear(); // clear() methodu List'teki tum elemanlari siler.
        System.out.println(ages); // []
        // clear() methodu tum listeyi siler. (clear() methodu KATLIAM YAPAR ESPIRISI YAPTI)
        // remove() methodu sadece istenen datayi siler.


        // Bir elemanin List'te var olup olmadigini nasil kontrol ederiz ?
        // contains() methodu bir elemanin list'te var olup olmadigini kontrol eder.
        boolean r = ages.contains(656);
        System.out.println(r); // true donmesi lazim ama ust satirda clear() kullandigimiz icin false dondu.


        // Bir List'in baska bir List ile ayni olup olmadigini nasil kontrol ederiz ?
        // equals() methodu
        ArrayList<String> names1 = new ArrayList<>();
        names1.add("Tom");
        names1.add("Jim");
        names1.add("Kim");

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Tom");
        names2.add("Kim");
        names2.add("Jim");
        // Iki List'in ayni olmasi icin ayni indexteki elemanlarin ayni olmasi lazim.
        // names1'de 1. ve 2. index ile names2'de 1. ve 2. indexteki elemanlar farkli yerlerde oldugu icin false return etti.
        boolean s = names1.equals(names2);
        System.out.println(s); // false


        // Example 1 : Verilen iki Integer List'te tamamiyla ayni
        // elemanlarin olup olmadigini kontrol eden kodu yazin.
        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(8);
        nums1.add(10);
        nums1.add(9);

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(8);
        nums2.add(9);
        nums2.add(10);

        Collections.sort(nums1); // bu kod tum elemanlari kucukten buyuge dizdi
        Collections.sort(nums2); // bu kod tum elemanlari kucukten buyuge dizdi
        // Eger kucukten buyuge siralamazsak equals() false doner. Hatali sonuc aliriz.
        boolean t = nums1.equals(nums2);
        System.out.println(t); // true ==> yani iki list'te de tum elemanlar ayniymis.


        // Collection  ==> Coklu datayi bir araya toplamaya yarar.
        // Bu yuzden Collections'a gidip List'ler icin calistirip kullanabiliriz.

    }
}

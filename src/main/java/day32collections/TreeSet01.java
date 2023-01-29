package day32collections;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet01 {
    public static void main(String[] args) {

        long one = System.nanoTime(); // calistirdigimiz andaki milisecond'i bize soyleyecek

        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(12);
        ts.add(25);
        ts.add(8);
        ts.add(32);
        ts.add(3);
        System.out.println(ts); // [3, 8, 12, 25, 32] ---> natural ordera gore siraladi

        long two = System.nanoTime();

        HashSet<Integer> hs = new HashSet<>();
        hs.add(12);
        hs.add(25);
        hs.add(8);
        hs.add(32);
        hs.add(3);
        TreeSet<Integer> hts = new TreeSet<>(hs);
        System.out.println(hts);
        //System.out.println(hs); // [32, 3, 8, 25, 12] ---> random siraladi

        long three = System.nanoTime();

        System.out.println("TreeSet'in uygulama suresi : " + (two - one));
        System.out.println("HashSet'in uygulama suresi : " + (three - two));

            /*
        Note :  TreeSet eleman eklemede coook yavas, HashSet ise coook hizlidir.
             TreeSet'in bu negatif yonunden kurtulmak icin;
             HashSet olusturur elemanlari ekler ve sonra HashSet'i TreeSet'e ceviririz.
            */

        int first = ts.first(); // bize ilk elemani return eder.
        System.out.println(first); // 3

        int last = ts.last(); // bize son elemani return eder.
        System.out.println(last); // 32

        int floor1 = ts.floor(15); // floor == zemin
        System.out.println(floor1); // 12 -- floor methodu verdigimiz degerin bir kucugunu bize return eder.

        // floor() methodu verdigimiz deger varsa onu, eger yoksa verdigimiz elemandan bir oncekini verir.
        int floor2 = ts.floor(12); // floor == zemin
        System.out.println(floor2); // 12 -- floor methoduna verdigimiz deger TreeSet'te bulunuyorsa bize onu return eder.

        int ceiling1 = ts.ceiling(15);
        System.out.println(ceiling1); // 25 ==> 15 elemanlardan biri degil o yuzden 15'ten bir sonraki elemani yazdirdi.

        // ceiling() methodu verdigimiz deger varsa onu, eger yoksa verdigimiz elemandan bir sonrakini verir.
        int ceiling2 = ts.ceiling(25);
        System.out.println(ceiling2); // 25 ==> 25 elemanlardan biri o yuzden 25 direkt yazdirildi.


        SortedSet<Integer> tailSet1 = ts.tailSet(12);
        System.out.println(tailSet1); // [12, 25, 32] --> tailSet'te bizim verdigimiz elemani ve buyuklerini bize return eder.

        SortedSet<Integer> tailSet2 = ts.tailSet(15);
        System.out.println(tailSet2); // [25, 32] --> tailSet'te bizim verdigimiz eleman yoksa buyuklerini bize return eder.

        NavigableSet<Integer> tailSet3 = ts.tailSet(12, false); // inclusive (ENG) --> dahil (TR)
        // false diyerek verdigimiz eleman dahil olmadan return et dedik.
        System.out.println(tailSet3); // [25, 32]

        SortedSet<Integer> headSet1 = ts.headSet(12); // 12 elemanlardan biri "onceki elemanlar" bir Set icinde yazdirildi. 12 yazdirilmadi.
        // inclusive default olarak false kabul etti.
        System.out.println(headSet1); // [3, 8]


        SortedSet<Integer> headSet2 = ts.headSet(12,true);
        System.out.println(headSet2); // [3, 8, 12]

        // Generic Method : Normal methodlar parametrelerde belirtilen data type'lari ile calisirlar.
        // Generic Methodlar ise verilen her turlu data type ile calisma becerisine sahiptirler.
        Integer higher1 = ts.higher(12); // 12'den bir sonraki elemani verir
        System.out.println(higher1); // 25

        Integer lower1 = ts.lower(12); // 12'den bir oncekini verir.
        System.out.println(lower1); // 8






    }
}

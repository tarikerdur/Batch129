package day34mapsiterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {
    public static void main(String[] args) {


            /*
        Iterators'lar looplarin yaptigi islemi yapar.
        Loop --> elemani alir isleme sokar eleman bitince loop break olur.
        Iterator --> elemani alir isleme sokar eleman bitince loop break olur.

            o zaman neden loop ve iterators diye ayri yapilar var ?
        Loop'lar infinite loop'a girebilir. Loop infinite olursa app p0 (priority 0 [en onemli seviye]) olur. Memory dolana kadar bekler.
        Iterators'da infinite soz konusu olmaz.
            Java Loop'lari eskiden olusturmustur. Iterator yeni bir yapidir. Her programlama dilinde de iterator yoktur.

            Hocanin ozeti :
        Iterator'lar Loop'ların yaptığı işi yapar. Iterator'lar tıpkı loop'larda olduğu gibi elemanı alarak işleme sokar.
        Java'nın Iterator'ları ortaya çıkarma sebebi infinite loop riskini bitirmektir.
        Iterator'larda sonsuz loop yoktur. Iterator'lar Java tarafından sonradan oluşturulmuştur.
        Loop'ların yaptıkları bütün işlemleri yapabilirler.
        Loop'lar ile Iterator'larin performans farki yoktur. Ama Iterator'lar eleman sile ve update etmede daha basarilidirlar.

            Java has two type Iterators :
                1)  Iterator : Sadece elemanlari remove edebiliriz.
                               Sadece soldan saga calisir. (for each loop da soldan saga calisir)
                2)  ListIterator : Eleman "remove", "update" ve "add" yapabilirsiniz.
                                   Hem soldan saga hem de sagdan sola calisabilir. Yani cift yonludur.


        Iterator'larin update etme ozelligi olmadigi icin degistirilmesini istemedigimiz datalari bu sekilde kullanabiliriz.
            */


        List<String> list1 = new ArrayList<>();
        list1.add("Ali");
        list1.add("Can");
        list1.add("Aliye");
        System.out.println(list1); // [Ali, Can, Aliye]

        Iterator<String> itr1 = list1.iterator(); // List'i Iterator'a cevirdik.

        while (itr1.hasNext()) { // hasNext(), iterator'da bulundugu yerden sonra eleman varsa true doner.

            itr1.next(); // next(), 1) pointerin bulundugu elemani bize return eder.
            // 2) pointeri bir sonraki elemanin onune koyar.

            itr1.remove(); // remove(), next() methodunun verdigi elemani imha eder.
        }

        System.out.println(list1); // []


        // Example 1 :
        List<String> list2 = new ArrayList<>();
        list2.add("Ali");
        list2.add("Can");
        list2.add("Aliye");
        System.out.println(list2);

        ListIterator<String> listItr = list2.listIterator();

        while (listItr.hasNext()) {
            String el = listItr.next(); // elemani verecek.
            listItr.set(el + "!"); // ustte aldigimiz elemani update edecez.
        }
        System.out.println(list2);


        // Example 2 :
        List<String> list3 = new ArrayList<>();
        list3.add("Ali");
        list3.add("Can");
        list3.add("Aliye");
        System.out.println(list3);

        System.out.println();

        ListIterator<String> listItr2 = list3.listIterator();

        // asagidaki loop "pointer"i en saga almak icin yazildi.
        while (listItr2.hasNext()){
            listItr2.next(); // pointeri ilerletmek icin bunu kullaniyoruz. bu loop bittiginde pointer en sona gitmis oluyor.
        }

        // asagidaki loop elemanlari en sondan en basa dogru yazdirmak icin yazildi.
        while (listItr2.hasPrevious()){ // pointerdan once eleman oldugu surece calisacak.
            String el = listItr2.previous(); // pointeri dogru goturur ve elemani bize verir.
            System.out.println(el + " <==");
            listItr2.set(el + "*");
        }

        System.out.println(list3);

    }
}
package day31collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet01 {
    public static void main(String[] args) {
            /*

            Bir Collection, "Set" ise tekrarli element barindirmaz.

            Iterable (interface) --> Collection (interface) --> Set (interface) --> HashSet (Class)
            Collection parent'i coklu data depolamak icin kullanilir.
            Dolayisiyla Child'lar da farkli senaryolarda coklu depolamalarda kullanilir.

            "Hash" bir technique'dir. (Hashing Technique) Java bunu kullanarak unique (benzersiz) hashcode'lar uretir.
            Data'lar benzer olabilir ancak hascode'lar hep unique'dir.

            "Set" --> IT'de tekrarsiz data depolamak icin kullanilan bir Collection'dir.
            "Set" tekrar kabul etmez. yani tekrarsiz verileri depolamak icin kullanilir.
                    "Set" 3'e ayrilir
                    1) HashSet : a) Super fast. Cunku verdigimiz elemanlari siralamak icin zaman kaybetmez.
                                 Yani HashSet'lere eklenen elemanlar rastgele siralanirlar.
                                 b) HashSet'ler tekrarli elemana musade etmezler.
                                 c) HashSet'ler null'i eleman olarak kabul ederler. 1'den fazla null kabul etmez. Tekrar olmasin diye.

                    2) LinkedHashSet :  a) LinkedHashSet elemanlari "insertion order"a gore dizer. (insertion order == Girdigimiz siraya gore)
                                        b) LinkedHashSet elemanlari siralamakta zaman kaybettigi icin HashSet'e gore yavastir.
                                        c) LinkedHashSet'ler tekrarli elemana musade etmezler.
                    3) TreeSet : a) "TreeSet" elemanlari "natural order"a gore dizer. (natural order == Alfabetik siralama || kucukten buyuge)
                               IT'de Tree kelimesi gorunce natural order akliniza gelsin, dedi.
                                 b) TreeSet "natural order" order yaparken cok zaman harcar bu yuzden en yavas "Set"tir.
                                 c) TreeSet'ler tekrarli elemana musade etmezler.
            */
        HashSet<Integer> hs = new HashSet<>();
        hs.add(12);
        hs.add(234);
        hs.add(78);
        hs.add(5);
        System.out.println(hs); // [5, 234, 12, 78] ---> HashSet'te rastgele kafasina gore siraladi.
        System.out.println(hs.hashCode());// 329 --> unique hascode'umuz. ama bu hashset container'imizin hashcodu.
        // icindeki elementlerin bireysel uniquelari degil

    }
}

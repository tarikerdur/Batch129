package day34mapsiterators;

import java.util.Hashtable;

public class HashTable01 {
    public static void main(String[] args) {

        /*
            1)  HashTable "thread-safe" ve "synchorized"dir.
            2)  HashTable entry'leri rastgele siralar.
            3)  HashTable'lar HashMap'lere gore daha yavastirlar.
            4)  HashTable'lar "key"lerde ve "value"larda "null" kullanilmasina musade etmezler.

            Note :  i) Multi Thread ve synchorization kullanmaniz gerekirse,
                    ii) key ve value'larda null kullanmak yasak ise
                 HashTable kullanmak gerekir.
        */

        Hashtable<Integer, Integer> ht = new Hashtable<>();

        ht.put(1,2); // 1 ve -1, 1'i tam boler.
        ht.put(2,4); // 1, -1, 2, 2 ;  2'yi tam boler.
        ht.put(6,8);
        System.out.println(ht);




    }
}

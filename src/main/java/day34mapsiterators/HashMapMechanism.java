package day34mapsiterators;

import java.util.HashMap;

        /*
                        HashMap calisma mechanism'i interview'lerde sorarlar, dedi.

            1)  Biz "HashMap" olusturmak icin "HashMap<String , Integer > hm = new HashMap<>();" kodunu yazdigimizda Java
                16 tane "Bucket (kova)" olusturur ve bu Bucket'lari 0'dan 15'e kadar indexler.
            2)  Biz entry eklemek icin "hm.put("Istanbul",17000000);" kodunu yazdiginizda Java;
                    i) "key" icin "hashCode" uretir.
                    ii) "hashCode"u 16'ya boler.
                    iii) Kalani index olarak kullanip, index'i kalana esit olan bucket'a bu entry'i yerlestirir.
                    iv) Bucket'a "entry" ekleneirken Java o bucket'in icinde "LinkedList" yapisini kullanir.

        */

public class HashMapMechanism {
    public static void main(String[] args) {

        HashMap<String , Integer > hm = new HashMap<>();
        hm.put("Istanbul",17000000);
        hm.put("Miami",5000000);
        hm.put("Moscow",1800000);
        hm.put("New Delhi",30000000);

        System.out.println(hm);



    }
}

package day33maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMaps01 {
    public static void main(String[] args) {
            /*
        Map'lerde key(at left)'ler unique,
        value(at right)'ler repeatedly olabilir.
        Map bir data structor'dir.

        1)  Map'ler "USA = 400,000,000" seklinde data depolamamiz gerektiginde kullanilir.
        2)  "USA = 400,000,000" datasinin "USA" kismi "key" olarak adlandirilir ve "key"ler "unique"dir.
        3)  "USA = 400,000,000" datasinin "400,000,000" kismi "value" olarak adlandirilir ve "value"lar tekrarli olabilir. (repeatedly)
        4)  Map'lerde store edilen her bir data'ya "Entry" denir. "Element / Eleman" denmez.
        5)  Entry'ler "unique"dir cunku "key" kisimlari unique oldugundan her bir entry digerlerinden farklidir.

        6)  "HashMep" cok hizlidir. Cunku "HashMap"ler "entry"leri siralamak ile ugrasmazlar. Random yerlestirir.
        7)  "HashMap"lerde bir tane "key"i "null" yapabilirsiniz. Baska null yapamazsiniz cunku unique olmasi lazim.
        8)  "HashMap"lerde birden fazla "value"yu "null" yapabilirsiniz. Cunku value'lar repeatedly olabilir.
        9)  "HashMap"ler "multi-thread" icin kullanilamaz ve "synchronization" yoktur.
            */

        // HashMap nasil olusturulur ?
        HashMap<String, Integer> hm = new HashMap<>();
        System.out.println(hm); // {}

        // HashMap'lere nasil entry eklenir ?
        hm.put("USA", 400000000);
        hm.put("Germany", 83000000);
        hm.put("Albania", 3000000);
        // Ayni key'i kullanarak yeni bir entry eklersek var olan entry'nin value'sunu update etmis oluruz. List'lerdeki set() methodu gibidir.
        hm.put("Albania", 2800000);
        hm.put(null, 1200000);
        hm.put(null, 1800000); // 12, 18 oldu.
        hm.put("Myanmar", null);
        hm.put("Bhutan", null);
        System.out.println(hm); // {null=1800000, Myanmar=null, USA=400000000, Bhutan=null, Germany=83000000, Albania=2800000}

        // HashMap'lerde sadece "key"leri almak istiyorum.
        Set<String> hmKeys = hm.keySet();
        System.out.println(hmKeys); // [null, Myanmar, USA, Bhutan, Germany, Albania]

        // HashMap'lerde sadece "value"lari almak istiyorum.
        // Example 1 : hm Map'indeki ulkelerin toplam nufusunu bulunuz.
        Collection<Integer> hmValues = hm.values();
        int sum = 0;
        for (Integer w : hmValues) {
            if (w != null) {
                sum += w;
            }
        }
        System.out.println(sum);

        // HashMap'lerde belirli bir "Key"in "value"sunu nasil alabiliriz ?
        Integer usaPopulation = hm.get("USA");
        System.out.println(usaPopulation); // 400000000

        // HashMap'lerde replace() var olan bir "key"nin "value"sunu degistirmeye yarar ?
        hm.replace("Bhutan", 350000000);
        System.out.println(hm);

        // absent == yoksa --- putIfAbsent == Map'te yoksa ekle
        hm.putIfAbsent("USA", 700000);
        hm.putIfAbsent("India", 700000);
        System.out.println(hm);

        // Example 2 : Yeni ogretmenin maasi standart ucret (Standart : 10000)ten 1000 TL fazla eski ogretmenin maasi standart ucretten 2000 TL fazla olsun.
        HashMap<String, Integer> salaries = new HashMap<>();
        salaries.put("Ali", 8000);
        salaries.put("Ayse", 5000);
        salaries.put("Veli", 9000);
        salaries.put("Tom", 9900);

        String teacherName = "Tom"; // "Kemal"

        if (salaries.keySet().contains(teacherName)) {
            salaries.put(teacherName, 12000);
        } else {
            salaries.putIfAbsent(teacherName, 11000);
        }
        System.out.println(salaries); // {Tom=9900, Veli=9000, Ayse=5000, Kemal=11000, Ali=8000}
        // {Tom=12000, Veli=9000, Ayse=5000, Ali=8000}

        // replace("USA",400000000,500000000); methodu key USA ve value 400,000,000 ise value'u 500,000,000 yapar.
        hm.replace("USA", 400000000, 500000000);
        System.out.println(hm);

        // getOrDefault() olan "key"lerin degerini verir olmayan "key"ler icin de bizim 2. parametreye yazdigimiz degeri verir.
        Integer r = hm.getOrDefault("Bhutan", 0);
        System.out.println(r);

        // Map'i, Set'e cevirdigimizde "Set"in tum ozelliklerini kullanabiliriz. Mesela loop gibi...
        // entrySet() methodu kullandigimizda elde ettigimiz Set'in elemanlari <Map.Entry <String, Integer>
        // seklinde "Map data type'li bir Set" olur.
        // Bu yuzden elemanlar icin Map method'lari kullanilabilir.
        Set<Map.Entry<String, Integer>> myEntries = hm.entrySet(); // Set'lerin methodlarini kullanabilmek icin
        // mesela for each loop collectionlarda calisir, map'lerde calismaz.
        // Bu sekilde mapi Set'e cevirirsek for eachi kullanabiliriz.
        System.out.println(myEntries); // [null=1800000, Myanmar=null, USA=500000000, Bhutan=350000000,
        // Germany=83000000, Albania=2800000, India=700000]

        // Example 3 : Ulke ismindeki char sayisini ulke nufusuna ekleyen ve sonucu konsola yazdiran kodu yaziniz.
        int summ = 0;
        for (Map.Entry<String, Integer> w : myEntries) {
            if (w.getValue() != null && w.getKey() != null) {
                summ = w.getValue() + w.getKey().length();
                System.out.println(summ);
            }
        }
    }
}

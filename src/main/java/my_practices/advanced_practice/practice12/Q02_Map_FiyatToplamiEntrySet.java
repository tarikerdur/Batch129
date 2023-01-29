package my_practices.advanced_practice.practice12;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Q02_Map_FiyatToplamiEntrySet {
    public static void main(String[] args) {

        /*
    Bir map içerisinde verilen fiyatların toplamını bulan bir kod yazınız.(for each loop kullanınız)
    Örn: {Kemer=19.99, Gömlek=29.99, Ayakkabı=89.99, Kazak=24.99, Kravat=19.99} ==> Toplam: 184.95
        */

        HashMap<String, Double> myMap = new HashMap<>();
        myMap.put("Kemer", 19.99);
        myMap.put("Gomlek", 29.99);
        myMap.put("Ayakkabi", 89.99);
        myMap.put("Kazak", 24.99);
        myMap.put("Kravat", 19.99);

        System.out.println(fiyatToplami(myMap));


    }

    static double fiyatToplami(HashMap<String, Double> map) {
        System.out.println("Urunler ve fiyatlari = " + map);
        System.out.println(map.entrySet());

        double sum = 0;

        for (Map.Entry<String, Double> w : map.entrySet()) {
            sum += w.getValue();
        }

        return sum;

    }


}

package my_practices.advanced_practice.practice13;

import java.util.*;

public class Q01_Map_AyniUcret {

    public static void main(String[] args) {


        //Aşağıda verilen fiyat listesinden fiyatı 29.99 olan ürünlerin adlarını yazdırınız.
        Map<String, Double> urunler = new HashMap<>();
        urunler.put("Kemer", 19.99);
        urunler.put("Gomlek", 29.99);
        urunler.put("Kazak", 24.99);
        urunler.put("Pijama", 29.99);
        urunler.put("Ayakkabi", 89.99);
        urunler.put("Kravat", 19.99);
        urunler.put("Terlik", 29.99);

        System.out.println("urunler = " + urunler);


        // 1. yol
        for (Map.Entry<String, Double> w:urunler.entrySet()) {
            if (w.getValue().equals(29.99)){
                System.out.print(w + " ");
            }
        }

        // 2. yol
        Collection<Double> fiyatlar = urunler.values();
        System.out.println("fiyatlar = " + fiyatlar);
        Set<String> urunAdlari = urunler.keySet();
        System.out.println("urunler = " + urunAdlari);

        // 3. yol

        for (int i = 0; i < fiyatlar.size(); i++) {
            if (fiyatlar.toArray()[i].equals(29.99)){
                System.out.println(urunAdlari.toArray()[i]);
            }
        }





    }
}
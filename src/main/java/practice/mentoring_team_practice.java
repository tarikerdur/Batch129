package practice;

import java.lang.reflect.Array;
import java.util.*;

public class mentoring_team_practice {
    public static void main(String[] args) {

        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(5);
        nums1.add(10);
        nums1.add(20);
        nums1.add(9);
        nums1.add(1);

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(10);
        nums2.addAll(nums1);

        int sum = 0;
        for (Integer w : nums2) {
            sum += w;
        }
        System.out.println(sum);


        // Bir tamsayı listesinde "13" öğesinden önceki tüm liste öğelerinin toplamını bulunuz.

        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(31);
        myList.add(7);
        myList.add(13);
        myList.add(10);

        int count = 0;
        for (Integer w : myList) {
            if (w.equals(13)) {
                break;
            }
            count++;
        }
        System.out.println(count);


        // Bir tamsayı listesindeki tüm çift sayıların çarpımını bulunuz.
        List<Integer> multiply = new ArrayList<>();
        multiply.add(12);
        multiply.add(31);
        multiply.add(7);
        multiply.add(13);
        multiply.add(10);

        int multi = 1;
        for (Integer w : multiply) {
            if (w % 2 == 0) {
                multi *= w;
            } else {
                continue;
            }
        }
        System.out.println(multi);

        int multi2 = 1;
        for (Integer w : multiply) {
            if (w % 2 != 0) {
                continue;
            } else {
                multi2 *= w;
            }
        }
        System.out.println(multi2);

        int multiFor = 1;
        for (int i = 0; i < multiply.size(); i++) {
            if (multiply.get(i) % 2 == 0) {
                multiFor *= multiply.get(i);
            }
        }
        System.out.println(multiFor);



        /*
        Bir listedeki öğelerin azalan sırada olup olmadığını kontrol ediniz.
        Örnek: (Elma, Armut, Zencefil, Kestane) ==> Çıktı: Azalan sırada değil
               (Armut, Elma, Kestane, Zencefil) ==> Çıktı: Azalan sıradadır
         */

        List<String> fruits = new ArrayList<>();
        fruits.add("Elma");
        fruits.add("Armut");
        fruits.add("Zencefil");
        fruits.add("Kestane");

        List<String> reversedOfFruits = new ArrayList<>();
        reversedOfFruits.addAll(fruits);

        Collections.sort(fruits);

        if (fruits.equals(reversedOfFruits)) {
            System.out.println("Azalan sirada");
        } else {
            System.out.println("Azalan sirada degil");
        }



        /*
        Listede eleman olarak 15 varsa, tüm 15'leri 51 olarak değiştiriniz.
        Örnek: (12, 11, 15, 34, 43) ==> Çıktı (12, 11, 51, 34, 43)

        LOGIC : for eachte elementleri alip bakarim 15'e esitse o sayiyi for loop ile tersten yazdiririm
                                                                51 olur atama yaparim
        */

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(12);
        sayilar.add(11);
        sayilar.add(15);
        sayilar.add(34);
        sayilar.add(43);
        sayilar.add(15);

        if (sayilar.contains(15)) {
            for (Integer w : sayilar) {
                if (w == 15) {
                    int idx = sayilar.indexOf(w);
                    sayilar.set(idx,51);
                }
            }
            System.out.println(sayilar);
        } else {
            System.out.println("Liste 15 elementini icermiyor.");
        }

        System.out.println();

        //Listede 15 veya 13 varsa, bu elemanları kaldırınız.
        // Örnek: (10, 31, 15, 13, 54) ==> Çıktı (10, 31, 54)
        ArrayList<Integer> delete = new ArrayList<>();

        delete.add(10);
        delete.add(31);
        delete.add(15);
        delete.add(13);
        delete.add(54);
        delete.add(15);
        delete.add(13);

        ArrayList<Integer> willDelete = new ArrayList<>();
        willDelete.add(13);
        willDelete.add(15);

        System.out.println(delete);

        if (delete.contains(15) && delete.contains(13)) {
            for (int i = 0; i < delete.size(); i++) {
                if (delete.get(i)==15){
                    delete.removeAll(willDelete);
                } else if (delete.get(i)==13) {
                    delete.removeAll(willDelete);
                }
            }
        } else {
            System.out.println("Listede 13 ve 15 yok");
        }
        System.out.println(delete);




            /*
            String str= "Hasan dun geldi ama Hasan dun gitmedi Hasan iste ";
            Hasan=3,  dun=2, geldi=1
            Verilen String de her kelimenin kac defa tekrar ettigini gosteren kodu yaziniz
            */

        String str = "Hasan dun geldi ama Hasan dun gitmedi Hasan iste ";
        String [] ornek = new String[str.length()];
        ornek = str.split(" ");

        int hasanCounter = 0;
        int dunCounter = 0;
        int geldiCounter = 0;
        int amaCounter = 0;
        int gitmediCounter = 0;
        int isteCounter = 0;

        for ( String w :ornek) {
            if (w.equalsIgnoreCase("hasan")){
                hasanCounter++;
            } else if (w.equalsIgnoreCase("dun")) {
                dunCounter++;
            } else if (w.equalsIgnoreCase("geldi")) {
                geldiCounter++;
            } else if (w.equalsIgnoreCase("ama")) {
                amaCounter++;
            } else if (w.equalsIgnoreCase("gitmedi")){
                gitmediCounter++;
            } else if (w.equalsIgnoreCase("iste")) {
                isteCounter++;
            }
        }
        System.out.println("\"hasan\" tekraren " + hasanCounter + " kere tekrar ediyor.");
        System.out.println("\"dun\" tekraren " + dunCounter + " kere tekrar ediyor.");
        System.out.println("\"geldi\" tekraren " + geldiCounter + " kere tekrar ediyor.");
        System.out.println("\"ama\" tekraren " + amaCounter + " kere tekrar ediyor.");
        System.out.println("\"gitmedi\" tekraren " + gitmediCounter + " kere tekrar ediyor.");
        System.out.println("\"iste\" tekraren " + isteCounter + " kere tekrar ediyor.");


    }

}

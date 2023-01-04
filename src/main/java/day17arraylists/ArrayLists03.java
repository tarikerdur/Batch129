package day17arraylists;

import java.util.ArrayList;

public class ArrayLists03 {
    public static void main(String[] args) {

// remove() methodu ===> List'teki datayi silmek

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");
        cities.add("Kayseri");

        System.out.println(cities); // [Miami, Istanbul, Kayseri, Almaty, Kayseri]

        String n = cities.remove(1); // remove() methodu indexe gore silme yapabilir.
                                           // remove() methodu index ile kullanilirsa o indexteki elemani siler.
        System.out.println(n); // Istanbul ===> sildigi elemani verir.
                               // Silmek tehlikeli oldugu icin Java bunu teyit ettirir.

        System.out.println(cities); // [Miami, Kayseri, Almaty, Kayseri]

        //-------------------------------------------------------------------\\


        boolean m = cities.remove("Kayseri"); // remove() methodu objeye(dataya) gore de silme yapabilir.
                                                 // remove() methodu obje (data) ile kullanilirsa ilk gorunumu siler.
        System.out.println(m); // true ==> dataya gore silme yaparsa true/false doner.
                               // Cunku biz elimizle yaziyoruz zaten tekrar teyit etmez.

        System.out.println(cities); // [Miami, Almaty, Kayseri]

        // clear() methodu tum listeyi siler. (clear() methodu KATLIAM YAPAR ESPIRISI YAPTI)
        // remove() methodu sadece istenen datayi siler.
    }
}

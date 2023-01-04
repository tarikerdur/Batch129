package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists02 {
    public static void main(String[] args) {

            /*
        Array List olustururken sag tarafa yani constructor'a "ArrayList<>()" yazmak zorundayiz.
        Ama sol tarafa ister "ArrayList" yazin isterseniz de "List" yazin ikisi de calisir.
        O zaman bunlarin farki ne ? Collections'lari ogrenmeye baslayinca anlicaksiniz, dedi.
        "List", "ArrayList"'e gore Hz.Adem gibidir. Ama "ArrayList" Hasan Erdur gibidir.
        Ihtiyaca gore bunlardan hangisinin daha kullanisli oldugu degisir.
        Ama Array List olustururken Java syntax'i icin ikisi de kullanilabilir. IDE hata vermez.
            */

        List<Character> initials = new ArrayList<>();   // initial (ENG) == bas harf (TR)
        initials.add('A');
        initials.add('B');
        initials.add('M');
        initials.add('B');

        // Bir List'te kac eleman oldugunu nasil anlariz ?
        int numOfElement = initials.size(); // size() methodu bize eleman sayisini verir.
        // (String ve Array'lerdeki length()'in islevini gorur.)
        System.out.println(numOfElement); // 4


        // Note : Interview'lerde Array'lerden bahsederken "length" kullanin List'lerden bahsederken "size" kullanin.

        // Bir List'ten istenen bir eleman nasil alinir ?
        // get() methodu. parantezin icine almak istedigimiz indexi yaziyoruz.
        char u = initials.get(2);
        System.out.println(u); // M


        // Example 1 : Verilen bir String List'teki tum elemanlarin toplam karakter sayilarini bulunuz.

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");

        // 1. YOL : for each loop  --->  recommended (Tavsiye edilen yol), dedi.
        int sum = 0;
        for (String w : cities) {
            sum += w.length(); // cities List'indeki String'ler w'nin icinde loop olacagi icin size yerine length() kullandik.
        }
        System.out.println(sum); // 26

        // 2. YOL : for loop
        int toplam = 0;
        for (int i = 0; i < cities.size(); i++) {
            toplam += cities.get(i).length(); // burada List ile loop yaptigimiz icin size() kullandik.
        }// get(i) ==> List'in i. indexindeki String'i getirdi. length() ile getirilen String'i hesapladik.
        System.out.println(toplam); // 26


        // Bir List'teki istenen bir elemani nasil degistirebiliriz. (ARRAYLERDE AYNI LIST'TE DEGISIKLIK OLMAZ)
        // set() methodu String Class'daki replaceAll() methoduna benzer dedi.
        cities.set(0, "New York"); // 0. indexteki datayi "New York"a donusturduk.
        System.out.println(cities); // [New York, Istanbul, Kayseri, Almaty]


        // Example 2 : Maas List'i olusturunuz ve maaslara %20 zam yapiniz.
        List<Double> salary = new ArrayList<>();
        salary.add(19500.25);
        salary.add(8500.75);
        salary.add(32500.50);
        System.out.println(salary); // [19500.25, 8500.75, 32500.5]

        // 1. YOL
        int idx = 0;
        for (Double w : salary) {
            salary.set(idx, w * 1.20);
            idx++;
        }
        System.out.println(salary); // [23400.3, 10200.9, 39000.6]

        // 2. YOL
        for (int i = 0; i < salary.size(); i++) {
            salary.set(i, salary.get(i) * 1.20);
        }
        System.out.println(salary); // [23400.3, 10200.9, 39000.6]


    }
}
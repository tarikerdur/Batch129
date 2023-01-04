package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays05 {
    public static void main(String[] args) {


        /*
           Note 1: sort() method'u sayisal data typelarini kucukten buyuge siralar (ascending order)
           Note 2: sort() method'u String data typelarini alfabetik olarak siralar (alphabetical order)
           Note 3: ascending order + alphabetical order ==> Natural Order (her ikisini de kapsar)
           Note 4: sort() method'u Array elemanlarini "Natural Order"a gore siralar.
        */

        /*
        Array class'inda bulunan binarySearch() methodu bir elemanin bir arrayde olup olmadigini kontrol etmek icin kullanilir.
        String'lerdeki "contains()" methodu ile ayni mantiktadir.
            "binarySearch()" methodunu kullanmadan once "sort()" methodunu kullaniriz.
            sort kullanmadan yaparsak guvenilir degildir. Bu yuzden kullanmak ZORUNDAYIZ.
        (Yemekten once ellerimizi yikamazsak olmeyiz ama bir gun olur olebiliriz degil mi? espirisini yapti)
        */

        String colors[] = new String[6];
        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Grown";

        Arrays.sort(colors); // alfabetik olarak siraladik. Bu yuzden "Blue" 0. indexe yerlesti.

        System.out.println(Arrays.toString(colors)); // [Blue, Green, Grown, Orange, Red, Yellow]

        int num1 = Arrays.binarySearch(colors, "Blue"); // Array'in ismi , aradigimiz eleman ===> returns int
        System.out.println(num1); // 0 ==> var hem de indexi 0

        int num2 = Arrays.binarySearch(colors, "Orange");
        System.out.println(num2); // 3 ==> var hem de indexi 3

        int num3 = Arrays.binarySearch(colors, "Tarik");
        System.out.println(num3); // -6 ==> "-" bu eleman yok demek.
                                  //        "6" ise "Tarik" diye bir eleman olsaydi bu 6. indexteki eleman olurdu demek.

    }

}

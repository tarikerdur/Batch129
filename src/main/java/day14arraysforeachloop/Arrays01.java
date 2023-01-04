package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        // Example 1: String Array olusturun.Icine 5 tane eleman ekleyin.
        // Ilk eleman ile son elemanin icerdigi karakter sayilari toplamini ekrana yazdirin.

        String arr[] = new String[5];
        arr[0] = "Math";
        arr[1] = "Science";
        arr[2] = "Music";
        arr[3] = "English";
        arr[4] = "Art";

        System.out.println(Arrays.toString(arr)); // [Math, Science, Music, English, Art]
        System.out.println(arr[0].length() + arr[arr.length - 1].length());
        // ilk elemanin karakter sayisi   + // son elemanin karakter sayisi
        //                      4     +      3       == 7


        // Example 2: String Array olusturun.Icine 5 tane eleman ekleyin.
        //         Tum elemanlarin icerdigi karakter sayilari toplamini ekrana yazdirin.

        String brr[] = new String[5];
        brr[0] = "Miami";
        brr[1] = "Istanbul";
        brr[2] = "Frankfurt";
        brr[3] = "Dhaka";
        brr[4] = "Athens";

        // 1. YOL: FOR LOOP
        int totalChar = 0;

        for (int i = 0; i < brr.length; i++) {
            totalChar += brr[i].length();
        }
        System.out.println(totalChar); // 33

        // 2. YOL: FOR EACH LOOP ==> baslangic degeri, loop'un calisma sarti ve increment/decrement kismini JAVA kendisi halleder.
        // for each loop'un diger adi enhanced (zenginlestirilmis) loop'tur.
        // ozelliginden dolayi oncelikle for each loop'u kullanin. mecbur degilseniz digerlerini kullanin
        // for each loop ==> Array'lerde ve "collection"larda kullanilir.
        // Index kullanmak gerektiginde bazen for each loop caresiz kalir. Mecburen diger looplari kullaniriz.

        int sum = 0;

        for (String w : brr) { // w == brr arrayi
            sum += w.length();
        }
        System.out.println(sum); // 33


    }
}

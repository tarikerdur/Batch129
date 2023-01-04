package day16multidimensionalarrays;

import java.util.Arrays;

public class Md02 {
    public static void main(String[] args) {

        // Example 1 : Bir int multi dimensional Array olusturunuz.
        // Toplam eleman sayisini konsola yazdiriniz.

        // int a [][] = new int[3][3];   ==> Array olusturmanin birinci yolu.
        // Ama bunu kullanmicaz cunku eleman sayisi farkli olsun istiyoruz.
        int a[][] = {{13, 213, 4}, {12, 87}, {4, 7, 1, 9}, {99}}; // Bu yolla olusturursak
        // her inner'a istedigimiz sayida eleman koyabiliriz.
        System.out.println(Arrays.deepToString(a)); // [[13, 213, 4], [12, 87], [4, 7, 1, 9], [99]]


        int sum = 0; // for each loop'ta arrayin icinde bulunan data tipini yaziyorduk ya. o yuzden : (Alt satiri oku)
        for (int[] w : a) { // Outer Array'de bulunan elemanlarin data tipi "Array" turunde oldugu icin "int[] w:a" dedik.
            sum += w.length;
        }
        System.out.println(sum); // 10


    }
}

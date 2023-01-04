package practice.advanced_practice.practice02;

import java.util.Arrays;
import java.util.Comparator;

public class Q03_Arrays_IkinciMax {
    public static void main(String[] args) {
        /*
        Bir Array içerisindeki 'minimum', 'maksimum'  ve 'ikinci maksimum' değerleri bulan bir kod yazınız.
        input: int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1};
        output: min:-90, max:10001, secMax: 8787
        */
        int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1};

        // 1. YOL : sort() ile siralama yolu (Kolay yol)

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [-90, 0, 1, 100, 845, 898, 8787, 10001]
        System.out.println("min : " + arr[0] + "\nmax : " + arr[arr.length-1] + "\nSecond Max : " + arr[arr.length-2]);



        // 2. YOL : Math class'indan max ve min methodlarini kullanmak.
        int small = arr[0];
        int big = arr[0];
        int secondBig = arr[0];

        for ( int w: arr) {
            if (w<small){
                small = w;
            } else if (w>big) {
                secondBig = big;
                big = w;
            } else if (w>secondBig){
                secondBig = w;
            }
        }
        System.out.println("\nmin : " + small +
                "\nmax : " + big+
                "\nSecond Max : " + secondBig);

    }
}

package my_practices.öylesineçalışmalar;

import java.util.Arrays;
import java.util.Comparator;

public class Practice {
    public static void main(String[] args) {
        //Example 1: [0, 2, 3, 0, 12, 0] sifirlari en sona koyunuz  [2,3,12,0,0,0]

        int arr[] = {0, 2, 3, 0, 12, 0};
        int brr[] = new int[arr.length];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                brr[idx] = arr[i];
                idx++;
            }
        }
        System.out.println(Arrays.toString(brr));


        //Example 1: [1, 2, 3, 1, 12, 1] birleri en sona koyunuz  [2, 3, 12, 1, 1, 1]

        int[] a = {1, 2, 3, 1, 12, 1};
        int[] b = new int[a.length];

        int index = 0;
        int indexSon = a.length - 1;
        for (int w : a) {
            if (w != 1) {
                b[index] = w;
                index++;
            } else {
                b[indexSon] = w;
                indexSon--;
            }
        }
        System.out.println(Arrays.toString(b));


        // Example : Bir int multi dimensional arraydeki en buyuk ve en kucuk sayinin toplamini ekrana yazdiriniz.

        int[][] grr = {{2}, {3, 9}, {82, 15}, {8, 4}, {15}};
        int min = grr[0][0];
        int max = grr[0][0];

        for (int[] w : grr) {
            for (int k : w) {
                min = Math.min(min, k);
                max = Math.max(max, k);
            }
        }
        System.out.println(max + min); // 84

        // Example 1 : Bir int multi dimensional Array olusturunuz.
        // Toplam eleman sayisini konsola yazdiriniz.

        int[][] zrr = {{2}, {3, 9}, {82, 15}, {8, 4}, {15}};

        int count = 0;
        for (int[] w : zrr) {
            count += w.length;
        }
        System.out.println(count);

        int multiply = 0;
        for (int[] w : zrr) {
            for (int k : w) {
                multiply += k;
            }
        }
        System.out.println(multiply);
        System.out.println(2 + 3 + 9 + 82 + 15 + 8 + 4 + 15);

        // Example 1 : Bir multi dimensional array olusturunuz
        // ve bir dimensionalli array'e donusturunuz.


        int[][] mrr = {{2}, {3, 9}, {82, 15}, {8, 4}, {15}};
        int length = 0;
        for ( int[] w  : mrr) {
            for (int k:w) {
                length++;
            }
        }
        System.out.println(length); // 8

        int [] qrr = new int[length];

        int ndex = 0;
        for ( int [] w :zrr ) {
            for (int k: w) {
                qrr[ndex]=k;
                ndex++;
            }
        }
        System.out.println(Arrays.toString(qrr));



        // Example 3 : String elemanlarini buyukten kucuge sirala
        // Ayni karakter sayisinda olanlari da alfabetik siraya koyunuz.
        //["Michael" , "Ajda" , "Reyhane", "Gabriel", "Thomas", "Tom","Ali", "Cin","Cuneyt", "Cem"]
        //                  ====> ["Gabriel", "Michael","Reyhane", "Thomas", "Cuneyt", "Ajda", "Ali", "Cem", "Cin", "Tom"]
        String[] crr = {"Michael", "Ajda", "Reyhane", "Gabriel", "Thomas", "Tom", "Ali", "Cin", "Cuneyt", "Cem"};
        Arrays.sort(crr, Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        System.out.println(Arrays.toString(crr));

    }
}

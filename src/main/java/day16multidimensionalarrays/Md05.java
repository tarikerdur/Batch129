package day16multidimensionalarrays;

import java.util.Arrays;

public class Md05 {
    public static void main(String[] args) {

        // Example 1 : Bir int multi dimensional array olusturunuz
        //             Bu arraydeki tum elemanlarin carpimini konsola yazdiran kodu yazin.

        int[][] a = {{2, 5}, {4, 7, 11}};

        // Hocanin cozumu
        int carpim = 1;
        for (int[] w : a) {
            for (int k : w) {
                carpim *= k;
            }
        }
        System.out.println(carpim); // 3080




        // Benim aptalca cozumum === AMA KOD DOGRU CALISIYO AMK
        int lengthB = 0;
        for (int[] w : a) {
            lengthB += w.length;
        }

        int[] b = new int[lengthB];
        int idx = 0;
        for (int[] w : a) {
            for (int k : w) {
                b[idx] = k;
                idx++;
            }
        }

        int multiply = 1;
        for (Integer w : b) {
            multiply *= w;
        }
        System.out.println(multiply); //3080

    }
}

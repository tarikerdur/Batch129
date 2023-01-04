package day16multidimensionalarrays;

import java.util.Arrays;

public class Md04 {
    public static void main(String[] args) {

        // Example 1 : Bir multi dimensional array olusturunuz
        // ve bir dimensionalli array'e donusturunuz.

        int[][] a = {{2, 5}, {3}, {4, 7, 11}};
        System.out.println(Arrays.deepToString(a)); // [[2, 5], [3], [4, 7, 11]]

        // a arrayindeki toplam eleman sayisini bulup b arrayine koycaz
        int sum = 0;
        for (int[] w : a) {
            sum += w.length;
        }

        int[] b = new int[sum]; // [0, 0, 0, 0, 0, 0]
        int idx = 0;
        for (int[] w : a) {
            for (int k : w) {
                b[idx] = k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(b)); // [2, 5, 3, 4, 7, 11]

    }
}

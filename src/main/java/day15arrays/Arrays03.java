package day15arrays;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

        // Example 1: [0, 2, 3, 0, 12, 0] sifirlari en sona koyunuz  [2,3,12,0,0,0]
        // ebay'de mulakatta suleyman hocaya sorulmus.


        /*
        LOGIC : a'nin elemanlarina bakicaz. 0'a esit mi?
        Esit ise dokunma. Esit degilse en bastan o elemani b'nin icine yerlestirecez.
        */

        int a[] = {0, 2, 3, 0, 12, 0};

        int b[] = new int[a.length]; // b= [0,0,0,0,0,0]

        int idx = 0;

        for (int w : a) {
            if (w != 0) {
                b[idx] = w;
                idx++;
            }
        }
        System.out.println(Arrays.toString(b)); // [2, 3, 12, 0, 0, 0]
    }
}

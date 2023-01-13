package my_practices.advanced_practice.practice07;

import java.util.Arrays;
import java.util.Scanner;

public class Q01_Arrays_Ortaelement {
    public static void main(String[] args) {

                /*
            Elementlerini kullanıcandan aldığınız bir integer arrayi sortladiktan sonra
            içindeki orta elementi bulan bir kod yazınız.
        Example: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
        (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 10
                */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Array limit that you wanted to...");
        int limit = input.nextInt();
        int[] arr = new int[limit];

        for (int i = 0; i < limit; i++) {
            System.out.println("Give us the " + (i + 1) + ". element");
            arr[i] = input.nextInt();
        }

        System.out.println("Before sort\t= " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("After sort\t= " + Arrays.toString(arr));


        int midIdx = arr.length / 2;
        boolean isItSplitIntoTwo = arr.length % 2 != 0;


        if (isItSplitIntoTwo) {
            System.out.println("Mid element\t= " + arr[midIdx]);
        } else {
            System.out.println("Mid element\t= " + (arr[midIdx] + arr[midIdx-1])/2.0f);
        }


    }
}

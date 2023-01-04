package practice.advanced_practice.practice05;

import java.util.Arrays;

public class Q05_Arrays_ToplamiVerilenIkililer {
    public static void main(String[] args) {
            /*
                 Kendisi ile kendisinden sonra gelen sayilarla toplami istenen sayiya
                 eşit olan Array element çiflerini yazdıran bir method oluşturunuz.
            {4,6,5,-10,8,5,20} ===> 10
         4 + 6 = 10
         5 + 5 = 10
        -10 + 20 = 10
            */
        int[] arr = {4, 6, 5, -10, 8, 5, 20};

        ikilileriBul(arr, 10);


    }


    public static void ikilileriBul(int[] arr, int toplam) {
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == 10) {

                    System.out.println(arr[i] + " + " + arr[j] + " : " + toplam);

                }
            }
        }
    }
}

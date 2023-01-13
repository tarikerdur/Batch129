package my_practices.advanced_practice.practice06;

import java.util.Arrays;
import java.util.Scanner;

public class Q05_Arrays_IstenenleriSilme {
    public static void main(String[] args) {

        // Bir integer Array'de verilen bir deger disindaki
        // elamanlari yeni bir Array olarak yazdiran bir method yaziniz.
        int[] arr = {1, 2, 2, 3, 4, 5, 5};
        istenileniSil(arr);

    }

    private static int[] istenileniSil(int[] arr) {
        Scanner input = new Scanner(System.in);
        System.out.println(Arrays.toString(arr));
        System.out.println("Silmek istediginiz elementi giriniz");
        int silinecek = input.nextInt();
        int length = 0;
        for (int w : arr) {
            if (w != silinecek) {
                length++;
            }
        }

        int[] arrSilinmis = new int[length];

        int idx = 0;
        for (int w : arr) {
            if (w != silinecek) {
                arrSilinmis[idx] = w;
                idx++;
            }
        }
        System.out.println("Yeni array = " + Arrays.toString(arrSilinmis));
        return arrSilinmis;
    }

}

package my_practices.advanced_practice.practice02;

import java.util.Arrays;
import java.util.Scanner;

public class Q05_Arrays_Element_Sil {
     /*
     Elementlerini kullanıcıdan alarak bir integer Array oluşturunuz.
     Kullanıcıdan bir indeks alınız ve o indeksteki elementi siliniz.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        //Elementlerini kullanıcıdan alarak bir integer Array oluşturunuz.

        System.out.println("Array limitini giriniz...");
        int limit = input.nextInt();
        int[] arr = new int[limit];

        for (int i = 0; i < limit; i++) {
            System.out.println("Index " + i + " degerini giriniz...");
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));


        // Kullanıcıdan bir indeks alınız ve o indeksteki elementi siliniz.



        System.out.println("Silmek istediginiz indexi giriniz...");
        int indexSil = input.nextInt();

        int[] brr = new int[limit - 1];
        int idx = 0;
        for (int i = 0; i < limit; i++) {
            if (i != indexSil) {
                brr[idx] = arr[i];
                idx++;
            }
        }
        System.out.println(Arrays.toString(brr));

    }
}

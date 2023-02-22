package my_practices.oylesinecalismalar;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class saidlekopkop {
    public static void main(String[] args) {
//        Soru13:Verilen bir int  Arrayde toplamlari istenen degere esit olan sayi ciftlerini
//        yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1};
//        int istenenToplam=9;


        int[] arr = {5, 7, -6, 4, 2, 15, 3, 8, 1};
        int istenenToplam;

        for (int i = 0; i < arr.length; i++) {
            for (int w : arr) {
                istenenToplam = arr[i] + w;
                if (istenenToplam == 9) {
                    System.out.println("" + arr[i] + "+" + w + "=" + istenenToplam);
                }
            }
        }
        System.out.println("********* LAMBDA ***********");

//        Soru 6:Asagidaki multi dimensional array’in ic array’lerindeki son elemanlarin carpimini
//        Ekrana yazdiran java kodunu yaziniz. { {1,2,3}, {4,5}, {6} }
        int[][] brr = {{1, 2, 3}, {4, 5}, {6}};
        int multiply = 1;
        for (int i = 0; i < brr.length; i++) {
            for (int j = brr[i].length - 1; j > brr[i].length - 2; j--) {
                multiply *= brr[i][j];
            }
        }
        System.out.println(multiply); // 90
        System.out.println("********* ITERATOR ***********");

//        Soru11:Multidimensional arrayin iç array lerindeki tüm elemanların toplamını birer birer bulan
//           ve herbir sonucu yeni bir arrayin elemanı yapan ve yeni array i ekrana yazdıran programı yaziniz.
//           input {{10,20,30},{4},{6,7,20}}==> output ={60,4,33}

        int[][] crr = {{10, 20, 30}, {4}, {6, 7, 20}};
        int[] newCrr = new int[crr.length];
        int sum = 0;
        for (int i = 0; i < crr.length; i++) {
            sum = 0;
            for (int j = 0; j < crr[i].length; j++) {
                sum+=crr[i][j];
            }
            newCrr[i] = sum;
        }
        System.out.println(Arrays.toString(newCrr)); // [60, 4, 33]

        System.out.println("********* ITERATOR ***********");

    }
}

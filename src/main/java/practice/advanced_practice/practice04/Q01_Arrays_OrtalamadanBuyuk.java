package practice.advanced_practice.practice04;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Q01_Arrays_OrtalamadanBuyuk {
    public static void main(String[] args) {

        //Verilen bir Array'in elementlerinin ortalamasından büyük elementleri yazdıran bir kod yazınız.

        int[] arr = {5, 9, 15, 1, 0, 11, 3};

        double sum = 0;
        for (int w : arr) {
            sum += w;
        }

        System.out.println("Sum : "+ (int)sum);


        double average = sum / arr.length;

        System.out.printf("%.2f", average);

        System.out.print("\nElements that greater than average : ");
        for (int w : arr) {
            if (w > average) {
                System.out.print(w + ", ");
            }
        }


    }
}

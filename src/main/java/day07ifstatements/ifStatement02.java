package day07ifstatements;

import java.util.Scanner;

public class ifStatement02 {
    public static void main(String[] args) {

        // Example 2: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olustur.

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi gir");
        int num = input.nextInt();

        // 1. YOL
        if (num % 2 == 0) {
            System.out.println("Cift sayi...");
        }
        if (num % 2 != 0){
            System.out.println("Tek sayi...");
        }

        // 2. YOL (Bu yolda Java daha az is yapar)
        if (num % 2 == 0) {
            System.out.println("Cift sayi...");
        } else {
            System.out.println("Tek sayi...");
        }







    }
}

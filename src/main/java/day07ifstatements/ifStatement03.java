package day07ifstatements;

import java.util.Scanner;

public class ifStatement03 {
    public static void main(String[] args) {

        // Example 3: Kullanicidan verilen bir sayinin pozitif, negatif veya notr oldugunu kontrol eden kodu yaz

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi gir");
        int num = input.nextInt();

        if (num>0) {
            System.out.println("Pozitif");
        } else if (num<0) {
            System.out.println("Negatif");
        } else {
            System.out.println("Notr");
        }


    }
}

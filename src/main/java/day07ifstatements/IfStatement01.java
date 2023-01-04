package day07ifstatements;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {

        // Example 1= Kullanicidan bir karakter al buyuk harf ise "buyuk harf" yazdir
        //            kucuk harf ise ekrana "kucuk harf" yazdir

        Scanner input = new Scanner(System.in);
        System.out.println("Bir character gir");
        char ch = input.next().charAt(0);


        // 1. YOL
//        if (ch>='A' && ch<='Z'){
//            System.out.println("Buyuk harf...");
//        }
//        if (ch>='a' && ch<='z'){
//            System.out.println("Kucuk harf...");
//        }

        // 2. YOL
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Buyuk harf...");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Kucuk harf...");
        } else {
            System.out.println("Harf degil...");
        }

    }

}

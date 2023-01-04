package day10switchloops;

import java.util.Scanner;

public class Loops01 {

    /*
    Code Standarts:
    i) Tekrar (Repetition) olmamalidir.
    ii) Dinamik olmalidir.
    iii) Fix (Tamir) ve Update kolay yapilabilmelidir.
     */

    public static void main(String[] args) {
                /* EXAMPLE 1: Ekrana 5 kere "Hello World" yazdirin


                Ayni adimlar tekrar tekrar yapilmasi gerektiginde "Loop"lar kullanilir.

                4 tane Loop var:
                    1) For Loop
                        2) While Loop
                            3) Do While Loop
                                4) For Each Loop
                 */
        // Baslangic degeri        Loop'un calisma sarti         increment/decrement yapilacak
        for (int i = 0              ; i < 5                         ; i++) {
            System.out.println("Hello World");
        }

        // EXAMPLE 2 : 11'den 44'e kadar tum tam sayilari ekrana yazdiran kodu yazin
        for (int i = 11; i < 45; i++) {
            System.out.print(i+" ");
        }

        // EXAMPLE 3: 40'tan 23'e kadar tum cift tam sayilari ekrana yazdiran kodu yazin
        // bazi sartlara bagli bir sey varsa for icinde if kullanin dedi
        for (int i = 40; i > 22; i--) {
            if (i % 2 == 0) {
                System.out.print(i+" ");
            }
        }
        // EXAMPLE 4: 18'den 56'ya kadar tum tek tam sayilari ekrana yazdiran kodu yazin
        for (int i = 18; i <57; i++) {
            if (i % 2 != 0) {
                System.out.print(i+" ");
            }
        }


    }
}

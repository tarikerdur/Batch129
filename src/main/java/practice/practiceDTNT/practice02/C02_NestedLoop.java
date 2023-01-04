package practice.practiceDTNT.practice02;

import java.util.Scanner;

public class C02_NestedLoop {
    public static void main(String[] args) {
        //EX: Dikey olarak bolunen bir agac sekli ciziniz.. agacin tac uzunlugunu kullanicidan aliniz..
        // Not :govde sabit sayi =5 olsun
                /*

                ^
                ^^
                ^^^
                ^^^^
                ^^^^^
                |||
                |||
                |||
                |||
                |||
 */

        Scanner input = new Scanner(System.in);
        System.out.println("Tac uzunlugu gir");
        int tacUzunlugu = input.nextInt();

        String yaprak = "";

        for (int i = 1; i <= tacUzunlugu; i++) {
            yaprak += "^";
            System.out.println(yaprak);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("|||");
        }


    }
}

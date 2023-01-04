package day03scanner;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {

        /* Kullanicidan bir dikdortgenin iki kenar uzunlugunu aliniz.
        1- alanini
        2- cevresini hesapla
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Dikdortgenin kisa kenarini girin");
        float en = input.nextFloat();

        System.out.println("Uzun kenarini girin");
        float boy = input.nextFloat();

        System.out.println("Alan\t: " + alan(en, boy));
        System.out.println("Cevre\t: " + cevre(en, boy));
    }

    public static float alan (double en, double boy) {
        return (float) (en*boy);
    }
    public static float cevre (double en, double boy) {
        return (float) (2*(en+boy));
    }

}

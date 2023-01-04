package day08nestedifternary;

import java.util.Scanner;

public class NestedIf02 {
    public static void main(String[] args) {

            /* EXAMPLE 2: Kullanicidan bir ucgenin kenar uzunlugunu aliniz
                          Uc kenari birbirine esit ise "Eskenar Ucgen " yazdiriniz
                          Sadece iki kenar uzunlugu biribirine esit ise "Ikizkenar ucgen"
                          Tum kenarlari birbirinden farkli ise "Cesitkenar Ucgen" yazdiriniz
            */

        Scanner input = new Scanner(System.in);
        System.out.println("Ucgenin kenarlari icin 3 tane uzunluk giriniz");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        boolean ucgenMi = (a + b > c && c > Math.abs(a - b)) && (a + c > b && b > Math.abs(a - c)) && (b + c > a && a > Math.abs(b - c));


        if (a <= 0 || b <= 0 || c <= 0) { // Negatif sayi kontrolu
            System.out.println("Gecerli kenar uzunlugu giriniz");
        } else if (ucgenMi) { // Ucgen mi?
            if (a == b && a == c && b == c) { // Eskenar mi?
                System.out.println("Eskenar ucgen");
            } else if (a == b || a == c || b == c) { // Ikizkenar mi?
                System.out.println("Ikizkenar ucgen");
            } else {
                System.out.println("Cesitkenar Ucgen"); // Cesitkenar mi?
            }
        } else {
            System.out.println("Ucgen degil");
        }
    }
}

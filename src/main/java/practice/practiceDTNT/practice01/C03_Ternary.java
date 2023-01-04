package practice.practiceDTNT.practice01;

import java.util.Scanner;

public class C03_Ternary {

     /*
        Kullanicidan bir tam sayi alin. tam sayi 3 basamakli ise
        ekrana 3 basamakli yazdirin. 3 basamakli degilse 3 basamakli degil yazdir
        3 basamakli ise tek mi cift mi ona bak
         */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        boolean sifirdanBuyukMu = num > 0;
        boolean sifirdanBuyukUcBas = num > 99 && num < 1000;
        boolean ciftMi = num % 2 == 0;

        if (sifirdanBuyukMu) {
            if (sifirdanBuyukUcBas) {
                if (ciftMi) {
                    System.out.println("Girilen sayi 3 basamakli ve cift sayi");
                } else {
                    System.out.println("Girilen sayi 3 basamakli ama tek sayi");
                }
            } else {
                System.out.println("girilen sayi 3 basamakli degil");
            }
        } else {
            System.out.println("Negatif sayi veya 0 giremezsiniz!!!");
        }
        System.out.println("**********TERNARY COZUMU*********");


        String sonuc = sifirdanBuyukMu ? sifirdanBuyukUcBas ? ciftMi ?  ("Girilen sayi 3 basamakli ve cift sayi") :
        ("Girilen sayi 3 basamakli ama tek sayi") : ("girilen sayi 3 basamakli degil") : ("Negatif sayi veya 0 giremezsiniz!!!");

        System.out.println(sonuc);

    }

}

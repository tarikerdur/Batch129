package my_practices.practiceDTNT.practice01;

import java.util.Scanner;

public class C01_IfStatement {
    public static void main(String[] args) {


        /*
        Kullanicidan bir gun alin
                gun cuma ise "Muslumanlar icin kutsal gun" ;
                eger cumartesi ise "Yahudiler icin kutsal gun";
                eger pazar ise "Hristiyanlar icin kutsal gun"
                Haricindeki her gun icin "Kutsal gun girmediniz"
        yazdirin.

         */

        String daysOfWeek = "pazartesi, sali, carsamba, persembe, cuma, cumartesi, pazar";
        daysOfWeek = daysOfWeek.toLowerCase().trim();
        Scanner scan = new Scanner(System.in);
        System.out.println("Gun giriniz");
        String gun = scan.next().trim().toLowerCase();

        if (daysOfWeek.contains(gun)) { // arsamba girince gun ismi girmediniz yazmasi gerekirken contains nedeniyle if'e giriyor.
            if (gun.equalsIgnoreCase("cuma")) {
                System.out.println("Muslumanlar icin kutsal gun");
            } else if (gun.equalsIgnoreCase("cumartesi")) {
                System.out.println("Yahudiler icin kutsal gun");
            } else if (gun.equalsIgnoreCase("pazar")) {
                System.out.println("Hristiyanlar icin kutsal gun");
            } else {
                System.out.println("Kutsal gun girmediniz");
            }
        } else {
            System.out.println("Gun ismi girmediniz");
        }


    }
}

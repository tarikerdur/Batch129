package my_practices.practice_nighttime.nighttime02;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

        /*
        TechProEd spor salonu icin kullanicidan
        isim, soyisim, yas, kilo, bou, salona ne kadar devam edecegi ay suresi
        bilgilerini alip aylik $20 olarak toplam ucreti
        yazdiriniz.
         */


    Scanner input = new Scanner(System.in);

        System.out.println("Welcome to TechProEd Sport Academy\nPlease enter your answers at below");
        System.out.println("Adinizi giriniz");
        String name = input.nextLine().toUpperCase();

        System.out.println("Soyadinizi giriniz");
        String surname = input.nextLine().toUpperCase();

        System.out.println("Yasinizi giriniz");
        byte age = input.nextByte();
                age = (byte) Math.abs(age);

        System.out.println("Kilonuzu giriniz");
        double weight = input.nextDouble(); // weight = kilo ??
                weight = Math.abs(weight);

        System.out.println("Boyunuzu giriniz");
        double height = input.nextDouble(); // height = boy ??
                height = Math.abs(height);

        System.out.println("Salona kay aylik yazilmak istersiniz");
        byte month = input.nextByte();
                month = (byte) Math.abs(month);

                if (month<13 && month>0){
                    System.out.println("\n\nBilgileriniz asagidadir\t: \n=================");
                    System.out.println("Adiniz\t\t:" + name);
                    System.out.println("Soyadiniz\t:" + surname);
                    System.out.println("Yasiniz\t\t:" + age);
                    System.out.println("Kilonuz\t\t:" + weight);
                    System.out.println("Boyunuz\t\t:" + height);
                    System.out.println(month + " aylik yazilacaksiniz.");

                    int totalPrice = month*20;
                    System.out.print("Toplam Kurs Ucretiniz: " + "$" + totalPrice);

                } else System.out.println("Hatali ay numarasi secimi");



    }
}

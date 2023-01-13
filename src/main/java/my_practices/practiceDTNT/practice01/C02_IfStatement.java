package my_practices.practiceDTNT.practice01;

import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {

        /*
        Kullanicidan alacaginiz 2 sayiyi yine kullaniciya sectireceginiz dort islemden biri ile isleme koyup
        yazdiriniz.
         */


        Scanner input = new Scanner(System.in);
        System.out.println("Toplama yapmak icin 1'e \n" +
                "Cikarma yapmak icin 2'ye \n" +
                "Carpma yapmak icin 3'e \n" +
                "Bolme yapmak icin 4'e" +
                " basiniz.");
        byte islem = input.nextByte();

        System.out.println("ilk sayiyi girin girin");
        double sayi1 = input.nextInt();

        System.out.println("ikinci sayiyi girin");
        double sayi2 = input.nextInt();

        if (islem == 1 || islem == 2 || islem == 3 || islem == 4) {
            if (islem == 1) {
                System.out.println("Toplama isleminin sonucu\t: " + (toplamaYap(sayi1, sayi2)));
            } else if (islem == 2) {
                System.out.println("Cikarma isleminin sonucu\t: " + (cikarmaYap(sayi1, sayi2)));
            } else if (islem == 3) {
                System.out.println("Carpma isleminin sonucu\t: " + (carpmaYap(sayi1, sayi2)));
            } else {
                System.out.println("Bolme isleminin sonucu\t: " + (bolmeYap(sayi1, sayi2)));
            }
        } else {
            System.out.println("Gecersiz tuslama yaptiniz");
        }

    }

    public static double toplamaYap(double a, double b) {
        return (a + b);
    }

    public static double cikarmaYap(double a, double b) {
        return (a - b);
    }

    public static double carpmaYap(double a, double b) {
        return (a * b);
    }

    public static double bolmeYap(double a, double b) {
        return (a / b);
    }
}

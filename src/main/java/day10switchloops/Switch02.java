package day10switchloops;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {

        // Example 1: Kullanicidan iki sayi ve yapilacak islemi alan ve
        // toplama cikarma carpma bolme yuzde islemlerini yapan kodu yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Ilk sayiyi ver");
        double a = input.nextDouble();
        System.out.println("Ikinci sayiyi ver");
        double b = input.nextDouble();
        String menu = "Yapilacak islemi giriniz\t:\n" +
                "Toplama icin\t==>\t1'e\n" +
                "Cikarma icin\t==>\t2'ye\n" +
                "Carpma icin\t\t==>\t3'e\n" +
                "Bolme icin\t\t==>\t4'e\n" +
                "Yuzde icin\t\t==>\t5'e \n\t\t\t\t\tBasiniz";

        System.out.println(menu);
        char opr = input.next().charAt(0);

        switch (opr) {
            case '1':
                System.out.println("Toplama isleminin sonucu : " + (a + b));
                break;
            case '2':
                System.out.println("Cikarma isleminin sonucu : " + (a - b));
                break;
            case '3':
                System.out.println("Carpma isleminin sonucu : " + (a * b));
                break;
            case '4':
                System.out.println("Bolme isleminin sonucu : " + (a / b));
                break;
            case '5':
                System.out.println("Yuzde isleminin sonucu\t: " + "\nIlk sayinin yuzdesi = " + a + " = " + (a / 100)
                        + "\nIkinci sayinin yuzdesi = " + b + " = " + (b / 100));
                break;
            default:
                System.out.println("Gecersiz tuslama yaptiniz");
        }
    }
}

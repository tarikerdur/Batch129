package my_practices.advanced_practice.practice10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q03_Exception_NotOrtalama {

        /*
    Vize ve final notlarını alarak ortlama hesaplayan bir kod yazınız.
    int v = vize
    int f = final

    Eğer  vize 100 den büyük, veya final 100'den büyük, veya vize 0'dan küçük, veya final 0'dan küçük ise,
    Sistem ArithmeticException hatası versin ve "Notlar 0-100 arasında olmalı" mesajını döndürsün.
    Diğer durumlarda ise, vizenin yüzde 40 ını, finalin yüzde 60 ını alsın ve toplasın.
    Ortalama 70'in üzerinde is "Başarılı" altında ise "Başarısız" yazdırsın.
        */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vizeNotu;
        int finalNotu;
        while (true) {
            try {
                System.out.println("Vize notunu girin");
                vizeNotu = input.nextInt();
                if (vizeNotu < 0 || vizeNotu > 100) {
                    throw new ArithmeticException();
                } else {
                    break;
                }
            } catch (ArithmeticException e) {
                System.out.println("Notlar 0-100 arasında olmalı");
            } catch (InputMismatchException e) {
                System.out.println("Gecersiz bir giris yaptiniz");
                input.next(); // dummy scanner
            }
        }
        while (true) {
            try {
                System.out.println("Final notunu girin");
                finalNotu = input.nextInt();
                if (finalNotu < 0 || finalNotu > 100) {
                    throw new ArithmeticException();
                } else {
                    break;
                }
            } catch (ArithmeticException e) {
                System.out.println("Notlar 0-100 arasında olmalı");
            } catch (InputMismatchException e) {
                System.out.println("Gecersiz bir giris yaptiniz");
                input.next(); // dummy scanner
            }
        }
        double ortalama = (vizeNotu * 0.4) + (finalNotu * 0.6);

        if (ortalama >= 70) {
            System.out.println(ortalama + "- Basarili");
        } else {
            System.out.println(ortalama + "- Basarisiz");
        }
    }
}

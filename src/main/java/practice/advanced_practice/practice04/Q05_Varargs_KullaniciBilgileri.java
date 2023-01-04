package practice.advanced_practice.practice04;

import java.util.Arrays;
import java.util.Scanner;

public class Q05_Varargs_KullaniciBilgileri {
    public static void main(String[] args) {

        // Ad, soyad, yaş ve bugüne dek yaşanılmış sehirler
        // bilgilerini parametre olarak alıp
        // yazdıran bir method oluşturunuz.

        bilgiler("tarik", "erdur", 24, "Izmir", "Kayseri", "Ankara", "Konya", "Diyarbakir");
        System.out.println("\n");
        bilgiler2("tarik", "erdur", "24", "Izmir", "Kayseri", "Ankara", "Konya", "Diyarbakir");


    }

    public static void bilgiler(String name, String surname, int age, String... cities) {

        System.out.println("Ad\t\t\t: " + name.toUpperCase());
        System.out.println("Soyad\t\t: " + surname.toUpperCase());
        System.out.println("Yas\t\t\t: " + (age));
        System.out.print("Sehirler\t: ");
        for (String w : cities) { // varargslar array gibi calistigi icin for each kullandik
            System.out.print(w + " ");
        }
    }

    public static void bilgiler2(String... bilgiler) {

        for (int i = 0; i < bilgiler.length; i++) {
            if (i == 0) {
                System.out.println("Ad\t\t\t: " + bilgiler[i].toUpperCase());
            } else if (i == 1) {
                System.out.println("Soyad\t\t: " + bilgiler[i].toUpperCase());
            } else if (i == 2) {
                System.out.println("Yas\t\t\t: " + bilgiler[i]);
                System.out.print("Sehirler\t: ");
            } else {
                System.out.print(bilgiler[i] + " ");
            }
        }

    }


}

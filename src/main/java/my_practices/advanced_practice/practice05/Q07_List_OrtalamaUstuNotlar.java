package my_practices.advanced_practice.practice05;

import java.util.ArrayList;
import java.util.Scanner;

public class Q07_List_OrtalamaUstuNotlar {
    public static void main(String[] args) {
        // Bir öğretmenden girmek istediği kadar notu alınız, ve ortalamayı geçen öğrenci sayısını bulunuz.
        Scanner input = new Scanner(System.in);
        ArrayList<Double> notlar = new ArrayList<>();
        String karar = "";
        int sayac = 0;

        // Kullanicidan istedigi kadar not girmesini hallettik
        do {
            sayac++;
            System.out.println(sayac + ". notu giriniz");
            notlar.add(input.nextDouble());

            System.out.println("Cikmak icin \"H\", yeniden not girmek icin herhangi bir karakter giriniz.");
            karar = input.next();

        } while (!karar.equalsIgnoreCase("H")); // H'ye basmadigi surece devam edecek

        System.out.println("Notlar : " + notlar);

        // Ortalamayi hesaplicaz
        double toplam = 0;
        for (double w : notlar) {
            toplam += w;
        }

        double ortalama = toplam / notlar.size();
        System.out.println("Ortalama : " + ortalama);


        // ortalama ustu not sayisini bulalim
        int ortalamaUstuNotSayisi = 0;
        for (double w : notlar) {
            if (w > ortalama) {
                ortalamaUstuNotSayisi++;
            }
        }
        System.out.println("Ortalama ustu not sayisi : " + ortalamaUstuNotSayisi);


    }
}

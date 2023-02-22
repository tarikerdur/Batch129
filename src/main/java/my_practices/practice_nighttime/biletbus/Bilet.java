package my_practices.practice_nighttime.biletbus;

import java.util.Scanner;

public class Bilet {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int km = 0, yas = 0, yolculukTipi = 1; // assigned default values
        String plakaNumarasi = "35AKL565";

        System.out.println("Lutfen gideceginiz mesafeyi \"km\" olarak veriniz:");
        km = input.nextInt();
        System.out.println("Lutfen yasinizi giriniz:");
        yas = input.nextInt();
        System.out.println("Lutfen yolculuk tipinizi seciniz:\n1- Tek Yon\n2- Gidis-Donus");
        yolculukTipi = input.nextInt();
        if (km > 0 && yas > 0 && (yolculukTipi == 1 || yolculukTipi == 2)) {
            double biletUcreti = km * 0.10; // standard ticket price
            double yasIndirimOrani = 0;
            if (yas < 12) {
                yasIndirimOrani = 0.5;
            } else if (yas < 24) {
                yasIndirimOrani = 0.1;
            } else if (yas > 65) {
                yasIndirimOrani = 0.3;
            }
            biletUcreti -= biletUcreti * yasIndirimOrani;
            if (yolculukTipi == 2) {
                biletUcreti -= biletUcreti * 0.2;
                biletUcreti *= 2;
            }
            biletDokum(plakaNumarasi, km, yolculukTipi, biletUcreti);
        } else {
            System.out.println("Hatali veri girdiniz.!!!");
        }
    }


    private static void biletDokum(String plakaNumarasi, int km, int yolculukTipi, double biletUcreti) {
        String dokum = "=============== BILET YAZDIRILIYOR ================\n" +
                "Otobusun Plakasi\t: " + plakaNumarasi + "\n" +
                "Mesafe\t\t\t\t: " + km + " km\n" +
                "Yolculuk Tipi\t\t: " + (yolculukTipi == 1 ? "Tek Yon" : "Gidis-Donus") + "\n" +
                "Bilet Ucreti\t\t: " + biletUcreti + " TL\n" +
                "*********** KEYIFLI YOLCULUKLAR DILERIZ ***********";
        slowPrint(dokum, 25);
    }

    public static void slowPrint(String text, int delay) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
package my_practices.advanced_practice.practice07;

import java.util.Scanner;

public class Q02_TasKagitMakas {
    public static void main(String[] args) {

                /*
            Taş-Kağıt-Makas oyunu yazınız.
            -Oyuncudan tahmin alınız.
            -Bilgisayarın tahmini ile karşılaştırınız.
            -3'e ilk ulaşan kazanır
            -3 farkla kazanan Altın Skor, 2 farkla kazanan Gümüş Skor, 1 farkla kazanan Bronz Skor ile kazanır.
                */
        Scanner input = new Scanner(System.in);

        int oyuncununKazanmaSayisi = 0;
        int bilgisayarinKazanmaSayisi = 0;

        int sayac = 0;

        while (oyuncununKazanmaSayisi < 3 && bilgisayarinKazanmaSayisi < 3) {
            sayac++;
            System.out.println(sayac + ". secimi giriniz:\nTas Kagit Makas");
            String oyuncuTahmini = input.nextLine().toLowerCase().replaceAll(" ", "");

            if (!(oyuncuTahmini.equals("tas") || oyuncuTahmini.equals("kagit") || oyuncuTahmini.equals("makas"))) {
                System.out.println("Gecerli bir tahmin girmediniz tekrar giriniz");
                sayac--;
                continue;
            }


            String[] arrTasKagitMakas = {"tas", "kagit", "makas"};
            int rastgeleIdx = (int) (Math.random() * 3); // 0,1,2 uretecek
            String bilgisayarTahmini = arrTasKagitMakas[rastgeleIdx];
            System.out.println("Bilgisayar tahmini : " + bilgisayarTahmini);


            if (oyuncuTahmini.equals(bilgisayarTahmini)) {
                System.out.println("\nBerabere! Skor : " + oyuncununKazanmaSayisi + "==" + bilgisayarinKazanmaSayisi);

            } else if ((oyuncuTahmini.equals("tas") && bilgisayarTahmini.equals("makas")) ||
                    (oyuncuTahmini.equals("kagit") && bilgisayarTahmini.equals("tas")) ||
                    (oyuncuTahmini.equals("makas") && bilgisayarTahmini.equals("kagit"))) {
                oyuncununKazanmaSayisi++;
                System.out.println("\nKazandiniz! Skor : " + oyuncununKazanmaSayisi + "==" + bilgisayarinKazanmaSayisi);
            } else {
                bilgisayarinKazanmaSayisi++;
                System.out.println("\nKaybettiniz! Skor : " + oyuncununKazanmaSayisi + "==" + bilgisayarinKazanmaSayisi);
            }
        }

        System.out.println("<<<<< GAME OVER >>>>>");

        String skor;
        if (oyuncununKazanmaSayisi == 3) {
            if (bilgisayarinKazanmaSayisi == 0) {
                skor = "ALTIN";
            } else if (bilgisayarinKazanmaSayisi == 1) {
                skor = "GUMUS";
            } else {
                skor = "ALTIN";
            }
            System.out.println(skor + " ile kazandiniz! TEBRIKLER!!!");
        } else {
            if (oyuncununKazanmaSayisi == 0) {
                skor = "ALTIN";
            } else if (oyuncununKazanmaSayisi == 1) {
                skor = "GUMUS";
            } else {
                skor = "BRONZ";
            }
            System.out.println("Bilgisayar " + skor + " skorla kazandi!!!");
        }


    }
}

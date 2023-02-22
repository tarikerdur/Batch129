package mini_project_arac_sigorta;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AracSigortaApplication {


    /*
    Proje: Araç Sigorta Prim Hesaplama
           Araç tipleri:otomobil, kamyon, otobüs, motosiklet
                                         -otobüs: 18-30 koltuk veya 31 ve üstü koltuk

           Tarife dönemi:Aralık 2022,Haziran 2022
           1.dönemi  Haziran 2022                2.dönem Aralik 2022
              otomobil: 2000                       otomobil: 2500
              kamyon:   3000                       kamyon:   3500
              otobüs: tip1: 4000 tip2: 5000        otobüs: tip1: 4500 tip2: 5500
              motosiklet: 1500                     motosiklet: 1750
            Hatalı girişte hesaplama başarısız uyarsı verip tekrar menü gösterilsin.
    */
    public static void main(String[] args) {

        start();


    }

    public static void start() {
        Scanner input = new Scanner(System.in);
        boolean isFail; // hesaplamanin durumunu kontrol etmek icin bir flag tanimliyoruz.
// Hatali giriste veya yeni islem secenegi sunmak icin menu tekrar gosterilsin istiyoruz.
        do {
            System.out.println("---Zorunlu Sigorta Primi Hesaplama---\n");
            System.out.println("Tarife Donemi seciniz (1 - 2)");
            System.out.println("1. Haziran 2022");
            System.out.println("2. Aralik 2022");
            int term = 0;
            try {
                term = input.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("\tGecersiz giris yaptiniz lutfen sayi giriniz");
            }
            input.nextLine(); // dummy

            // girilen donem gecerli mi?
            if (term == 1 || term == 2) {
                Arac arac = new Arac();
                String termName = term == 1? "Haziran 2022":"Aralik 2022";
                System.out.println("Arac tipini giriniz");
                System.out.println("(otomobil, kamyon, otobüs, motosiklet)");
                String select = input.next();

                arac.type = select;
                arac.countPrim(term);
                if (arac.prim>0) {
                    System.out.println("\tHesaplama islemi basariyla tamamlandi.");
                    System.out.println("\t\tArac Tipi\t\t\t: " + arac.type);
                    System.out.println("\t\tTarife Donemi\t\t: " + termName);
                    System.out.println("\t\tSigorta prim tutari\t: " + arac.prim);
                    isFail = isAgain(input);
                } else {
                    System.out.println("Hesaplama basarisiz. Tekrar deneyiniz");
                    isFail = isAgain(input);
                }

            } else {
                System.out.println("\tHatali giris. Tekrar deneyiniz.");
                isFail = true;
            }

        } while (isFail);
        System.out.println("Iyi gunler dileriz.");

    }

    private static boolean isAgain(Scanner input) {
        boolean isFail;
        System.out.println("\nYeni islem icin 1\nCikis icin 0\nGiriniz.");
        int choice = input.nextInt();
        if (choice == 1) {
            isFail = true;
        } else {
            isFail = false;
        }
        return isFail;
    }

}

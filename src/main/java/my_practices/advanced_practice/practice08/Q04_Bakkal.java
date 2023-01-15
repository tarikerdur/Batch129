package my_practices.advanced_practice.practice08;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q04_Bakkal {

            /*
        Bakkal günlük gelir programı yazınız.
         -Tüm günlerin gelirlerini gösteren bir method,
         -Haftalık gelir ortalamasını gösteren bir method,
         -Hangi günlerin ortalama gelirden fazla geliri olduğunu gösteren bir method,
         -Hangi günlerin ortalama gelirden az geliri olduğunu gösteren bir method,
         -Hangi günlerin ortalama gelire eşit olduğunu gösteren bir method oluşturunuz.
            */

    static List<String> gunler = new ArrayList<>(Arrays.asList("Pazartesi", "Sali", "Carsamba", "Persembe", "Cuma", "Cumartesi", "Pazar"));
    static List<Double> gunlukKazanclar = new ArrayList<>();
    static double toplamKazanc = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int gun = 0;
        while (gun < 7) {
            System.out.println(gunler.get(gun) + " gununun kazancini giriniz.");
            double kazanc = input.nextDouble();
            gunlukKazanclar.add(kazanc);
            toplamKazanc += kazanc;
            gun++;
        }
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        System.out.println("Gunluk Kazanclar : " + gunlukKazanclar);
        System.out.println("Toplam Kazanc : " + toplamKazanc);
        System.out.println("Ortalama Kazanc : " + decimalFormat.format(ortalamaGelir()));
        System.out.println("Ortalama ustu gunler : " + ortalamaUstuGunler());
        System.out.println("Ortalama alti gunler : " + ortalamaAltiGunler());
        System.out.println("Ortalama gelirli gunler : " + ortalamaGunler());
    }

    static double ortalamaGelir() {
        return toplamKazanc / gunler.size();
    }

    static String ortalamaUstuGunler() {
        String str = "";
        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            if (gunlukKazanclar.get(i) > ortalamaGelir()){
                str += gunler.get(i) + " ";
            }
        }
        return str;
    }
    static String ortalamaAltiGunler() {
        String str = "";
        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            if (gunlukKazanclar.get(i) < ortalamaGelir()){
                str += gunler.get(i) + " ";
            }
        }
        return str;
    }
    static String ortalamaGunler() {
        String str = "";
        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            if (gunlukKazanclar.get(i) == ortalamaGelir()){
                str += gunler.get(i) + " ";
            }
        }
        return str;
    }
}
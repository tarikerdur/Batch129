package my_practices.advanced_practice.practice03;

import java.util.ArrayList;
import java.util.Scanner;

public class Q02_List_EkleCikar {
    public static void main(String[] args) {
        // Kullanıcıdan aldığınız bir sayıyı bir list'e ekleyen,
        // list'ten çıkaran yada mevcut bir elementi o sayı ile
        // güncelleyen bir kod yazınız.
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Ekleme yapmak icin \"add\"\n" +
                    "Element guncellemek icin \"set\"\n" +
                    "Element silmek icin \"remove\"\n" +
                    "Cikmak icin \"break\" komutunu giriniz.");
            String komut = input.next();
            if (komut.equalsIgnoreCase("add")) {
                System.out.println("Eklemek istediginiz tam sayiyi giriniz.");
                list.add(input.nextInt());
            } else if (komut.equalsIgnoreCase("set")) {
                System.out.println("Guncellemek istediginiz sayiyi giriniz.");
                int GuncellenecekIndex = list.indexOf(input.nextInt());
                // Kullanici indexin ne demek oldugunu bilmez.
                // Bu yuzden guncellenmek istenen sayinin indexini methodla bulduk
                System.out.println("Yerine eklemek istediginiz sayiyi giriniz.");
                Integer yeniSayi = input.nextInt();
                list.set(GuncellenecekIndex, yeniSayi);
            } else if (komut.equalsIgnoreCase("remove")) {
                System.out.println("Silmek istediginiz sayiyi giriniz.");
                Integer silinecekSayi = input.nextInt();
                    /*
                        remove() methodunda primitive girersek index olarak algilar.
                        wrapper olarak girersek obje olarak direkt belirttigimiz sayi ile islem yapar.
                    */
                list.remove(silinecekSayi);
            } else if (komut.equalsIgnoreCase("break")) {
                break;
            } else {
                System.out.println("Gecerli bir komut giriniz");
            }
            System.out.println(list);
        }
        System.out.println("Gule Gule");
        System.out.println("List : " + list);
    }
}

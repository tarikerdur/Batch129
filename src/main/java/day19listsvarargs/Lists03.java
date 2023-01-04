package day19listsvarargs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Lists03 {

    public static void main(String[] args) {

        /*
                        SAYI TAHMIN OYUNU
            Oyuncudan 1-10 arasi bir sayi isteyiniz
            Elinizdeki listede oyuncunun tahmin ettigi sayi varsa "BINGO" yazdiriniz
            Yoksa verdigi sayiyi listenize ekleyiniz.
            Ilk "BINGO" yu tamamlayana " KAZANDINIZ" yazdiriniz
            [5,8,2,9]  ==> 2 ==> [5,8,BINGO,9]
            [5,8,2,9]  ==> 3  ==>[5,8,BINGO,9,3]
            [5,8,BINGO,9,3] ==> [BINGO,BINGO,BINGO,BINGO,BINGO] ==> KAZANDINIZ
        */

        Scanner input = new Scanner(System.in);
//        List<Integer> numsList = Arrays.asList(5,8,2,9); // List gorunumlu Array. Yani Array'i List'e cevirdik.
//        numsList.add(9); // Unsupported Operation Exception
//        numsList.remove(1); // Unsupported Operation Exception
//        numsList.clear(); // Unsupported Operation Exception
        /*
            Arrays.asList() ile list olusturulabilir.
            Ama List'leri sifirdan yaratmak yerine;
            Array'leri List'e cevirirsek (asList() methodu) List'imiz Array gibi muamele gorur.
            Mesela sinirli sayidadir. Icindeki ELEMAN SAYISI degisemez, Ayni Array gibi.

            Bu soruda eleman ekleme ihtimalimiz oldugundan
            Arrays.asList() kullanarak List olusturmamaliyiz.
        */

        System.out.println("Oyunumuza hos geldiniz...\n" +
                "Oyunu sonlandirmak icin Q'ya basin...");

        ArrayList<String> numsList = new ArrayList<>();
        numsList.add("5");
        numsList.add("8");
        numsList.add("2");
        numsList.add("9");

        int counter = 0;
        String num = "";

        do {
            System.out.println("Lutfen 1 ile 10 arasinda bir tam sayi giriniz...");
            num = input.next();

            if (num.equalsIgnoreCase("q")) {
                break;
            } else if (numsList.contains(num)) {
                numsList.set(numsList.indexOf(num), "BINGO");
                counter++;
            } else {
                numsList.add(num);
            }
        } while (counter != numsList.size()); // Bingo olunca loop dursun.


        if (!num.equalsIgnoreCase("Q")) {
            System.out.println("Kazandiniz");
        } else {
            System.out.println("Oyundan isteyerek ayrildiniz. Tekrar bekleriz");
        }

        System.out.println("Final report : " + numsList);
    }
}

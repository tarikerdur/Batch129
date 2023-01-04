package day11loops_sule_hoca;

import java.util.Scanner;

public class C04_ForLoop {
    public static void main(String[] args) {
        /*  interview questions
        Reverse order (Tersten sirala)

                    1'den 100'e kadar 6 ile bolunenler haric tum tam sayilari ekrana yazdir
        */

        for (int i = 1; i < 100; i++) {
            if (i % 6 == 0) {
                continue; // continue methodu sadece bu durum icin loopu 1 seferlik kirar. break tamamen loopu kirar.
            }
            System.out.print(i+"  ");
        }

        // Bu da Fatih picinin fantezili kodu kfjkdjdflh
        Scanner input = new Scanner(System.in);

        System.out.println("\nLütfen baslangic ve bitis degerlerini giriniz...");
        int start = input.nextInt();
        int end = input.nextInt();

        altiyaBolunmeyen(start,end);
    }

    public static void altiyaBolunmeyen(int a, int b) {
        for (int i = a; i < b + 1; i++) {
            if (i % 6 == 0) {
                continue;
            }
            System.out.print(i + "  ");
        }

        // Size verilen Stringi ters ceviren kodu yazin
        String str = "Tarik Erdur"; // ==> rudrE kiraT
        String reverseStr = ""; // yeni bir container olusturduk

        for (int i = str.length() - 1; i >= 0; i--) { //int i = str.length()-1 ===> i'nin ilk baslangic yeri
            // Stringin son karakterinden basa dogru gidecek.
            char harf = str.charAt(i); // en son karakterden basa dogru charlari alip harfe aticak.
            reverseStr += harf; // atanan harfleri tersStr container'in icine aticak.
            // son harften aldigimiz icin sondan basa dogru tersten String'imiz yazilmis olucak.
        }
        System.out.println(reverseStr);

    }
}


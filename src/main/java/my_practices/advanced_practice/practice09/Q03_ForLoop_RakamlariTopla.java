package my_practices.advanced_practice.practice09;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Q03_ForLoop_RakamlariTopla {

    public static void main(String[] args) {

            /*
     Kullanıcıdan alınan bir String içerisindeki rakamların toplamını hesaplayan bir method yazınız.
         Örn:
         input : J4\/4 1$ 34$¥
         output : 16

         İpucu:
         Character.isDigit()
         Integer.valueOf()
            */

        Scanner input = new Scanner(System.in);
        System.out.println("String gir");

        double sonuc = rakamlariTopla(input.nextLine());

        System.out.println("sonuc = " + sonuc);

    }

    public static double rakamlariTopla(String str) {
        int toplam = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                toplam += Integer.parseInt(str.substring(i, i + 1));
            }
        }
        return toplam;
    }


}

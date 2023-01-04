package day08nestedifternary;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {

        // EXAMPLE 1: Kullanicidan iki sayi aliniz "Buyuk olmayan" (Kucuk veya esit olan) sayiyi yazdirin.

        Scanner input = new Scanner(System.in);
        System.out.println("Iki sayi giriniz...");
        double a = input.nextDouble();
        double b = input.nextDouble();

        // 1. Yol
        if (a<b){
            System.out.println(a);
        } else {
            System.out.println(b);
        }

        // 2. YOL (TERNARY YOLU) ===> if ile ayni mantiktadir. Sadece soz dizimi farkli.
                                    // Ancak karisik isler icin kullanilmasi tavsiye edilmez.
        // conditionaldan elde edilecek datayi return adinda bir container'in icine koymamiz lazim.
        double result =     a<b          ?            a           :           b               ;
        //               Condition       ?      true ise calisir  :    false ise calisir      ;
        // soru isareti ile ":" arasindaki ilk kisim true, diger taraf false'dir.
        System.out.println(result);


    }
}

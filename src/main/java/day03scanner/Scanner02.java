package day03scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanicidan ilk ismini ve soy ismini alip ikisini ayni satirda ekrana yazdiriniz.

        System.out.println("Ilk isminizi giriniz...");
        String firstname = input.next(); // next() methodu kullanicidan tek kelimeli Stringleri almak icin kullanilir.

        System.out.println("Soy isminizi giriniz");
        String lastName = input.next();

        System.out.println("Kullanicinin adi ve soyadi : " + firstname + " " + lastName);


    }

}

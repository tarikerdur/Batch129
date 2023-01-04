package day03scanner;

import java.util.Scanner;

public class Scanner06 {

    public static void main(String[] args) {

        /* Kullanicidan alinan 5 basamakli sayi al
        bu sayinin ilk iki ve son iki basamagindaki rakamlarin toplamini yazdir
         */
        Scanner input = new Scanner(System.in);

        System.out.println("5 basamakli bir sayi gir");
        int number = input.nextInt();
                if (number<=99999 && number>=10000) {
                    // sondan 1. rakam
                    int lastDigit = number % 10; // Java'da bu islem sayiyi 10'a boler kalani yani son rakami bize verir. Modulus operator = % isareti
                    number = number / 10;  // Java'da bu islem sayiyi 10'a bolerek sayiyi kucultur ve yeni sayimizi kuculterek eski sayinin yerine koyar.

                    // sondan 2. rakam
                    int lastSecondDigit = number % 10;
                    number = number / 10;

                    //sondan 3. rakam
                    int lastThirdDigit = number % 10;
                    number = number / 10;

                    //sondan 4. rakam
                    int lastFourthDigit = number % 10;
                    number = number / 10;

                    // sondan 5. rakam
                    int lastFifthDigit = number % 10;

                    System.out.println(lastDigit + lastSecondDigit + lastFifthDigit + lastFourthDigit);
                } else System.out.println("5 basamakli bir sayi girmediniz");
    }
}

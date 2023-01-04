package day07ifstatements;

import java.util.Scanner;

public class ifStatement06 {
    public static void main(String[] args) {
                      /*
                 EXAMPLE 1:
                       Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu
                 asagidaki tabloya gore yazdiran kodu olusturunuz
                 0-4 ==> bebek
                 5-12 ==> cocuk
                 13-20 ==> genc
                 21-30 ==> yetiskin
                 30 ustu ==> Tanimlanmamis Evre
                 Yas 0'dan kucuk olamaz. Hata Mesaji olarak "Gecerli bir yas giriniz" yazdiriniz
                       */

        Scanner input = new Scanner(System.in);
        System.out.println("Yasini gir");
        int age = input.nextInt();

        if (age<0){// if else'lerde siralama onemlidir. ya en bastan ya da en sondan conditionslari olusturmaya baslayin, dedi.
            System.out.println("Gecerli bir yas giriniz");
        } else if (age<5){// Java 2 is yapmasin diye <= veya >= kullanmak yerine > veya < kullanacak sekilde yazalim, dedi
            System.out.println("Bebek");
        } else if (age<13) {// Java 2 is yapmasin diye <= veya >= kullanmak yerine > veya < kullanacak sekilde yazalim, dedi
            System.out.println("Cocuk");
        } else if (age<21) {// Java 2 is yapmasin diye <= veya >= kullanmak yerine > veya < kullanacak sekilde yazalim, dedi
            System.out.println("Genc");
        } else if (age<31) {// Java 2 is yapmasin diye <= veya >= kullanmak yerine > veya < kullanacak sekilde yazalim, dedi
            System.out.println("Yetiskin");
        } else { // age > 30 ustu ise;
            System.out.println("Tanimlanmamis evre");
        }
    }
}

package my_practices.advanced_practice.practice01;

import java.util.Scanner;

public class Q04_Regex_Ad_Soyad {
        /*
        BU UYGULAMA SADECE 1 AD 1 SOYAD GIRENLER ICIN CALISIR. 3 ISIMDE CALISMAZ

           Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
           ad ayrı soyad ayrı sekilde ekrana yazdırınız.
           Örn:
           Ad: Ali
           Soyad: Can

           "\\s+" ==> 1'den fazla bosluklari belirtmek icin kullandigimiz regex


        */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name and surname in one time : ");
                                                      // tum harfler ve bosluk disinda her seyi sildik
        String nameSurname = input.nextLine().replaceAll("[^a-zA-ZıİöÖğĞüÜşŞ ]","").
                replaceAll("\\s+"," "). // icerde kalan 1'den fazla tum bosluklari sil onlarin yerine tek bosluk koy dedik
                trim();
                    // "\\s" bir bosluk "\\s+" bir veya birden fazla bosluk anlamina gelir.
        String splittedName = nameSurname.split(" ")[0]; // array olarak dizede 0. indexe aldik
        String splittedSurname = nameSurname.split(" ")[1]; // array olarak dizede 1. indexe aldik

        splittedName = splittedName.substring(0,1).toUpperCase()
                + splittedName.substring(1).toLowerCase(); // ad sadeceilk harf buyuk olsun

        splittedSurname = splittedSurname.toUpperCase(); // soyad buyuk olsun

        System.out.println("name : " + splittedName);
        System.out.println("surname : " + splittedSurname);





    }
}

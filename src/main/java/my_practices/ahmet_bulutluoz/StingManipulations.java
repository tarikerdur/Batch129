package my_practices.ahmet_bulutluoz;

import java.util.Locale;
import java.util.Scanner;

public class StingManipulations {
    public static void main(String[] args) {
        /*
        Kullanicidan gun ismi girmesini isteyin girilen gun hafta ici ise "simdi calisma zamani tatile x gun var"
        seklinde hafta sonu tatiline kac gun kaldigini yazdirin
        girilen gun hafta sonu ise "Simdi dinlenme zamani" yazdir
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen gun ismini giriniz");
        String girilenGun = input.next();
               girilenGun = girilenGun.toLowerCase(Locale.forLanguageTag("Tr")).
                            substring(0,1).toUpperCase(Locale.forLanguageTag("Tr")) +
                            girilenGun.substring(1).toLowerCase(Locale.forLanguageTag("Tr"));
                            // Sadece ilk harfi buyuk devami kucuk harf yazdiran methodu yazmaya calistim.

        System.out.println(girilenGun.concat(" <==> OWWW YEEEAASSSSSSS I DID IT"));
        /*
        String ifadeler case sensitive'dir.
        Kullanicinin pazar, Pazar, pAzaR, ... seklinde yazma ihtimali karsisinda
        toUpperCase() veya toLowerCase() methodu kullanmak lazim.
         */

        switch (girilenGun){
            case "Pazartesi":
                System.out.println(girilenGun + " calisma zamanidir. Tatile 5 gun var.");
                break;
            case "Sali":
                System.out.println(girilenGun + " calisma zamanidir. Tatile 4 gun var.");
                break;
            case "Carsamba":
                System.out.println(girilenGun + " calisma zamanidir. Tatile 3 gun var.");
                break;
            case "Persembe":
                System.out.println(girilenGun + " calisma zamanidir. Tatile 2 gun var.");
                break;
            case "Cuma":
                System.out.println(girilenGun + " calisma zamanidir. Tatile 1 gun var.");
                break;

            case "Cumartesi":
            case "Pazar":
                System.out.println("Simdi dinlenme zamani.");
                break;

            default:
                System.out.println("Yanlis gun ismi");


        }

    }
}

package day13whileloopdowhileloop;

import java.util.Scanner;

public class DoWhileLoop03 {
    public static void main(String[] args) {

            /*
                gecerli     username = "admin"
                            password = "pwd123"
                  kullanicidan username ve passwordu alin.
                  1) username ve password dogru ise "Hesabiniza Hosgeldiniz!" yazdir.
                  2) username veya password yanlis ise 4 kere "username ve passwordunuzu giriniz" mesaji versin.
                  3) username veya password 3 kereden fazla (4. kez) yanlis girilirse "Hesabiniz Bloke Olmustur"
              mesaji vererek islemi tamamlayiniz.
            */
        Scanner input = new Scanner(System.in);

        int counter = 0; // counter = sayac
        do {
            if (counter == 4) {
                System.out.println("Hesabiniz bloke olmustur.");
                break;
            }

            System.out.println("Username'inizi giriniz");
            String username = input.next();
            System.out.println("Password'unuzu giriniz");
            String password = input.next();

            if (username.equals("admin") && password.equals("pwd123")) {
                System.out.println("Hesabiniza Hosgeldiniz!!!");
                break;
            }
            counter++;

        } while (true); /* Loop'u "break;" kullanarak kendimiz kiracagimiz icin buraya bir sart koymadik.
                           "true" yazip calismasini saglamamiz yeterli, dedi. */


    }
}

package day08nestedifternary;

import java.util.Scanner;

public class NestedIf03 {
    public static void main(String[] args) {

                /*
                Password'un ilk harfi buyuk harf ise
                 'A' olursa gecerli password yazdirin degilse gecersiz password yazdirin

                 Passwordun ilk harfi kucuk harf ise
                  'z' olursa gecerli passworde yazdirin degilse gecersiz password yazdirin
                 */

        Scanner input = new Scanner(System.in);
        System.out.println("Passwordunuzu giriniz");
        String pwd = input.nextLine();

        char firstChar = pwd.charAt(0); /* Methodu birden fazla kullanmak yerina burada yaptigimiz gibi
                                        bir kez kullanip sonucu bir variable'a assign edin.
                                        Sonra bu variable'i her yerde kullanin.
                                        Yoksa bu Java'da pek bilgili degil derler, dedi.
                                        */

        if (firstChar>='A' && firstChar<='Z'){ // Ilk harf buyuk harf mi kontrolu

            if (firstChar=='A'){ // password gecerli mi kontrolu
                System.out.println("Gecerli Password");
            } else {
                System.out.println("Gecersiz Password Cunku buyuk harf ama 'A' degil...");
            }
        } else if (firstChar>='a' && firstChar<='z'){ // Ilk harf kucuk harf mi kontrolu
            if (firstChar=='z'){ // password gecerli mi kontrolu
                System.out.println("Gecerli password");
            } else {
                System.out.println("Gecersiz Password Cunku kucuk harf ama 'z' degil...");
            }
        } else {
            System.out.println("Ilk character HARF olmali"); // Harf disinda bir sey ilk karakter olur ise bu yazar.
        }
    }
}

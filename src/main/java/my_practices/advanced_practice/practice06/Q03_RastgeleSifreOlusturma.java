package my_practices.advanced_practice.practice06;
import java.util.Scanner;

public class Q03_RastgeleSifreOlusturma {
    public static void main(String[] args) {
        //Kullanıcıdan aldığınız sayi kadar karakter uzunluğuna sahip rastgele şifre üreten bir kod yazınız.

        Scanner input = new Scanner(System.in);
        System.out.println("Karakter sayisini girin");
        int karakterSayisi = input.nextInt();
        String karakterler ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int maxIndex = karakterler.length();
        String pwd = "";

        int counter = 0;
        while (counter<karakterSayisi){
            int rastgeleIndex = (int) (Math.random() * maxIndex);
            // random sayimiz "karakterler"in sonuna kadar olan kisimdan bir deger dondursun diye carptik.
            pwd += karakterler.charAt(rastgeleIndex);
            counter++;
        }
        System.out.println("Sifre = "+pwd);

    }
}

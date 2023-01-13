package my_practices.advanced_practice.practice06;

import java.util.Scanner;

public class Q01_Ascii_Karakterler {
    //Kullanıcıdan aldığınız iki karakterin arasında bulunan tüm karakterleri yazdıran bir kod yazınız.
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first char");
        char ch1 = input.next().charAt(0);
        System.out.println("Enter the second char");
        char ch2 = input.next().charAt(0);

        // ilk karakter ikinci karakterden buyuk girilirse diye ;
        int first = Math.min(ch1, ch2);
        int second = Math.max(ch1, ch2);
        // limitlerimizi belirledik
        for (int i = first + 1; i < second; i++) {
            System.out.print((char) i + " ");
        }


    }
}

package day03scanner;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz.
        // Normalde hoca habire sout yazip yapti ama ben fantezi olsun diye method olusturup yaptim.

        System.out.println("Iki adet sayi girin");
        double firstNum = input.nextDouble();
        double secondNum = input.nextDouble();

        toplama(firstNum,secondNum);
        System.out.println(toplama(firstNum,secondNum));

        cikarma(firstNum,secondNum);
        System.out.println(cikarma(firstNum,secondNum));

        carpma(firstNum,secondNum);
        System.out.println(carpma(firstNum,secondNum));

        bolme(firstNum,secondNum);
        System.out.println(bolme(firstNum,secondNum));

    }
    public static double toplama (double a, double b){
        return a+b;
    }
    public static double cikarma (double a, double b){
        return a-b;
    }
    public static double carpma (double a, double b){
        return a*b;
    }
    public static double bolme (double a, double b){
        return a/b;
    }

}

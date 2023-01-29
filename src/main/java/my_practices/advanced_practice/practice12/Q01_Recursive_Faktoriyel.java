package my_practices.advanced_practice.practice12;

import java.util.Scanner;

public class Q01_Recursive_Faktoriyel {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the num that you want to taking factorial...");
        int num = input.nextInt();

        //Faktoriyel hesaplayan bir method yazınız.(Loop kullanmayınız.)

        try {
            System.out.println(faktoriyel(num));
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Absolute Value = " + faktoriyel(Math.abs(num)));
        }

    }

    static int faktoriyel(int sayi) {

        if (sayi>=0){
            if (sayi == 0 || sayi == 1) {
                return 1;
            } else {
                return sayi * faktoriyel(sayi-1);
            }
        } else {
            throw new ArithmeticException("\"" + sayi + "\", can not be less than zero.");
        }
    }
}

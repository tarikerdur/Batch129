package practice.advanced_practice.practice02;

import java.util.Scanner;

public class Q02_If_Diskriminant {

    /* Günün sorusu: if statement
      katsayıları verilen 1 bilinmeyenli denklemin kökleriniz bulunuz.
        ax² + bx + c;
        Çözüm adımları
        kullanıcıdan a,b,c yi alın.
        Diskriminant formülü: (-b +/- karekök(delta)) / (2a)
        Delta = bb - 4ac
        Delta > 0 => 2 tane kök vardır x1=(-b + kök(d)) / (2a)  , x2= (-b - kök(d)) / (2*a)
        Delta = 0 => 1 tane kök vardır x = -b/2a
        Delta < 0 ise kök yoktur.
    */

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("a, b, c'yi gir");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double delta = b * b - 4 * a * c;


        double kok1 = 0;
        double kok2 = 0;
        double kok3 = 0;

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Denkleminiz : " + (int) a + "x²+" + (int) b + "x+" + (int) c);
            System.out.println("Denklemin 2 koku vardir : x1 = " + x1 + " ve x2 = " + x2);
        } else if (delta == 0) {
            double x3 = -b / (2 * a);
            System.out.println("Denkleminiz : " + (int) a + "x²+" + (int) b + "x+" + (int) c);
            System.out.println("Denklemin 1 koku vardir : x = " + x3);
        } else { // delta < 0
            System.out.println("Denklemin koku yoktur.");
        }


    }
}

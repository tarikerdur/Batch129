package my_practices.advanced_practice.practice08;

import java.util.Scanner;

public class Q05_Inheritance {

    // Dairenin alanını hesalayan bir method oluşturunuz.
    // (matematik işlemleri için inheritance kullanınız)
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Yari cap gir");
        daireAlani(input.nextDouble());

    }


    static void daireAlani(double r) {

        Daire daireObjesi = new Daire();
        System.out.println(daireObjesi.carpma(daireObjesi.piSayisi , daireObjesi.karesiniAl(r)));


    }

}

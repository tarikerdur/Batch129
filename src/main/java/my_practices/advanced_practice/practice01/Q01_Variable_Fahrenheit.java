package my_practices.advanced_practice.practice01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q01_Variable_Fahrenheit {
    // Fahrenheit değeri, Celsius değere çeviren kod yazınız.
    // formül: c = (f-32)*5/9

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Fahrenheit degeri giriniz.");
        double f = input.nextDouble();
        double c = (f - 32) * 5 / 9;
        System.out.println("Celcius: " + c);

        DecimalFormat decFormat = new DecimalFormat("0.00");
                                                //pattern'e virgulden sonraki kesir miktarini belirtiyoruz
        // virgulden sonraki ondalik sayisini istedigimiz kadar azaltmak icin
        // Math Class'indan DecimalFormat objesini kullaniyoruz.
        String decimaledC = decFormat.format(c);
        System.out.println(decimaledC); // decimalli sayimiz
        System.out.printf("%.2f",c); // bu da ayni sonucu veren farkli bir yol

    }
}
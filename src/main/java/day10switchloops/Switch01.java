package day10switchloops;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        // break;'in mantigini anlaticam, dedi.

        // Example 1: ay numarasini soyleyince numarasi verilen aydan baslayip 12. aya kadar
        // tum aylarin isimlerini yazdiran kodu yazin.

        Scanner input = new Scanner(System.in);

        System.out.println("Ay numarasi gir");
        byte monthNum = (byte) Math.abs(input.nextByte());

        switch (monthNum) {
            case 1:
                System.out.println("January");
            case 2:
                System.out.println("February");
            case 3:
                System.out.println("March");
            case 4:
                System.out.println("April");
            case 5:
                System.out.println("May");
            case 6:
                System.out.println("June");
            case 7:
                System.out.println("July");
            case 8:
                System.out.println("August");
            case 9:
                System.out.println("September");
            case 10:
                System.out.println("October");
            case 11:
                System.out.println("November");
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Girdiginiz ay numarasina tanimli ay bulunmamaktadir.");
        }
            /*
            Switch'te "byte", "short", "int", "char", "String" KULLANILABILIR.
            Switch'te "long", "double", "float", "boolean" KULLANILMAZ.
                                            "boolean" icin "if else" yeter.
             */


    }

}

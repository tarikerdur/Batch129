package day07ifstatements;

import java.util.Scanner;

public class ifStatement04 {
    public static void main(String[] args) {

        // Example 1: Gun sayisini verdigimizde gun ismini yazan kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Kacinci gun oldugunu giriniz");
        int day = input.nextInt();
             day = Math.abs(day);

        // 1. YOL
        if(day==1){
            System.out.println("Sunday"); // Bati'da hafta pazar gunu basliyormus
        }else if(day==2){
            System.out.println("Monday");
        }else if(day==3){
            System.out.println("Tuesday");
        }else if(day==4){
            System.out.println("Wednesday");
        }else if(day==5){
            System.out.println("Thursday");
        }else if(day==6){
            System.out.println("Friday");
        }else if(day==7){
            System.out.println("Saturday");
        }else{
            System.out.println("Hatalı giris yaptiniz. Lutfen 1 ile 7 arasinda bir sayi giriniz..");
        }

        // 2. YOL
        switch (day) {
            case 1:
                System.out.println("Sunday"); // Bati'da hafta pazar gunu basliyormus
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Hatalı giris yaptiniz. Lutfen 1 ile 7 arasinda bir sayi giriniz..");
        }
    }
}

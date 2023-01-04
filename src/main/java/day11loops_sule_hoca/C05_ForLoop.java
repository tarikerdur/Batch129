package day11loops_sule_hoca;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 5'den 10'a kadar tamsayilarin toplamini bulan kodu yaziniz
        int sum = 0;
        for (int i = 5; i < 11; i++) {
            sum += i;
        }
        System.out.println(sum);//45




        // 6'dan 3'e kadar tam sayilarin carpimini yazan kodu yazin
        int multiply = 1;
        for (int i = 6; i > 2; i--) {
            multiply *= i;            // eger sout'u for body icine yazarsak her loop dongusunde sayilarin carpimini yazar.
        } //for body
        System.out.println(multiply); //360 === biz tek seferde gormek istedigimiz icin sout'y body'nin disina yaziyoruz.


        // Bir tam sayinin rakamlarinin toplamini bulan kodu yazin
        System.out.println("Sayi gir");

        int num = input.nextInt();
        num = Math.abs(num);

        int sonuc = 0;

        for (int i = num; i > 0; i /= 10) { // son rakami aldiktan sonra son rakami kesip atmamiz lazim.
            // 10'a boleriz. int kesirden sonrasini almayacagi icin sayiyi azaltiriz.
            sonuc += i % 10; // son rakami almak icin magelous yapiyoruz
        }
        System.out.println(sonuc);

    }
}


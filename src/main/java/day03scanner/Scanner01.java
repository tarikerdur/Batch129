package day03scanner;

import java.util.Scanner; // Java'nin utill kutuphanesinden Scanner classi buraya import ettik anlamina geliyor.

public class Scanner01 {
    public static void main(String[] args) {

    /* Scanner class'i kullanicidan data almak icin kullanilir.
    Java dunyasinda binlerce kutuphane bulunmaktadir.
    Kutuphanelerin icinde de bir suru class vardir.
    En meshur kutuphanelerin isimleri Utill, IO
    Utill kutuphanesinin icinde Scanner Class var, Arrays Class ve bir suru class var.
    Scanner methodunu kullanmak icin utill library icinden Scanner class'ini buraya import etmemiz lazim.
    */
        Scanner input = new Scanner(System.in); // Java dunyasindaki bir kutuphaneden Scanner classini buradaki classimizda kullanacagimiz icin obje olusturuyoruz.
        // Java kutuphanesinden aldigimiz icin System.in diyoruz.
        // objenin ismini input yaptik. cunku biz kullanicidan aldigimiz bilgileri buraya alicaz. Yani iceri alacaz. Yapilan is ile alakali olsun diye input ismini verdik.

        System.out.println("Lutfen yasinizi giriniz...");

        byte age = input.nextByte();

        System.out.println("girilen yas: " + age);


    }



}

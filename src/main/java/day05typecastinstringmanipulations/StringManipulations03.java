package day05typecastinstringmanipulations;

import java.util.Scanner;

public class StringManipulations03 {
    public static void main(String[] args) {

                /* Password girerken bazi kurallar olur (en az 1 tane rakam olsun vs. gibi), dedi.

                Example 1: Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.
                        i) En az 8 karakter olsun
                        ii) Space "bosluk" karakteri olmasin
                        iii) En az 1 tane buyuk harf olsun
                        iv) En az 1 tane kucuk harf olsun
                        v) En az 1 tane sembol olsun
                        vi) En az 1 tane rakam olsun
                */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen password'unuzu giriniz");
        String pwd = input.nextLine();

        // i) En az 8 karakter olsun
        boolean first = pwd.length()>7; //uzunluk hesapladigimiz icin length() ve karsilastirma sonucu return ettirdigimiz icin boolean yazdik.
        System.out.println(first);

        // ii) Space "bosluk" karakteri olmasin
        boolean second = !pwd.contains(" "); // contains = barindirmak anlamina gelir. basina ! koyarsan tersi anlamina gelir.
        System.out.println(second);

        // iii) En az 1 tane buyuk harf olsun
            // Note: Buyuk harf olmayanlari sil.
            //       Sonra kalan karakter sayisina bak.
            //       Karakter sayisi 0 ise buyuk harf yok demektir.
            //       Sifirdan buyuk ise buyuk harf var demektir.
        boolean third = pwd.replaceAll("[^A-Z]","").length()>0;
        System.out.println(third);        // Buyuk harflerin disindaki her seyin yerine "" koyduk. sadece buyuk harfler kaldi
                                          // eger buyuk harf kaldiysa >0 olur true return eder.

        // iv) En az 1 tane kucuk harf olsun
        boolean fourth = pwd.replaceAll("[^a-z]","").length()>0;
        System.out.println(fourth);       // kucuk harflerin disindaki her seyin yerine "" koyduk. sadece kucuk harfler kaldi
                                          // eger kucuk harf kaldiysa >0 olur true return eder.

        // v) En az 1 tane symbol olsun (symbol == harf ve rakam haric her seydir.)
                // Noktalama isaretleri de semboldur ama bu detaylari calisirken soylerler rahat olun, dedi.
        boolean fifth = pwd.replaceAll("[a-zA-Z0-9]","").length()>0;
        System.out.println(fifth);        // harf ve rakamlarin yerine "" koyduk geri kalan char sayisi >0 ise true return edecek.

        // vi) En az 1 tane rakam olsun
        boolean sixth = pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println(sixth);        // rakamlarin disindaki her seyin yerine "" koyduk. sadece rakamlar kaldi
                                          // eger rakam kaldiysa >0 olur true return eder.

        System.out.println("Password gecerli mi? : " + (first && second && third  && fourth && fifth && sixth));


    }
}

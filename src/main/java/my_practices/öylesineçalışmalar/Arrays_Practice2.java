package my_practices.öylesineçalışmalar;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Arrays_Practice2 {
    public static void main(String[] args) {

        // Example 1 : Kullanici ile beraber bir array olusturunuz.
        // ogretmen eklemeyi yarim birakip gidebilsin sonra devam edebilsin.

        Scanner input = new Scanner(System.in);
        System.out.println("Ogrenci sayisini girin");
        int num = input.nextInt();
        String[] stdNames = new String[num];

        System.out.println("Girisi sonlandirmak icin Q tusuna basiniz...");

        int i = 1;
        do {
            System.out.println("Lutfen " + i + ". ogrencinin ismini girin");
            String isimler = input.next();
            stdNames[i - 1] = isimler;
            if (i == stdNames.length) {
                break;
            }
            i++;
        } while (true);

        System.out.println(Arrays.toString(stdNames));


        // Example 2 : Bir String'teki sesli harflerin SAYISINI bulan kodu yaziniz.
        //                          a e i o u    A E I O U
        // 1. YOL: use replaceAll()


        String str = "Learn Java Earn Money Dude";

        System.out.println(str.replaceAll("[^aeiouAEIOU]", "").length());

        // 2. YOL: use Array, loop and switch

        String[] arr = str.split("");
        int counter = 0;
        for (String w : arr) {
            switch (w.toLowerCase()) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    counter++;
            }
        }
        System.out.println(counter);


        // Example 1: [0, 2, 3, 0, 12, 0] sifirlari en sona koyunuz  [2,3,12,0,0,0]

        int[] brr = {0, 2, 3, 0, 12, 0};
        int[] crr = new int[brr.length];

        int idx = 0;
        for (int w : brr) {
            if (w != 0) {
                crr[idx] = w;
                idx++;
            }
        }
        System.out.println(Arrays.toString(brr)); // [0, 2, 3, 0, 12, 0]
        System.out.println(Arrays.toString(crr)); // [2, 3, 12, 0, 0, 0]


//        Example 1 : Bir Array'in icinde herhangi bir elemanin olup olmadigini kontrol eden
//        ve kac kere tekrarlandigini gosteren kodu yaziniz


        int[] a = {0, 2, 3, 0, 12, 0};

        int arananEleman = 0;
        int count = 0;
        for (int w : a) {
            if (w == arananEleman) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println(arananEleman + ", Array'de " + count + " kere bulunmaktadir");
        } else System.out.println(arananEleman + ", Array'de bulunmamaktadir");


        // Example 1 : String Array elemanlarini karakter sayisina gore kucukten buyuge siralayiniz.
        // ["Michael" , "Ajda" , "Thomas", "Tom"]  ====> ["Tom", "Ajda", "Thomas", "Michael"]


        String[] krr = {"Michael", "Ajda", "Thomas", "Tom", "Cuneyt"};
        Arrays.sort(krr, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(krr)); // [Tom, Ajda, Thomas, Cuneyt, Michael]


        // Example 2 : String elemanlarini buyukten kucuge sirala ==> reversed() methodu
        // reverse (ENG) = ters (TR)
        // ["Michael" , "Ajda" , "Thomas", "Tom", "Cuneyt"]  ====> ["Michael", "Thomas", "Cuneyt", "Ajda", "Tom"]

        String[] mrr = {"Michael", "Ajda", "Thomas", "Tom", "Cuneyt"};
        Arrays.sort(mrr, Comparator.comparingInt(String::length).reversed());
        //sort == kucukten buyuge siraladik     uzunluga gore dedik      reverse yani terse cevir dedik. buyukten kucuge dondu.

        System.out.println(Arrays.toString(mrr)); // [Michael, Thomas, Cuneyt, Ajda, Tom]


        // Example 3 : String elemanlarini buyukten kucuge sirala
        // Ayni karakter sayisinda olanlari da alfabetik siraya koyunuz.
        //["Michael" , "Ajda" , "Reyhane", "Gabriel", "Thomas", "Tom","Ali", "Cin","Cuneyt", "Cem"]
        //                  ====> ["Gabriel", "Michael","Reyhane", "Thomas", "Cuneyt", "Ajda", "Ali", "Cem", "Cin", "Tom"]

        String[] zrr = {"Michael", "Ajda", "Reyhane", "Gabriel", "Thomas", "Tom", "Ali", "Cin", "Cuneyt", "Cem"};
        Arrays.sort(zrr); // alfabetik siraladik
        System.out.println(Arrays.toString(zrr)); // [Ajda, Ali, Cem, Cin, Cuneyt, Gabriel, Michael, Reyhane, Thomas, Tom]


        Arrays.sort(zrr, Comparator.comparingInt(String::length).reversed().
                //                uzunluga gore siraladik      terse cevirdik
                        thenComparing(Comparator.naturalOrder()));
        // thenComparing = Compare yaptiktan sonra naturel ordera gore siraladik
        System.out.println(Arrays.toString(zrr)); // [Gabriel, Michael, Reyhane, Cuneyt, Thomas, Ajda, Ali, Cem, Cin, Tom]

    }
}
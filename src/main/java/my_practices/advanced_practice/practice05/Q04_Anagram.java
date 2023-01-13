package my_practices.advanced_practice.practice05;

import java.util.Arrays;
import java.util.Scanner;

public class Q04_Anagram {
    public static void main(String[] args) {
                /*
           İki kelimenin "Anagram" olup olmadığını kontrol eden bir method oluşturunuz.
           - Anagram, başka bir kelimenin karakterlerinden yeni bir kelime oluşturmaktır. -
           Örn:
           * bahriyeli  <> harbiyeli.
           * sızlanma   <> anlamsız.
           * asya       <> yasa.
           * Bursa Dağı <> su bardağı.
           * kan ara    <> Ankara.
                */
        Scanner scan = new Scanner(System.in);

        System.out.println("String 1'i giriniz");
        String str1 = scan.nextLine();

        System.out.println("String 2'yi giriniz");
        String str2 = scan.nextLine();

        anagram(str1, str2);

    }


    public static void anagram(String str1, String str2) {

        String[] arr1 = str1.toLowerCase().replaceAll(" ", "").split("");
        String[] arr2 = str2.toLowerCase().replaceAll(" ", "").split("");
        Arrays.sort(arr1); // assign yapmadan degeri otomatik degistiriyosa "mutable" aksi takdirde "immutable" denir.
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) { // Arrays class'indaki equals'i kullanmak lazim.
            // Arrays class'indan almazsak referans numaralari
            // karsilastirilir hep false return eder.
            System.out.println("Anagram");
        } else {
            System.out.println("Anagram DEGIL");
        }


    }


}
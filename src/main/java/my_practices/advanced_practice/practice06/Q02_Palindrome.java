package my_practices.advanced_practice.practice06;

import java.util.Scanner;

public class Q02_Palindrome {
    public static void main(String[] args) {
        //Bir String değerin Palindrome olup olmadığını kontrol eden bir kod yazınız.
        // tersten yazilabilmek == palindrom
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String value");

        String str = input.nextLine().replaceAll(" ", "").toLowerCase();
        String strReversed = "";

        for (int i = str.length() - 1; i > -1; i--) {
            strReversed += str.charAt(i);
        }
        System.out.println("str\t\t\t: "+str);
        System.out.println("strReversed\t: "+strReversed);

        if (str.equals(strReversed)) {
            System.out.println("The String you entered \"" + str + "\" is a palindrome");
        } else {
            System.out.println("The String you entered \"" + str + "\" is not a palindrome");
        }


        System.out.println("\n***** ASAGIDA STRING BUILDER *****\n");


        System.out.println("Enter a String value");

        String str2 = input.nextLine().replaceAll(" ", "").toLowerCase();

        System.out.println("str2 = " + str2);

        StringBuilder stb = new StringBuilder(str2);
        // String immutable'dir. StringBuilder stringin mutible halidir.
        System.out.println("stb = " + stb);

        String str2Reversed = stb.reverse().toString(); // su an atama yapmadan str'i tersten yazdirmis olduk.
        // StringBuilder'i String konteynirina koymazsak equals kullandigimizda hep false doner.
        System.out.println("stbReversed = " + stb);

        if (str2.equals(str2Reversed)){
            System.out.println("The String you entered \"" + str2 + "\" is a palindrome");
        } else {
            System.out.println("The String you entered \"" + str2 + "\" is not a palindrome");
        }


    }
}

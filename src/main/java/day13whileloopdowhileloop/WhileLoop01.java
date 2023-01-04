package day13whileloopdowhileloop;

import java.util.Scanner;

public class WhileLoop01 {
    public static void main(String[] args) {

                /*
                Example 1: Kullanicinin verdigi sayi icin carpim tablosunu olusturan kodu yaz
                          3 verdiyse ==> 3x1=3   3x2=6 ........... 3x10=30
                */

        Scanner input = new Scanner(System.in);
        System.out.println("Carpim tablosunu gormek icin bir sayi giriniz...");
        int num = input.nextInt();

        int i = 1;
        int result = 0;
        while (i <= num) {
            result = num * i;
            System.out.println(num + " x " + i + " = " + result);
            i++;

        }



                /*
                Example 2: Verilen bir Stringde her harfin sonrasina "*" sembolu ekleyin
                 */

        System.out.println("Bir kelime giriniz...");
        String word = input.next();


        // For Loop
        for (int j = 0; j < word.length(); j++) {
            System.out.print(word.charAt(j) + "*");
        }

        // While Loop
        String newWord = "";
        int k = 0;
        while (k < word.length()) {
            newWord = newWord + word.charAt(k) + "*";
            k++;
        }
        System.out.print(newWord);



    }
}

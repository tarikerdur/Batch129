package my_practices.oylesinecalismalar;

import java.util.Scanner;

public class harf_tekrar_bul {
    public static void main(String[] args) {
            /*
        Write a Java program to get a String from user as input
        and find the maximum occurring character in that string. (Ignore case sensitivity)
        input :
        Learning java is easy

        output:
        maximum occurring character is : a
            */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sentence");
        encokharfbul(input.nextLine());
    }

    public static void encokharfbul(String kelime) {
        int sayi = 0;
        int encokkactane = 0;
        int index = 0;
        for (int i = 0; i < kelime.length(); i++) {
            sayi = 0;
            for (int j = 0; j < kelime.length(); j++) {
                if (kelime.charAt(i) == kelime.charAt(j)) {
                    sayi++;
                }
            }
            if (sayi > encokkactane) {
                encokkactane = sayi;
                index = i;
            }
        }
        System.out.println("En çok kullanılan harf:" + kelime.charAt(index));
        System.out.println("Harfin tekrar sayısı:" + encokkactane);
    }
}



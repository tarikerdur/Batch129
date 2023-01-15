package my_practices.advanced_practice.practice08;

import java.util.Scanner;

public class Q01_NestedLoop_AtbashCode {
    public static void main(String[] args) {
        /*
     Kullanıcıdan aldığınız bir metni 'Atbash Code' yöntemi ile şifreleyen bir kod yazınız.
     Ortadoğuda kullanılan en eski şifreleme biçimlerinden biridir.
     Arami alfabesinin tersten yazılması ile oluşturulan bir kodlayıcıya sahiptir.
     Örn: A-->Z, B-->Y ...
     "abcdefghijklmnopqrstuvwxyz";
     "zyxwvutsrqponmlkjihgfedcba";
        */
        // 1. YOL - charAt
        Scanner input = new Scanner(System.in);
        System.out.println("Bir kelime giriniz");
        String kelime = input.nextLine().replaceAll(" ", "").toLowerCase();
        String alfabe = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < kelime.length(); i++) { // kelime indexi
            for (int j = 0; j < alfabe.length(); j++) { // alfabe indexi
                if (kelime.charAt(i) == alfabe.charAt(j)) { // charlarda equal kullanmaya gerek yok primitive data donucek
                    System.out.print((char) alfabe.charAt(alfabe.length() - 1 - j));
                }
            }
        }
        // 2. YOL - ASCII value
        System.out.println("\n=== 2. Yol ===");
        for (int i = 0; i < kelime.length(); i++) {
            int idx = 'z' - kelime.charAt(i);
            System.out.print((char) ('a'+idx));

        }
    }
}
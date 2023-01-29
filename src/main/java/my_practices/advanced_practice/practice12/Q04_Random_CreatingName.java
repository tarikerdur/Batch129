package my_practices.advanced_practice.practice12;

import java.text.DecimalFormat;

public class Q04_Random_CreatingName {

    // Rastgele alınan harfleri bir Stringe ekleyerek
    // adınızı oluşturan ve bunu kaç deneme ile yaptığını yazdıran bir kod yazınız.

    public static void main(String[] args) {

        String alfabe = "abcçdefgğhıijklmnoöprsştuüvyzABCÇDEFGĞHIİJKLMNOÖPRSŞTUÜVYZ ";

        String name = "Ali Can";
        String newName = "";

        int counter = 0;

        for (int i = 0; i < name.length(); i++) {

            while (true) {
                char rastgeleHarf = alfabe.charAt((int) (Math.random() * alfabe.length()));
                counter++;
                if (name.charAt(i) == rastgeleHarf) {
                    newName += rastgeleHarf;
                    System.out.println("newName = " + newName);
                    System.out.println("counter = " + counter);
                    break;
                }
            }
        }
        System.out.println();
        System.out.println("name = " + name);
        System.out.println("newName = " + newName);
        System.out.println("counter = " + counter);
    }


}

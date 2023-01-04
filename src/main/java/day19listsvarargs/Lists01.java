package day19listsvarargs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists01 {
    public static void main(String[] args) {

        // Example 1: Verilen bir List'teki elementleri tekrarsiz olarak yazdiriniz.
        // [2, 3, 2, 2, 3, 5]   ===>  [2, 3, 5]

        // LOGIC : yeni bir list olusturucaz yeni listte eski listte olan elemanlari yeni list'e aktaricaz.
        // tekrarsiz yazdirmis olucaz.
        // contains() methodu kullanabiliriz.

        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(2);
        myList.add(3);
        myList.add(2);
        myList.add(2);
        myList.add(3);
        myList.add(5);

        System.out.println(myList); // [2, 3, 2, 2, 3, 5]


        List<Integer> newList = new ArrayList<>();

        for (Integer w : myList) {
            if (!newList.contains(w)) {
                newList.add(w);
            }
        }
        System.out.println(newList); // [2, 3, 5]


        // Example 2: Musteriden urun ismini aliniz.
        // Musterinin ismini verdigi urun list'te varsa urunun ismini yazdiriniz.
        // Musterinin ismini verdigi urun list'te yoksa "Out of Stock" yazdiriniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to product searching system...");
        System.out.println("Press \"Q\" for exit");

        ArrayList<String> products = new ArrayList<>();
        products.add("TV");
        products.add("Radio");
        products.add("iPad");
        products.add("PC");
        products.add("Notebook");
        products.add("Headphone");
        products.add("Mobile Phone");
        /*
            for loop kurunuz, products listindeki her bir elemanin
            tum karakterlerini set method kullanarak kucuk harfe ceviriniz.
            Kullanicidan gelen urun ismini de kucuk harfe cevirin.
            Bu sayede case sensitive'i ignore etmis oluruz.
        */
        int idx = 0 ;
        for (String w : products) {
            products.set(idx,w.toLowerCase());
            idx++;
        }
        System.out.println(products); // [tv, radio, ipad, pc, notebook, headphone, mobile phone]


        do {
            System.out.println("Enter the product that you want to search");
            String p = input.nextLine().toLowerCase().trim();

            if (p.equalsIgnoreCase("Q")){
                break;
            } else if (products.contains(p)) {
                System.out.println(p + " is in stock");
            } else {
                System.out.println(p + " is out of stock!...");
            }

        } while (true);
        System.out.println("Thank you for using our site. We hope you come again.");


    }
}

package day32collections;

import java.util.LinkedHashSet;

public class LinkedHashSet01 { // insertion order'a gore dizer
    public static void main(String[] args) {

        // LinkedHashSet olusturalim

        LinkedHashSet <String> artist = new LinkedHashSet<>();
        artist.add("Ajda");
        artist.add("Tom");
        artist.add("Brad");
        artist.add("Angelina");
        artist.add("Tom"); // "Set"ler tekrarli olmayacagi icin ikinci Tom'u Java gormeyecek.
        // ikinci Tom'u ilk Tom'un ustune override (ustune yazar) eder.
        System.out.println(artist); // [Ajda, Tom, Brad, Angelina] ---> burada gorulen Tom en son yazdigimiz Tom'dur.

        LinkedHashSet <String> actress = new LinkedHashSet<>();
        actress.add("Ajda");
        actress.add("Angelina");

        artist.removeAll(actress);
        System.out.println(artist); // [Tom, Brad]




    }
}

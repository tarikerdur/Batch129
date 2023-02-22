package my_practices.advanced_practice.practice14;

import java.util.*;

public class Lambda02 {

    public static void main(String[] args) {

        List<String> meyve = new ArrayList<>(Arrays.asList("elma", "portakal", "uzum", "cilek", "greyfurt", "nar",
                "mandalina", "armut", "elma", "keciboynuzu", "elma")); // "elma" has written repeatedly.

        firstLetterEOrC(meyve);
        System.out.println();
        addStarAtfirstAndEnd(meyve);
        System.out.println();
        karakterSayGoreBuyKucSirKarSayEnBuyIlk3(meyve);
        System.out.println();
    }

    // SORU 1 : List elemanlarının ilk harfi 'e' veya 'c' olanlari,
    // Method References ile aralarında bosluk bırakarak yazdıralım.
    static void firstLetterEOrC(List<String> list) {
        list.stream().filter(Utilities::firstLetterEOrC).forEach(Utilities::print);
    }

    // SORU 2 : List elemanlarının hepsinin basina ve sonuna yildiz ekleyerek yazdiralim.
    static void addStarAtfirstAndEnd(List<String> list) {
        list.stream().map(Utilities::addStar).forEach(Utilities::print);
    }

    // SORU 3 : List elemanlarını karakter sayısına gore buyukten kucuge sıralayınız,
    // karakter sayısı en buyuk ilk 3 elemanı List halinde return ederek yazdırınız.
    static void karakterSayGoreBuyKucSirKarSayEnBuyIlk3(List<String> list) {
        list.stream().sorted(Comparator.comparing(String::length).reversed()).limit(3).forEach(Utilities::print);
        // "comparing(t->t.toString().length()" yerine "String::length" dedik
    }


}

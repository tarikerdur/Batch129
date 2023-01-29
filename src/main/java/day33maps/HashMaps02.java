package day33maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMaps02 {

        /*
    Example 1 : Size verilen bir cumledeki her bir kelimenin kacar kere kullanildigini gosteren kodu yaziniz.
                "Java is easy. Java is OOP. OOP makes Java easy." ==>
                Console ===> {Java=3, OOP=2, makes=1, is=2, easy=2}

                LOGIC : Map kullanip kullanmamaya istedigimiz ciktinin data typeina bakarak karar vericez.
                Map yapisi `key = value`dur. Ornek ciktimizla uygun.
        */

    public static void main(String[] args) {

        HashMap<String, Integer> wordsMap = new HashMap<>();

        String sentence = "Java is easy. Java is OOP. OOP makes Java easy.";
        System.out.println(sentence); // Java is easy. Java is OOP. OOP makes Java easy.

        sentence = sentence.replaceAll("\\p{Punct}", ""); // kelime sayarken noktalama isaretlerini silin
        System.out.println(sentence); // Java is easy Java is OOP OOP makes Java easy

        String[] wordsArray = sentence.split(" ");
        System.out.println(Arrays.toString(wordsArray)); // [Java, is, easy, Java, is, OOP, OOP, makes, Java, easy]

        for (String w : wordsArray) {
            Integer numOfOccurance = wordsMap.get(w);

            if (numOfOccurance == null) {
                wordsMap.put(w, 1);
            } else {
                wordsMap.replace(w, numOfOccurance + 1);
            }
        }
        System.out.println(wordsMap); // {Java=3, OOP=2, makes=1, is=2, easy=2}


    }
}

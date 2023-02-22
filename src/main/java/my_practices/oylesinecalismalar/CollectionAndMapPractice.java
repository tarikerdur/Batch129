package my_practices.oylesinecalismalar;

import day36lambda.Utils;
import my_practices.advanced_practice.practice14.Utilities;

import java.util.*;
import java.util.Iterator;

public class CollectionAndMapPractice {

    /*
Bir Map oluşturun ve içine rastgele key-value çiftleri ekleyin.
Bu Map'teki tüm valuelari bir döngü kullanarak yazdırın.
Ancak key'ler alfabetik olarak sıralı olmalıdır.
    */
    public static void main(String[] args) {

        Map<String, Integer> myHashMap = new HashMap<>();
        myHashMap.put("Hasan", 30);
        myHashMap.put("Tarik", 24);
        myHashMap.put("Halid", 33);
        myHashMap.put("Salim", 36);
        myHashMap.put("Fatih", 31);
        myHashMap.put("Nefise", 28);
        myHashMap.put("Yavuz", 31);

        TreeMap<String, Integer> myTreeMap = new TreeMap<>(myHashMap);

        for (Map.Entry<String, Integer> w : myTreeMap.entrySet()) {
            System.out.println(w);
        }


            /*
        Bir HashSet oluşturun ve içine rastgele string değerler ekleyin.
        Bu HashSet'teki tüm değerleri bir döngü kullanarak yazdırın.
        Ancak elemanlar uzunluğuna göre büyükten küçüğe doğru sıralanmalıdır.
            */

        HashSet<String> test = new HashSet<>
                (Arrays.asList("USA", "Japan", "Turkey", "England",
                        "Deutschland", "South Africa", "Argentina"));

        test.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);


        Scanner input = new Scanner(System.in);
        System.out.println("Kelime gir");
        String s = input.next();
        boolean check = CodelandUsernameValidation(s);
        String abc;
        if (check) {
            abc = "sagliyor";
        } else {
            abc = "saglamiyor";
        }
        System.out.println(s + " kelimesi şartları " + abc + " = " + check);
    }

//    take the str parameter being passed and determine if the string is a valid username according to the following rules:
//            1. The username is between 4 and 25 characters.
//            2. It must start with a letter.
//            3. It can only contain letters, numbers, and the underscore character.
//            4. It cannot end with an underscore character.
//    If the username is valid then your program should return the string true, otherwise return the string false.
    public static boolean CodelandUsernameValidation(String str) {
        int strLength = str.length();
        boolean isFirstCharLetter = !str.substring(0, 1).replaceAll("[^a-zA-Z]", "").isEmpty();
        boolean containLetterNumberUnderscrChar = str.replaceAll("[a-zA-Z0-9_]", "").isEmpty();
        boolean isEndsWithUnderscore = !str.endsWith("_");
        return (strLength > 4 && strLength < 25) && isFirstCharLetter && containLetterNumberUnderscrChar && isEndsWithUnderscore;
    }
}

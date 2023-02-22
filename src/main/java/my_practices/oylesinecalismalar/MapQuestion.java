package my_practices.oylesinecalismalar;

import java.util.*;

public class MapQuestion {
    public static void main(String[] args) {
        /*
        Example 1 : Size verilen bir cumledeki her bir kelimenin kacar kere kullanildigini gosteren kodu yaziniz.
                "Java is easy. Java is OOP. OOP makes Java easy." ==>
                Console ===> {Java=3, OOP=2, makes=1, is=2, easy=2}
        */
        Map<String,Integer> strMap = new HashMap<>();
        String str = "Java is easy. Java is OOP. OOP makes Java easy.";
        str = str.replaceAll("\\p{Punct}","");
        String [] arr = str.split(" ");

        Integer number = null;

        for (String w : arr) {
            number = strMap.get(w);
            if (number==null){
                strMap.put(w,1);
            } else {
                strMap.replace(w,number+1);
            }
        }
        System.out.println(strMap);




        // Example 1: Size verilen bir cumlede kullanilan harflerin gorunum sayisini gosteren kodu yaziniz.
        //            "Java is Java" ==> {J=2, a=4, v=2, i=1, s=1}

        TreeMap<String,Integer> stringIntegerHashMap = new TreeMap<>();

        String s = "Java is Java";
        String [] arrS = s.replaceAll("[^A-Za-z]","").toLowerCase().split("");
        Integer numOfOccurance = 0;

        for (String k : arrS){
            numOfOccurance = stringIntegerHashMap.get(k); // returns Integer value of the entry that we hope exist key
            if (numOfOccurance == null){ // if key doesn't exist we will add the key to map and assign the value as 1
                stringIntegerHashMap.put(k,1);
            } else { // if key exist we will up the value +1
                stringIntegerHashMap.replace(k,numOfOccurance+1);
            }
        }
        System.out.println(stringIntegerHashMap); // {a=4, i=1, j=2, s=1, v=2}









    }
}
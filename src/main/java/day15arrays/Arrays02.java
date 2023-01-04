package day15arrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        // Example 2 : Bir String'teki sesli harflerin SAYISINI bulan kodu yaziniz.
        //                          a e i o u    A E I O U

        String s = "Java brings you money";

        // 1. YOL: use replaceAll()
        int vowels = s.replaceAll("[^aeiouAEIOU]", "").length(); // vowels (ENG) = sesli harfler (TR)
        System.out.println(vowels); // 7

        // 2. YOL: use Array, loop and switch
        String letters[] = s.split(""); // split methodu Array return eder
        System.out.println(Arrays.toString(letters)); // [J, a, v, a,  , b, r, i, n, g, s,  , y, o, u,  , m, o, n, e, y]

        int counter = 0;
        for (String w : letters) {
            switch (w.toLowerCase()) { // 2'den fazla durum oldugu icin nested if yerine switch kullandik
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    counter++;
            }
        }
        System.out.println(counter); // 7
    }
}

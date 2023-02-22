package my_practices.advanced_practice.practice14;

import java.util.List;

public class Utilities {
    public static boolean firstLetterEOrC(String str) {
        return str.startsWith("e") || str.startsWith("c") || str.startsWith("E") || str.startsWith("C");
    }
    public static String addStar(String str) {
        return "*"+str+"*";
    }

    public static void print(Object obj) { // butun classlari yazdiralim diye Object data type kullandik
        System.out.print(obj + " ");
    }

    public static boolean evenAndPositive(int t) {
        return t % 2 == 0 && t > 0;
    }

    public static boolean even(int t) {
        return t % 2 == 0;
    }

    public static int square(int t) {
        return t * t;
    }


}

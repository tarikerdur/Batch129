package day36lambda;

public class Utils {

    // Bir projede repeatedly kullanacagimiz methodlari util classta
    // olusturum oradan cagirarark "method reference" kullaniriz.
    public static int getLengthSquare(String s) {
        return s.length() * s.length();
    }

    public static boolean isLengthEven(String s) {
        return s.length() % 2 == 0;
    }

    public static String getLastChar(String s) {
        return s.substring(s.length() - 1, s.length());
    }

    public static void printInTheSameLine(Object obj) { // butun classlari yazdiralim diye Object data type kullandik
        System.out.print(obj + " ");
    }

    public static boolean isNumberEven(int t) {
        return t % 2 == 0;
    }

    public static boolean firstLetterEOrC(String str) {
        return str.startsWith("e") || str.startsWith("c") || str.startsWith("E") || str.startsWith("C");
    }

    public static String addStar(String str) {
        return "*" + str + "*";
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
    public static int getSumOfDigits(int x) {
        int sum = 0;
        while (x!=0){
            sum = sum + x%10;
            x=x/10;
        }
        return sum;
    }

}


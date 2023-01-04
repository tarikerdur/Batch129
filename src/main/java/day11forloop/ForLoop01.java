package day11forloop;

public class ForLoop01 {

    public static void main(String[] args) {

        // Example 1: Verilen bir Stringte ilk 'a' harfindan onceki tum karakterleri yazdiran kodu yaz
// break;
        // BENIM COZUMUM
        String s = "I love Java";
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            String ch = s.substring(i, i + 1); // i'inci indexteki harfi alip ch'ye atama yaptik
            boolean isA = ch.equals("a");
            if (isA) { // ch'ye attigimiz char 'a' harfine esit mi diye baktik
                break; // esit ise kodu kirdik.
            }
            temp += ch;     // esit degilse 'a' olmayan harfleri temp konteynirimiza concatenation yaparak biriktirdik.
        }
        System.out.println(temp); // I love J

            /*
            SULEYMAN HOCANIN COZUMU

            String s = "I love Java"
            for (int i = 0 ; i<s.length() ; i++){

            char ch = s.charAt(i)
            if (ch=='a'){
            break;
            }
            System.out.print(ch);
            }
             */

        System.out.println();

        // Example 2: Verilen bir String'te son 'a'dan sonraki tum characterleri tersten yazdiran kodu yaz.
        String t = "Germany";   // ==> "yn" yazdiracaz

        for (int i = t.length() - 1; i >= 0; i--) { // length-1 ==> son indexi verir (karakter ile indexin farkini bil)
            char ch = t.charAt(i);
            if (ch == 'a') {
                break;
            }
            System.out.print(ch);
        }


    }
}

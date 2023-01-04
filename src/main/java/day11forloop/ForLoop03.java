package day11forloop;

public class ForLoop03 {
    public static void main(String[] args) {

        // Example 1 : Size verilen bir String'i tersten yazdir
        // Interview sorusu olarak sorarlar dedi. Bu soruyu kendi basiniza yapmadan interviewe girmeyin dedi.

        String s = "Germany";

        // 1. YOL
        String t = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            t += ch;
        }
        System.out.println(t); // ynamreG

        // 2. YOL
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            System.out.print(ch); // ynamreG
        }

        System.out.println("\n--------------------");

        // Example 2: Size verilen bir String'in palindrom olup olmadigini yazdiran kodu yazin
        // Palindrom ==> soldan saga ya da soldan saga okundugunda ayniysa palindrom'dur.
        // ornegin ==> civic, nalan, kucuk, 11211
        // Stringi ters cevir, duz hali ile ayniysa palindrom de.

        String r = "CIvic";
        String temp = "";
        for (int i = r.length() - 1; i >= 0; i--) {
            char ch = r.charAt(i);
            temp += ch;
        }
        if (temp.equalsIgnoreCase(r)) {   // case sensitive'i kapattik
            System.out.println("\"" + r + "\"" + " String'i Palindromdur.");
        } else {
            System.out.println("\"" + r + "\"" + " String'i Palindrom degildir.");
        }


    }
}

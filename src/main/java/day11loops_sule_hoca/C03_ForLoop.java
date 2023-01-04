package day11loops_sule_hoca;

public class C03_ForLoop {
    public static void main(String[] args) {
        /*  interview questions
        Reverse order (Tersten sirala)

        String karakterleri teker teker yazdiran;
        eger 'a' karakterini gorurse yazdirmayi durduran kodu yaziniz.
         */

        String str = "Ogrenmek yasamin tek kanitidir";
        for (int i = 0 ; i<str.length(); i++ ){ // i = index
            char character = str.charAt(i);

            if (character=='a'){
                break;
            }//if body
            System.out.print(character+"  ");
        }//for loop






    }
}

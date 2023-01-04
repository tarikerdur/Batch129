package day11forloop;

public class ForLoop02 {
    public static void main(String[] args) {
        // Example 1: Verilen bir String'de 'a' karakteri haric tum karakterleri yazdiriniz.
// continue;
        String s = "Madagaskar";

        // 1. YOL
        String t = s.replace("a", "");
        System.out.println(t); // Mdgskr


        // 2. YOL
        for (int i = 0 ; i<s.length() ; i++ ){
            char a = s.charAt(i);
            if (a!='a'){
                System.out.print(a); // Mdgskr
            }
        }
        System.out.println("\n--------------------");

        // 3. YOL
        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);
            if (ch=='a'){
                continue; // continue keyword'u bazi sartlar icin loopun adimlarini atlamamizi yardim eder.
            }
            System.out.print(ch); // Mdgskr
        }
    }
}

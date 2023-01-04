package day13whileloopdowhileloop;

public class DoWhileLoop01 {
    public static void main(String[] args) {

        // 1) While Loop
        int i = 1;

        while (i < 1) { // while loop'ta zero execution mumkundur.
            System.out.println("Sen bir while loopsun...");
            i++;
        }

        // 2) Do While Loop
        int k = 1;

            /*
             do (ENG) == YAP (TR)
             biz javaya hicbir sart kosmadan bir seyi "yap" dedik. java yapti.

             Yaptiktan sonra sarti gordu ve loop kirildi. Yani Do While Loop en az 1 kere caliris.
             Do While'da Zero Execution MUMKUN DEGILDIR. CALISMAYAN LOOP YOKTUR. LOOP EN AZ 1 KERE CALISIR.
             While Loop ile Do While Loop arasindaki en temel fark budur.

                     java yukaridan asagiya soldan saga sirayla okudugu icin;
                             i) While Loop once sarti kontrol eder sonra isi yapar. (Syntax farki)
                             ii )Do While Loop once isi yapar sonra sarti kontrol eder. (Syntax farki)
            */
        do {
            System.out.println("Sen bir do while loopsun...");
            k++;
        } while (k < 1);


    }
}


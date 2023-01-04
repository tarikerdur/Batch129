package day16multidimensionalarrays;

public class Md06 {
    public static void main(String[] args) {

        // Example : Bir int multi dimensional arraydeki en buyuk ve en kucuk sayinin toplamini ekrana yazdiriniz.

        int[][] a = {{21, 5}, {14, 70, 11}}; // 5 + 70 == 75

        int small = a[0][0]; // small'a en basta 0 degerini atasaydik 0 hep en kucuk cikacagi icin sonuc hatali gelir.
        int big = a[0][0];   // ama arraydeki bir elemani atarsak birbirleriyle karsilastirildiginda
        // en kucuk ve en buyuk degerlere ulasicaz.

        for (int[] w : a) {
            for (int k : w) {
                small = Math.min(small, k);
                big = Math.max(big, k);
            }
        }
        System.out.println("Array'deki en kucuk sayi : " + small); // 5
        System.out.println("Array'deki en buyuk sayi : " + big); // 70
        System.out.println("Toplamlari : " + (small + big)); // 75


        // bu soruyu hepsini tek bir arrayde birlestirip cozmeye calis




             /*

           ooooo*
           oooo* *
           ooo*   *
           oo*     *
           o* * * * *

           */

        int row = 5;
        for (int i = 1; i <= row; i++) {
            for (int k = i; k < row; k++) {
                System.out.print(" ");
            }
            for (int m = 1; m <= 2 * i - 1; m++) {
                if (i == row || m == 1 || m == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}

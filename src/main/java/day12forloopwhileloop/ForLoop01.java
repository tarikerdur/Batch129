package day12forloopwhileloop;

import java.util.Scanner;

public class ForLoop01 {
    public static void main(String[] args) {
        /*
        Type code to print the following image on the console
                X X X X X
                X X X X X
                X X X X X
        */

        Scanner input = new Scanner(System.in);

        System.out.print("Satir (row) sayisini gir : ");
        int row = input.nextInt(); // satir (TR) == row (ENG)

        System.out.print("Sutun (column) sayisini gir : ");
        int column = input.nextInt(); // sutun (TR) == column (ENG)

        System.out.print("Lütfen cizilmesini istediginiz karakteri giriniz : ");
        char character = input.next().charAt(0);

        for (int i = 1; i <= row; i++) {  // outer loop satir icin calisacak
            for (int k = 1; k <= column; k++) { // inner loop sutun icin calisacak
                System.out.print(""+character+" ");
            }
            System.out.println();
        }
    }
}

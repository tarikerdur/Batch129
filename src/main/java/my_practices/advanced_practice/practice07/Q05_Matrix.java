package my_practices.advanced_practice.practice07;

import java.util.Scanner;

public class Q05_Matrix {

    public static void main(String[] args) throws InterruptedException {
                /*
        Kullanıcıdan aldığınız bir sayi kadar satır ve sütun sayısına sahip
        alttaki rastgele 0 ve 1'lerden oluşan matriksi yazdırın.
        Input: 10
        Output:
        1 0 0 1 1 0 0 0 1 1
        0 0 1 0 1 0 1 0 0 0
        0 1 0 1 0 0 0 0 0 1
        1 1 1 0 0 0 0 1 1 1
        1 1 0 1 1 1 0 1 0 0
        1 0 0 0 1 1 0 0 0 0
        0 0 1 0 0 0 0 1 1 1
        1 1 0 1 0 1 0 0 1 0
        0 0 1 0 0 0 0 1 1 0
        1 1 1 0 0 1 1 1 1 0
        */
        Scanner input = new Scanner(System.in);
        System.out.println("satir sayisi gir");
        int satirSayisi = input.nextInt();
        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < 10; j++) {
                Thread.sleep(20);
                System.out.print((int) ((Math.random())*2) + " ");
            }
            System.out.println();
        }
    }
}

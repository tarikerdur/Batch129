package my_practices.ssgpassbyvalueoverloading;

import java.util.Scanner;

public class C01_PassByValue {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi girin");
        int sayi = scan.nextInt();
        katlama(sayi);
        System.err.println(sayi);

    }

    public static void katlama(int sayi){
        sayi = sayi*3;
        System.out.println(sayi);
    }
}

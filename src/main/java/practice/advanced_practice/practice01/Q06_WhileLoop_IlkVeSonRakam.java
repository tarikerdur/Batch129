package practice.advanced_practice.practice01;

import java.util.Scanner;

public class Q06_WhileLoop_IlkVeSonRakam {
    //Kullanıcıdan alınan bir sayının ilk ve son rakamlarını toplayan bir kod yazınız.
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Sayi gir");
        int sayi = input.nextInt();

        // 1. YOL
        int sonRakam = sayi % 10;
        System.out.println("Son rakam : " + sonRakam);

        int ilkRakam = sayi;

        while (ilkRakam > 9) {
            ilkRakam /= 10;
        }
        System.out.println("Ilk rakam : " + ilkRakam);

        int toplamm = ilkRakam + sonRakam;
        System.out.println("Toplam : " + toplamm);


        // 2. YOL
        // String sayiString = sayi+""; // sayi stringe donustu
        String sayiString = String.valueOf(sayi); // sayi stringe donustu
        int firstNum = Integer.parseInt(sayiString.substring(0, 1));
        int lastNum = Integer.valueOf((sayiString.substring(sayiString.length() - 1)));

        int toplam = firstNum + lastNum;
        System.out.println("toplam : "+ toplam);
    }


}

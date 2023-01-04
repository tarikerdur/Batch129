package day10switchloops;

public class Loops02 {
    public static void main(String[] args) {

        // EXAMPLE 1: 21'den 180'e kadar hem 4 hem de 6 ile bolunebilen tum tam sayilari ekrana yazdiran kodu yaz
        for (int i = 21; i < 181; i++) {
            boolean sart = i % 4 == 0 && i % 6 == 0;
            if (sart) {
                System.out.print(i + " ");
            }
        }

        System.out.println();


        // EXAMPLE 2: Size verilen kucuk harfle yazilmis String'in indexi cift sayi olan char'larini buyuk harf yapiniz

        String s = "ankara";
        for (int i = 0; i < s.length(); i++) { // Stringlerde indexler 0'dan baslayacagi icin ilk baslangic 0'dir.
            if (i % 2 == 0) {
                String ch = s.substring(i, i + 1);
                System.out.println(ch.toUpperCase());
            }
        }

    }
}

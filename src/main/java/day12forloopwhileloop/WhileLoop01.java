package day12forloopwhileloop;

public class WhileLoop01 {
    public static void main(String[] args) {

        /*
        Example 1 : 3'ten 7'ye kadar tam sayilari yazdiran kodu yaz
         */

        // 1. YOL ==> For Loop

        for (int i = 3; i < 7; i++) {
            System.out.print(i + " ");
        }
        System.out.println();


        // 2. YOL ==> While Loop

        int i = 3;                      // while'da baslangic degeri basa disari yazilir

        while (i < 7) {                    // paranteze kosul yazilir.
            System.out.print(i + " ");    // curly icine looplanacak islem yazilir
            i++;                        // curly icine inc/dec yazilir.
        }

            /*
            For ile yapilan her sey While ile de yapilir. For cok teknik bir syntax'e sahiptir.
            While'i okumak daha kolaydir. Ama for'a da alisirsiniz kullanirsiniz fark etmez, dedi.
            */

        System.out.println();
        // Example 2 : 23'ten 12'ye kadar cift tam sayilari konsola yazdir
        int k = 23;
        while (k > 11) {
            if (k % 2 == 0) {
                System.out.print(k + " ");
            }
            k--;
        }
        System.out.println();


        // Bu soruyu iyi ogrenin dedi ==>
        // Example 3 : Verilen bir tam sayinin rakamlari toplamini yazdir.
        // 1. YOL ==> WHILE LOOP COZUMU

        int num = 578;
        int sum = 0;

        while (num > 0) { // 0'a kadar hesaplanacagi icin 0'dan buyuk dedik
            sum += num % 10; // son rakami aldik. sum konteynirina aldik
            num /= 10; // azaltma kismi onlar basamagini azaltarak bolerek yapildi
        }
        System.out.println("Rakamlar toplami : " + sum);


        // 2. YOL ==> FOR LOOP COZUMU
        int a = 6841;
        int toplam = 0;
        for (int m = a; m > 0 ; m/=10) {
            toplam += m%10;
            a=a/10;
        }
        System.out.println(toplam);


    }
}

package day12forloopwhileloop;

public class ForLoop05 {
    public static void main(String[] args) {

        // Example 1: Hic sayi kullanmadan 1'den 100'e kadar olan sayilari yazdiran kodu yaz

        for (int i = 'd' / 'd'; i <= 'd'; i++) { // d'nin ASCII degeri 100'dur. d/d == 1 olur.
            System.out.print(i + " ");
        }


        System.out.println();


//===> ZERO EXECUTION
// Note 1 : Bazi Loop'lar hic calismayabilir.

        for (int i = 1; i>10 ; i++){
            System.out.println("Hi!");
        }

//===> INFINITE LOOP
// Note 2 : Bazi Loop'lar sonsuz donguye girebilir. Sakin calistirma RAM dolar. RANDOM ACCESS MEMORY == RAM
//          Bu hata genelde increment/decrement kisminda yapilan hatadan kaynaklanir.
//        for (int i = 1; i < 5 ; i--) {
//            System.out.println("Hi!");
//        }

// Note 3 : Baska bir infinite loop. Sakin calistirma RAM dolar. RANDOM ACCESS MEMORY == RAM
//        for (int i = 1;      ;  i++   ) { // Sart yok. Sart olmayinca loop kirilamaz.
//            System.out.println("Hi!");
//        }





    }
}

package day28exceptions;

public class Exceptions05 {

    public static void main(String[] args) {

        int a = 16;
        int b = 5;
        String s = "My Java";

        getCharFromString(s, a, b);


    }
    // try kismina birden fazla Exception olusturma ihtimali olan code varsa coklu "catch" kullanabiliriz.
    // coklu "catch" kullandigimizde Exception class'lar arasinda "parent-child" iliskisi YOKSA catch'lerin sirasi
    // onemli degildir. Ama koddaki siralamaya uymak tavsiye edilir.
    // coklu "catch" kullandigimizde Exception class'lar arasinda "parent-child" iliskisi VARSA catch'lerin sirasi
    // onemlidir. Child olan class ustte olmalidir. Yoksa hata verir.

    // Exception class'lar arasinda "parent-child" iliskisi VARSA, ya child class'i uste yazarak child ve parent class'lar
    // icin ozellestirilmis kodlar yazarsiniz (hirsiz icin 155'i hasta icin 112 gibi)
    // Veya child'i hic kullanmaz sadece parent ile exception'lari handle etmeye calisirsiniz. (hirsiz icin 112'yi hasta icin de 112'yi gibi)
    static void getCharFromString(String s, int a, int b) {
        try {
            int idx = a / b; // ArithmeticException
            char ch = s.charAt(idx); // StringIndexOutOfBoundsException
            System.out.println(ch);

        } catch (ArithmeticException e) { // handled ArithmeticException
            System.out.println("Do not divide by zero..." + e.getMessage());

        } catch (StringIndexOutOfBoundsException e) { // handled StringIndexOutOfBoundsException
            System.out.println("Using do not exist index exception..." + e.getMessage());
        }

    }
}

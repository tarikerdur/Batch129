package day28exceptions;

public class Exceptions01 {
            /*
        Exception (ENG) == Umulmadik hata (TR)
        Gercek hayatta exceptionlar icin insanlarin cozumleri vardir.
            Arabanin benzini bitti yolda kaldik ---> Yol yardimi arayip benzin getirtiriz.
        Yani benzin bitti diye oturup karalar baglamayiz. Cozum buluruz.

        Applicationlarda da cozumler icin kod yazariz.
        Exceptionlari cozmek icin yazilan kodlara "Exception Handling" kodlar denir.
            Handle (ENG) == Ustesinden gelmek (TR)


        Typical Types of Exception :
            1) Compile Time Exception
                Biz kod yazarken fark edilir ve yazilan kodun alti kirmizi cizgi ile cizilir.



            2) Run Time Exception
                Biz kod yazarken fark edilmez ama kod calistiginda console'da hata aliriz.



        Exceptions disinda "error" diye adlandirilan "handle" edilemeyen problemler vardir.
            Gercek hayatta soforun araba surerken olmesi gibi handle edilemeyecek durumlar Java'da error'dur.
            Application'larda "Memory"nin dolmasi "error"dur.
            Iki tur Memory var
            1) Stack Memory dolarsa "StackOverFlow Error" aliriz.
            2) Heap Memory dolarsa "OutOfMemory Error" aliriz.

        Yazdigimiz kod calismadiginda problemi bulmak icin "Log"lara bakariz.

        Exception'i handle etmezsek kodlar calismayi durdurur. exception bulundugu anda throw atar run durur.
        try catch yapip handle edersek try'da exception bulunursa
        catch ve devamindaki kodlar calismaya devam eder. Buna handle denir.
        try catch'in faydasi budur.


        6)    Why we use try-catch instead of useing if-else ?
        if else kullanirsak olusabilecek her problemi spesifik olarak if parantezinin icine yazmamiz gerekir.
        Bu da ciddi bir matematik bilgisi gerektiri. Ve yazacagimiz kodu cok uzatir.
        Ama try catch'te Java ilgili exceptionla alakali olusabilecek tum problemleri yakalar.

        7) Application exception alinca calismayi durdurur. Calisma durmasin diye handle yapariz.

        What is the Exception : We can say that Exception is "Unexpected issue".

         try kismina birden fazla Exception olusturma ihtimali olan code varsa coklu "catch" kullanabiliriz.
         coklu "catch" kullandigimizde Exception class'lar arasinda "parent-child" iliskisi YOKSA catch'lerin sirasi
         onemli degildir. Ama koddaki siralamaya uymak tavsiye edilir.
         coklu "catch" kullandigimizde Exception class'lar arasinda "parent-child" iliskisi VARSA catch'lerin sirasi
         onemlidir. Child olan class ustte olmalidir. Yoksa hata verir.
            */

    public static void main(String[] args) {
        int a = 12;
        int b = 0; // ArithmeticException
        divide(a,b);
        divide2(a,b);

    }
    // ArithmeticException ==> Yazdigimiz kodda matematiksel islem kullaniyorsaniz alinabilecek bir exceptiondur.
    // Nasil handle edilecegini asagida yazdik.
    public static void divide(int a, int b){ // divide (ENG) = böl (TR)
        try { // Java Exception'i yakaladigi anda sonraki kodlari calistirmaz. Hemen catch blockuna gecer.
            System.out.println(a/b);
            System.out.println("I am Here");
        } catch (ArithmeticException e){ // parametre olarak exception'in ismini yazariz ve "name" "assign" ederiz.
            System.out.println("Do not divide by zero");
        }
        System.out.println("You Are Here");
    }

    // Exception Handling'te if-else kullanilmaz. Look Note 6.
    public static void divide2 (int a, int b){
        if (b==0){
            System.out.println("Do not divide by zero");
        } else {
            System.out.println(a/b);
        }
    }
}

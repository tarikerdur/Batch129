package day22staticblocksconstructors;

public class StaticBlocks01 {

    // Bir variable olusturdugumuzda, deger atamazsaniz o variablei "initialize" etmediniz demektir.
        // static variable'lar static block'lar icinde initialize edilirse
        // o class'in icinde her seyden once hazir hale getirilmis olur.
            // Bazen main method calistirilmadan once variable'larin hazir hale getirilmesi gerekir.
            // Bu yuzden static block'lar kullanilir.
    // main method asagida da olsa yukarida da olsa once static blocklar calistirilir. java syntax'i boyle.
    static double pi; // default value ===> 0.0
    static String shape; // default value ===> null --- shape == sekil


    static {
        pi = 3.14; // burada "initialize" ettik.
        System.out.println("Static block 1");
    }

    static {
        shape = "Circle";
        System.out.println("Static block 2");
    }
        /*
            static block variablein main methoddan once initialize edilmesini saglar.
            main method calismadan once variablellari hazir asker gibi dizer,
                sonra main method o hazir variablellari istedigi gibi kullanir.

            NOTES TO KNOW FOR NOW :
            i) static block'lar static variable'lari initialize etmek icin kullanilir.
            ii) static block'lar Class icinde HER SEYDEN ONCE calistirilirlar.
        */

    public static void main(String[] args) {
        System.out.println(pi);
        System.out.println("main method");
    }



}

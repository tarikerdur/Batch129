package my_practices.practice_nighttime.nighttime01;

public class C01_Variables {
    public static void main(String[] args) {


        // TechPro Education kelimesini her bir harf alt alta gelecek sekilde yazdiran kodu olusturunuz.

        /*
        \n bir satir asagi iner
        \t bir tab bosluk birakir
        \b gerisindeki ilk harfi siler
         */

        System.out.println("********* 1. YOL******");
        System.out.println("T");
        System.out.println("E");
        System.out.println("C");
        System.out.println("H");
        System.out.println(" ");
        System.out.println("P");
        System.out.println("R");
        System.out.println("O");
        System.out.println(" ");
        System.out.println("E");
        System.out.println("D");
        System.out.println("U");
        System.out.println("C");
        System.out.println("A");
        System.out.println("T");
        System.out.println("I");
        System.out.println("O");
        System.out.println("N");

        System.out.println("********* 2. YOL******");
        System.out.println("T\nE\nC\nH\nP\nR\nO\nE\nD\nU\nC\nA\nT\nI\nO\nN");

        String str1 = "PAZARTESI ";
        for (int i=0 ; i<9 ; i++ ) {
            System.out.println(str1.charAt(i));
        }

        String a = "\"TechPro\""; // Javada cift tirnak yazdirmak istersek \ ile ayirmak lazim.
        String b = "ile Java cok 'kolay'";
        System.out.println(a+b);


    }

}

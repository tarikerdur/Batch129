package my_practices.practice_nighttime.nighttime02;

import java.util.Scanner;

public class C02_MethodCreation {
    public static void main(String[] args) {
        /*
        Kullanicidan dikdortgenin kisa ve uzun kenarlarini alip
        dikdortgenin alanini hesaplayan kodu method olusturarak yaz ve consolea yazdir.
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Dikdortgenin kisa kenarini giriniz");
        float a = input.nextFloat(); // aldigimiz kisa kenari "a" containerimiza koyduk

        System.out.println("Dikdortgenin uzun kenarini giriniz");
        float b = input.nextFloat(); // aldigimiz uzun kenari "b" containerimiza koyduk

        float alan = dikdortgenAlani(a,b); // kisa ve uzun kenarlarimizi main disinda olusturdugumuz methodda kullandik ve "alan"a atadik.
        float cevre = dikdortgenCevresi(a,b); // kisa ve uzun kenarlarimizi main disinda olusturdugumuz methodda kullandik ve "cevre"ye atadik.

        System.out.println("Dikdortgenin alani\t\t: " + alan);
        System.out.println("Dikdortgenin cevresi\t: " + cevre);




        System.out.println("Karenin bir kenarini gir");
        int kareKenar = input.nextInt();
        kareAlan(kareKenar);


    }
    public static float dikdortgenAlani (float a, float b){
        return (a*b);
    }
    public static float dikdortgenCevresi (float a, float b){
        return 2*(a+b);
    }
    public static void kareAlan (int a){
        System.out.println("Karenin alani\t: " + (a*a));
    }
}

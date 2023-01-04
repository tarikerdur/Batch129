package day05typecastinstringmanipulations;

public class SwapValues {

    /*
    Swap: yer degistirmek demektir.
        1. Kap: Patates 2. Kap: Domates ===> Swap ===> 1. Kap: Domates 2. Kap: Patates

     Swap'i interviewlerde sorarlar, dedi.
     */

    public static void main(String[] args) {

        int a = 12;
        int b = 5; // swap'ten sonra ==> a=5 b=12 olmali
        int temp = 0 ; // temporary = gecici demek.
        System.out.println("a: " + a); // 5
        System.out.println("b: " + b); // 12

            // 1. YOL
        // 1. Adim
        temp = a; // a'daki degeri temp'e koyarak a'yi bosalttik.
        // 2. Adim
        a = b; // b'deki degeri, bosalan a'ya koyduk.
        // 3. Adim
        b = temp; // a'daki degeri temp'e koymustuk. Bu sefer de temp'teki a'nin ilk degerini b'ye aktardik.
        // Swap (yer degistirme) islemi bu adimlar sonunda tamamlandi.
        System.out.println("a: " + a); // 5
        System.out.println("b: " + b); // 12


            // 2. YOL (interview'lerde bu yolu duymak isterler. Bunun amaci bu eleman zeki mi, logic mi, analitik dusunebilir mi?)
        int x = 12;
        int y = 5;
        // 1. Adim
        x = x + y; // 12+5=17   ===> x=17 oldu
        // 2. Adim
        y = x - y; // x=17 olmustu. 17-5=12    ===> y=12 oldu
        // 3. Adim
        x = x - y; // x=17 y=12 olmustu. son adimda 17-12=5 oldu ve 5'i x'in icine atadik. son minvalde x=17 y=12 oldu.






    }
}

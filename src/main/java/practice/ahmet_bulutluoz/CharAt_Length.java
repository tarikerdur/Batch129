package practice.ahmet_bulutluoz;

import java.util.Random;

public class CharAt_Length {
    public static void main(String[] args) {
        String str = "Java her gecen gun daha da guzellesiyor, degil mi?";

        System.out.println(str.charAt(str.length()-3)); // tum karakter sayisindan sondan 3. karakteri
                                                        // cikarirsan sondan 3. karakteri buluruz ==> d
        System.out.println(str.length()); // 50

        // Javada index 0'dan baslar.
        // son karakter icin length-1


        // Rastgele bir karakterini yazdiralim.
        // Java utill'den random classini kullanicaz
        Random rnd = new Random(); // rnd degeri icin 0-1 arasinda rastgele bir deger olusturur.
        int index = rnd.nextInt(str.length()); // str.length'den kucuk rastgele bir int uretir.
        System.out.println(str.charAt(index));


    }
}

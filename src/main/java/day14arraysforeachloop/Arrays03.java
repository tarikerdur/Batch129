package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

        // Example 1 : String bir array olusturunuz, 6 tane eleman yerlestiriniz,
        // karakter sayisi 5'den buyuk olan elemanlari siliniz.

        String colors[] = new String[6];
        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Grown";
        System.out.println(Arrays.toString(colors)); // [Red, Orange, Blue, Yellow, Green, Grown]

            /*
            LOGIC : Yeni bir Array olusturup karakter sayisi 5 ve 5'den kucuk olan elemanlari
        yeni array'e transfer edecegiz. Boylelikle yeni arrayimizde karakter sayisi 5'ten
        buyuk olan hicbir eleman olmayacak.
            Soru : Hocam Array olusturmak icin 2 sey belirlenmelidir:
                1) Elemanlari data tipi - Bu belli String olacak.
                2) Yeni array'de kac tane eleman olacak?

            Verilen Array'de eleman sayisi 5 ve 5'den kucuk olan kac eleman var bulmaliyiz...
            Hadi bulalim...
            */
        int counter = 0; // counter (ENG) == sayac (TR)
        for (String w: colors) {
            if (w.length()<=5){
                counter++;
            }
        }
        System.out.println("Yeni Array'in eleman sayisi " + counter); // 4 --> Bu yeni Array'imizin eleman sayisi olacak.


        // yeni array olusturma kismi
        String newColors [] = new String[counter];

        // karakter sayisi 5 ve 5'den kucuk olanlari yeni Array'e transfer etme kismi
        int idx = 0; // yeni arrayimizde koyacagimiz seylerin indexini buradan kontrol edecegiz.
        for (String w : colors){
            if (w.length()<=5){
                newColors[idx] = w;
                idx++;
            }
        }
        System.out.println(Arrays.toString(newColors));

    }
}

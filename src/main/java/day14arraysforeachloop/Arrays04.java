package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {

        // Example 1: String bir array olusturunuz. 6 eleman ekleyiniz
        // Yellow'dan onceki elemanlari yazdiriniz.

        String colors[] = new String[6];
        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Grown";

        for (String w : colors) {

            if (w.equals("Yellow")) {
                break;
            }
            System.out.println(w);
        }

        System.out.println();

        // Example 2: Yellowdan sonraki elemanlari yazdir.
        // LOGIC: Son indexten geriye dogru taramaya baslicaz bu nedenle i=son indexe esit diyelim. bittigi yer de 0 oldu.


        // 1. YOL
        // Note: Elemanlari almaya son elemandan baslayacagimiz icin for each loop kullanamam. Bu yuzden for loop kullandim.
        for (int i = colors.length - 1; i >= 0; i--) { // for each loop'un caresiz kaldigi yerde for loop kullandik.
            if (colors[i].equals("Yellow")) {
                break;
            }
            System.out.println(colors[i]);
        }

        System.out.println();


        // 2. YOL
        // LOGIC : "Yellow" elemaninin indexini bul ve o indexten daha buyuk indexe sahip olan elemanlari yazdir.
        int counter = 0 ;
        for (String w : colors){ // "Yellow"un indexini counter'la bulucaz
            if (w.equals("Yellow")){
                break;
            }
            counter++;
        }
                // counter+1 ==> cunku buldugumuz indexten sonrasini yazdiracaz.
        for (int i = counter+1 ; i<colors.length; i++){ // Buldugumuz indexten sonrasindaki indexleri yazdiracaz.
            System.out.println(colors[i]);
        }


    }
}

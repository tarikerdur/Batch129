package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String args[]) { // mesela burada args yaninda kullandik.

        // Example : Integer array olusturunuz. Icine 6 tane eleman yerlestiriniz.
        //          Bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz.

        // 1. YOL:
        int[] ages = new int[6]; // [] parantezleri data type'dan sonra da kullanilabilir. variable'dan sonra da kullanilabilir.
        ages[0] = 20;
        ages[1] = 23;
        ages[2] = 19;
        ages[3] = 44;
        ages[4] = 15;
        ages[5] = 32;
        System.out.println(Arrays.toString(ages)); // [20, 23, 19, 44, 15, 32]

//        Arrays.sort(ages); // Arrays class'inda bulunan sort() methodu elemanlari kucukten buyuge dogru siralamaya yarar.
//
//        System.out.println(Arrays.toString(ages)); // [15, 19, 20, 23, 32, 44]
//        // Sort yaptiktan sonra ilk eleman en kucuk, son eleman en buyuk olacagi icin son ve ilk elemani toplarsak task tamamlanmis olur.
//
//        System.out.println(ages[0] + ages[ages.length - 1]); // 59





        // 2. YOL: for each loop kullanarak arrayin ilk datasini array'deki tum datalarla karsilastirip en kucugunu alip kutuya koyacak.
        // [20, 23, 19, 44, 15, 32]
        int minimum = ages[0]; // minimum'un icinde suan 20 var.
        // "karsilastir - kucugu sec - kutuya koy" loop'u yapacaz.

        for (int w : ages) { // minimum ile w'yi karsilastirip minimum'un icine koyduracaz. Math classindan yararlancaz.
            minimum = Math.min(minimum, w); // Math.max(kutuya koyulan karsilastirilacak deger, array'deki tum degerler)
            // artik minimum'un icinde 15 var.
        }
        System.out.println(minimum); // 15

        // max degeri de bulalim
        int maximum = ages[0];
        for (int w : ages) {
            maximum = Math.max(maximum, w); // Math.max(kutuya koyulan karsilastirilacak deger, array'deki tum degerler)
        }
        System.out.println(maximum); // 44

        System.out.println(minimum + maximum); // Array'imizdeki en kucuk ve en buyuk degerlerin toplami : 59



        // 1. Yol Java'yi yavaslatir. 2. yolu kullanmak daha iyidir.
    }
}

package my_practices.oylesinecalismalar;

import java.util.Arrays;

public class Arrays_Practice {
    /*
    Example :  String Array olusturun.Icine 5 tane eleman ekleyin.
               Tum elemanlarin icerdigi karakter sayilari toplamini ekrana yazdirin.
    */
    public static void main(String[] args) {

        String lawLessons[] = new String[5];
        lawLessons[0] = "Medeni Hukuk";//12
        lawLessons[1] = "Aile Hukuku";//11
        lawLessons[2] = "Ceza Hukuku";//11
        lawLessons[3] = "Idare Hukuku";//12
        lawLessons[4] = "Ceza Muhakemesi Hukuku";//22


        // for loop
        int sum = 0;
        for (int i = 0; i < lawLessons.length; i++) {
            sum += lawLessons[i].length();
        }
        System.out.println(sum);

        // for each loop yolu
        int total = 0;
        for (String w : lawLessons) {
            total += w.length();
        }
        System.out.println(total);


        /*
        Example : Integer array olusturunuz. Icine 6 tane eleman yerlestiriniz.
                  Bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz.
         */

        // 1. yol sort(); methodu
        Integer numbers[] = new Integer[6];
        numbers[0] = 34;
        numbers[1] = 12;
        numbers[2] = 138;
        numbers[3] = 69;
        numbers[4] = 52;
        numbers[5] = 31;
        System.out.println(Arrays.toString(numbers)); // [34, 12, 138, 69, 52, 31]
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers)); // [12, 31, 34, 52, 69, 138]

        int toplam = numbers[0] + numbers[numbers.length - 1];
        System.out.println(toplam); // 150


        // 2. yol for each
        Integer sayilar[] = new Integer[6];
        sayilar[0] = 34;
        sayilar[1] = 12;
        sayilar[2] = 138;
        sayilar[3] = 69;
        sayilar[4] = 52;
        sayilar[5] = 31;

        int maxi = sayilar[0];
        int mini = sayilar[0];
        for (Integer w : sayilar) {
            maxi = Math.max(maxi, w);
            mini = Math.min(mini, w);
        }
        System.out.println("en kucuk : " + mini + " en buyuk : " + maxi);


        /*
        Example : String bir array olusturunuz, 6 tane eleman yerlestiriniz,
                  Karakter sayisi 5'den buyuk olan elemanlari siliniz.
         */

        String[] cookies = new String[6];
        cookies[0] = "kavurma";
        cookies[1] = "doner";
        cookies[2] = "ispanak";
        cookies[3] = "yarrak";
        cookies[4] = "tuz";
        cookies[5] = "ekmek";
        System.out.println(Arrays.toString(cookies));

        int counter = 0;
        for (String w : cookies) {
            if (w.length() <= 5) {
                counter++;
            }
        }
        System.out.println(counter); // 3


        String tempCookies[] = new String[counter];

        int idx = 0;
        for (String w : cookies) {
            if (w.length() <= 5) {
                tempCookies[idx] = w;
                idx++;
            }
        }
        System.out.println(Arrays.toString(tempCookies));


        /*
           Example 1: String bir array olusturunuz. 6 eleman ekleyiniz
           Volkwagen'den onceki elemanlari yazdiriniz.
        */

        String[] cars = new String[6];
        cars[0] = "Chevrolet";
        cars[1] = "Suzuki";
        cars[2] = "Volkswagen";
        cars[3] = "Skoda";
        cars[4] = "Ferrari";
        cars[5] = "Toyota";

        for (String w : cars) {
            if (w.equals("Volkswagen")) {
                break;
            }
            System.out.println(w);
        }
        System.out.println();

        // Example 2: Volkswagen'den sonraki elemanlari yazdir.
                    // 1. yol
        for (int i = cars.length-1; i >-1 ; i--) {
            if (cars[i].equalsIgnoreCase("Volkswagen")){
                break;
            }
            System.out.println(cars[i]);
        }

        System.out.println();
                    // 2. yol
        int count = 0 ;
        for (String w : cars) {
            if (w.equalsIgnoreCase("volkswagen")){
                break;
            }
            count++;
        }
        System.out.println(count);

        System.out.println();


        for (int i = count+1; i< cars.length ; i++){
            System.out.println(cars[i]);
        }


        /*
        cars[] arrayinde "Tofas" araba var mi?"Skoda" araba var mi?"Mercedes" araba var mi?
         */
        System.out.println(Arrays.toString(cars));
        Arrays.sort(cars);
        System.out.println(Arrays.toString(cars));
        int whichIndex = Arrays.binarySearch(cars, "Volkswagen");
        System.out.println(whichIndex);



    }

}

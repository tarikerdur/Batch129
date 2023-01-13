package my_practices.advanced_practice.practice03;

import java.util.Arrays;
import java.util.Scanner;

public class Q07_Tekrar_Eden_Harfleri_Say {
    /*
       INTERWIEW QUESTIONS
       Kullanicidan bir String aliniz.
       String'de var olan her character'in sayisini ekrana yazdiriniz.
       Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
              abaa   ==> a=3  b=1
    */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("String gir");

        String str = input.nextLine().replaceAll(" ","");
        System.out.println(str);

        String[] arr = str.split("");
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int counter = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1].equals(arr[i])) {
                counter++;
            } else {
                System.out.println(arr[i - 1] + " karakterinin sayisi " + (counter + 1) + " kez tekrarlanmistir");
                counter = 0;
            }
            if (i == arr.length - 1) { //defalarca kodu yazdirmamasi icin sona gelindiginde yazdirmasiu icin if kullandik
                System.out.println(arr[i] + " karakterinin sayisi " + (counter + 1) + " kez tekrarlanmistir");
            }
        }

    }


}


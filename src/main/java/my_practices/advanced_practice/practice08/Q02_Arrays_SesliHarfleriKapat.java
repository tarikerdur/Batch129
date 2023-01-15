package my_practices.advanced_practice.practice08;

import java.util.Arrays;
import java.util.Scanner;

public class Q02_Arrays_SesliHarfleriKapat {
    public static void main(String[] args) {

            /*
            Kullanıcıdan alınan bir kelimedeki sesli harfleri kapatıp
        her bir karakteri bir array elemanı olarak yazdıran bir kod yazınız.
        Örn     :
        input   : Merhaba
        output  : [M, *, r, h, *, b, *]
            */

        Scanner input = new Scanner(System.in);
        System.out.println("Kelime gir");
        String str = input.nextLine().replaceAll("[AEIOUaeiou]","*").replaceAll(" ","");
        String [] arr = str.split("");
        System.out.println(Arrays.toString(arr));


    }
}


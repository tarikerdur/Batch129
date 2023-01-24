package my_practices.ssgpassbyvalueoverloading;

import java.util.Arrays;
import java.util.Random;

public class C02_PassByValue {
    public static void main(String[] args) {

        int[] arr = {3, 5, 6, 8};

        System.out.println("Methoddan once : " + Arrays.toString(arr));
        elemanDegistir(arr);
        System.out.println("Methoddan sonra : " + Arrays.toString(arr));
        System.out.println();
        System.out.println("arrayDegistir methodundan once : " + Arrays.toString(arr));
        arrayDegistir(arr);
        System.out.println("arrayDegistir methodundan sonra : " + Arrays.toString(arr));
    }

    private static void arrayDegistir(int[] arr) {
        arr = new int[3];
        Random rand = new Random();
        arr[0] = rand.nextInt(4);
        arr[1] = rand.nextInt(4);
        arr[2] = rand.nextInt(4);
        System.out.println("arrayDegistir methodu icinde : " + Arrays.toString(arr));
    }

    private static void elemanDegistir(int[] arr) {
        Random rnd = new Random();
        arr[1] = rnd.nextInt(100);
        arr[3] = rnd.nextInt(100);
        System.out.println("Methodun icinde : " + Arrays.toString(arr));
    }

}
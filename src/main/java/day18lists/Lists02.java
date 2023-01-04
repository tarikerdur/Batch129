package day18lists;

import java.util.*;

public class Lists02 {
    public static void main(String[] args) {

        // Example 1: Bir tane Integer List olusturunuz.
        // Bu List'te birbirine en yakin iki tam sayiyi yazdiriniz.
        // [12,23,9,11,35] ===> 12,11 yazdircak


        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(9);
        nums.add(11);
        nums.add(35);
        System.out.println(nums); // [12, 23, 9, 11, 35]

        Collections.sort(nums); // LISTLERDE SORT METHODU COLLECTIONSLARDA BULUNUYOR UNUTMA
        System.out.println(nums); // [9, 11, 12, 23, 35]

        int minDiff = nums.get(1) - nums.get(0); // burada rastgele bir fark aldik

        for (int i = 1; i < nums.size(); i++) { // farki bulmak icin yapilan cikarma isleminde
            // 2. elemandan 1. eleman cikarilcagi icin index 1'den baslicaz
            minDiff = Math.min(minDiff, nums.get(i) - nums.get(i - 1)); // burada da 2 element arasindaki farki aldik.
        }                                                        // sonra karsilastirip min olani alip atama yapacaz.
        System.out.println(minDiff);

        // Hangi sayilarin farkini aldigimizi ogrenmek icin baska bir loop yapacaz
        for (int i = 1; i < nums.size(); i++) {
            if ((nums.get(i) - nums.get(i - 1)) == minDiff) {
                System.out.println(nums.get(i - 1) + " and " + nums.get(i));
            }
        }
    }
}

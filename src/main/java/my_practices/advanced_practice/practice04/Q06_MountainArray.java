package my_practices.advanced_practice.practice04;

import java.util.*;

public class Q06_MountainArray {
    public static void main(String[] args) {
            /*
        Bir Array'in Mountain Array olup olmadigini kontrol eden bir kod yaziniz.
        Mountain Array: Element degerleri bir noktaya kadar sürekli artip o noktadan sonra surekli azalan Array.

        Logic : en yuksege cikarkenkileri bir array,
                azalirken de 2. array olusturup sort ve reverse sort yapalim.
            */

        int[] arr = {-999, 1, 2, 5, 7, 9, 22, 8, 3, 1, -100};

        // Array'i liste cevir

        ArrayList<Integer> list = new ArrayList<>();
        for (int w : arr) {
            list.add(w);
        }
        System.out.println("List : " + list); // [-999, 1, 2, 5, 7, 9, 22, 8, 3, 1, -100]


        // Tepe noktasini yani max degerini bulalim.

        int max = list.get(0);


        for (int w : list) {
            if (w > max) {
                max = w;
            }
        }
        System.out.println("MAX : " + max); // 22

        // max degere kadar olan kismi 1 list'e max'tan sonrasini baska bir list'e almak lazim
        // list 1
        ArrayList<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == max) {
                break;
            }
            list1.add(list.get(i));
        }
        System.out.println("List 1 : " + list1);


        // list 2
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (i < list.indexOf(max)) {
                continue;
            }
            list2.add(list.get(i));
        }
//        ya da boyle de olur
//        list2.addAll(list);
//        list2.removeAll(list1);

        System.out.println("List 2 : " + list2);


        // Yedekleyip sirala
        List<Integer> list1Copy = new ArrayList<>(list1);
        List<Integer> list2Copy = new ArrayList<>(list2);

        Collections.sort(list1Copy);
        Collections.sort(list2Copy, Comparator.reverseOrder());


        System.out.println("list1 Copy : " + list1Copy);
        System.out.println("list2 Copy : " + list2Copy);

        // Kontrol (Check)
        if (list1.equals(list1Copy) && list2.equals(list2Copy)) {
            System.out.println("Mountain Array");
        } else {
            System.out.println("Mountain Array DEGIL");
        }


    }
}

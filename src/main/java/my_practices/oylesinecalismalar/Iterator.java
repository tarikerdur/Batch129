package my_practices.oylesinecalismalar;

import java.util.*;

public class Iterator {
    public static void main(String[] args) {

        // reserve name

//        String str = "Tarik Erdur";
//        String[] arrStr = str.split("");
//        List<String> list1 = Arrays.asList(arrStr);
//
//        ListIterator<String> itr = list1.listIterator();
//
//        // Iterator
//        while (itr.hasNext()) {
//            itr.next();
//        }
//        while (itr.hasPrevious()) {
//            String s = itr.previous();
//            System.out.print(s);
//        }
//        System.out.println();
//
//        // for loop
//        for (int i = arrStr.length - 1; i > -1; i--) {
//            System.out.print(arrStr[i]);
//        }

        String str = "Java is Java";

        String[] arr = str.split("");

        Map<String, Integer> result = new LinkedHashMap<>(); // for sorted order, we can use HashMap

        for (String each : arr) {
            int frequency = Collections.frequency(Arrays.asList(arr), each);
            result.put(each, frequency);
        }


        System.out.println(result);
    }
}

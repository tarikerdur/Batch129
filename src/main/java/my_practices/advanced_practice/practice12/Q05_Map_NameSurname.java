package my_practices.advanced_practice.practice12;

import java.util.HashMap;

public class Q05_Map_NameSurname {

    /*
        İki farklı Array'de aynı indexte barındırılan ad ve soyadları örnekteki gibi yazdıran bir kod yazınız.
        input : {"John", "Mark", "Ali"}; {"Doe", "Twain", "Can"};
        output : {John=Doe, Mark=Twain, Ali=Can};
    */
    public static void main(String[] args) {

        String[] arr = {"John", "Mark", "Ali"};
        String[] brr = {"Doe", "Twain", "Can"};

        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {

            map.put(arr[i], brr[i]);
        }
        System.out.println(map);


    }


}

package my_practices.ssgpassbyvalueoverloading;

import java.util.ArrayList;
import java.util.List;

public class C03_PassByValue {
    /*
        bir list olusturalim iki ayri method'dan birinde sadece elemanlari degistirelim
        digerinde yeni bir list atayip, ayni sayida yeni eleman ekleyelim
        ve her iki method call'dan sonra kendi listemizi main method icerisinde kontrol edelim
     */
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(8);
        myList.add(10);
        myList.add(12);
        System.out.println("Methoddan once " + myList); // [8, 10, 12]
        elemanDegistir(myList); // [10, 15, 20]   ---->  [9, 8, 7]
        System.out.println(myList); // [10, 15]


    }

    private static void elemanDegistir(List<Integer> myList) {
        myList.set(0,10);
        myList.set(1,15);
        myList.set(2,20);
        System.out.println("Methoddan sonra : "+ myList);
        myList.remove(2);
        System.out.println(myList);
        myList = new ArrayList<>();
        myList.add(9);
        myList.add(8);
        myList.add(7);
        System.out.println(myList);
    }
}

package day32collections;

import java.util.Deque;
import java.util.LinkedList;

public class Deque01 { // "Deque" "Double Ended Queue" hem "FIFO" hem de "LIFO" icin kullanilir.

    public static void main(String[] args) {

            /*
        Deque'de hem bas hem son elemana gore islem yapilabilir. Queue'de sadece ilk elemanda islem yapiliyordu.

        Inheritance Faydalari
        1- Tekrar tekrar ayni kodu yazmaktan kurtarir
        2- Bir kodu degistirmek kolay olur
        3- Kod tamiri kolay olur
        4- Eger child classlara herseyi yerlestirirsek yavas olur. Ortaklari parent'a koyarsak child atomic olur, hizli calisir
        Overridingin faydası parenttaki methodu özelleştirerek child'larda kullanmaktır.

        Polimorphism'de 2 oge var.
        Overloading = Ayni isimli ama farkli isi yapan methodlar.
        Ovverriding = Parentlardaki her bir methodu ozellestirmek

        Parenttaki methodu degistirilerek her bir child da kullanilirsa
            buna overriding denir Bu cok faydalidir, esneklik.
            */


        Deque<Integer> dq = new LinkedList<>();
        dq.add(12);
        dq.add(5);
        dq.add(18);
        dq.add(9);
        dq.add(1);
        System.out.println(dq);



    }
}

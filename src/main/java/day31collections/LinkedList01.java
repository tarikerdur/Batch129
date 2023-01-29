package day31collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedList01 { // eleman yerine "node" kullaniliyor.
    public static void main(String[] args) {

                /*
                LinkedList'te insertion order'a gore siralama yapilir.

        1)interface'lerden object olusturulamaz cunku interface'lerin constructor'i yoktur.
        2)Abstract Class'lardan object olusturulamaz, constructor'lari vardir ama constructor object olusturmada kullanilamaz.

        3)interface'lerin constructor'lari olmadigindan collection olustururken interface isimleri "new" keyword'unden sonra kullanilamaz.

        4) class --> class ==> extends
           class --> interface ==> implements
           interface --> interface ==> extends
           interface --> class ==> Bu mumkun degildir. (Bir insanin Cin cocugu olamaz, espirisi yapti.)

                    ======= LinkedList Class =======
                    Iterable (interface) --> Collection (interface) --> List (interface) --> LinkedList (Class)

        ArrayList'ler eleman silme ve eklemede basarisizdirlar. Tekrar indexleme yapilacagi icin yavastirlar.
        Bu yuzden eleman silme ve ekleme islemleri coklukla yapilacaksa ArrayList kullanmak tavsiye edilmez. (not recommended)
        Java bu yuzden LinkedList Class'ini uretmistir. Java LinkedList Class'i index kullanmayacak sekilde olusturmustur. (recommended)

        LinkedList'ler yapilari dolayisiyla index kullanmadiklarindan eleman silmede ve eklemede re-index yapilmasina gerek yoktur.
        Bu da LinkedList'leri eleman ekleme ve silmede cok basarili hale getirir.
        Bu yuzden eleman ekleme ve silmenin cok yapilmasi gereken durumlarda LinkedList kullanmak tavsiye edilir.

        ArrayList'lerde search isleminde (get()) kullanislidir cunku indexler adres gibidir.
        Fakat LinkedList'lerde index kavrami olmadigi icin search isleminde kotudur.
        Teker teker tum elemanlari kontrol etmesi gerekmektedir. Bu app'i cok yavaslatir.
                */

        List<String> CityNames = new LinkedList<>(); // data type'ini parent'tan secebiliriz.
        // ArrayList'lerde olan method'lar LinkedList'te de vardir bunun sebebi bu methodlarin List interfaceinden override yapilmis olmasidir.

        LinkedList<String> names = new LinkedList<>(); // ama bunu kullanalim simdilik dedi.
        names.add("Steve");
        names.add("Ajda");
        names.add("Raj");
        names.add("Megan");
        names.add("Brandon");
        System.out.println(names); // [Steve, Ajda, Raj, Megan, Brandon]

        names.addFirst("Cuneyt");
        System.out.println(names); // [Cuneyt, Steve, Ajda, Raj, Megan, Brandon]

        names.addLast("Ajda"); // This method is equivalent to add.
        System.out.println(names); // [Cuneyt, Steve, Ajda, Raj, Megan, Brandon, Ajda]

        names.add(3,"Suleyman"); // LinkedList idx kullanmaz ama Java Developer'lar kolay
        // calissin diye idx parametreli methodu da koymustur. Ama Java arka plan'da idx kullanmiyor yine
        // teker teker en bastan bakiyo cok ugrasiyo.
        System.out.println(names); // [Cuneyt, Steve, Ajda, Suleyman, Raj, Megan, Brandon, Ajda]

        names.remove("Ajda"); // remove sadece ilk gorunumu siler
        System.out.println(names); // [Cuneyt, Steve, Suleyman, Raj, Megan, Brandon, Ajda]

        names.remove(4);
        System.out.println(names); // [Cuneyt, Steve, Suleyman, Raj, Brandon, Ajda]

        names.add("Suleyman");
        names.add("Suleyman");
        System.out.println(names); // [Cuneyt, Steve, Suleyman, Raj, Brandon, Ajda, Suleyman, Suleyman]

        String r1 = names.remove(); // Retrieves and removes the head (first element) of this list. (cut + paste)
        System.out.println(r1); // Cuneyt ==> (Retrieves --> geri alir ve bize verir)
        System.out.println(names); // [Steve, Suleyman, Raj, Brandon, Ajda, Suleyman, Suleyman]
        // poll'dan farki, remove bos linkedlistte kullanilirsa exception verir. poll bos linkedlistte kullanilirsa null verir.

        names.removeFirstOccurrence("Suleyman"); // Occurance (ENG) == Gorunum (TR) === Ilk gorunumu silen method
        System.out.println(names); // [Steve, Raj, Brandon, Ajda, Suleyman, Suleyman]

        names.removeLastOccurrence("Suleyman"); // Son gorunumu silen method
        System.out.println(names); // [Steve, Raj, Brandon, Ajda, Suleyman]

        System.out.println(names.getFirst()); // Returns the first element in this list. --- Steve
        System.out.println(names.getLast()); // Returns the last element in this list. --- Suleyman

        // Retrieves, but DOES NOT REMOVE, the head (first element) of this list. (copy + paste)
        // Returns: the head of this list, or null if this list is empty.
        // (Retrieve --> geri alir ve bize verir)
        String r2 = names.peek();
        System.out.println(r2); // Steve
        System.out.println(names); // [Steve, Raj, Brandon, Ajda, Suleyman]

        // Retrieves and removes the head (first element) of this list. (cut + paste)
        // Returns: the head of this list, or null if this list is empty
        // (Retrieve --> geri alir ve bize verir)
        // remove'dan farki, remove bos linkedlistte kullanilirsa exception verir. poll bos linkedlistte kullanilirsa null verir.
        names.poll(); // poll (verb) (ENG) == kesmek (TR)


        //Pops removes and returns the first element of this list. (cut + paste)
        //This method is equivalent to removeFirst().
        //Returns: the element at the front of this list (which is the top of the stack represented by this list)
        names.pop();






    }

}

package day18lists;

import java.util.ArrayList;
import java.util.List;

public class Lists04 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Ajda");
        names.add("Cuneyt");
        names.add("Mahsun");
        names.add("Muslum");
        names.add("Orhan");


        ArrayList<String> females = new ArrayList<>();
        females.add("Ajda");
        females.add("Emel");

// containsAll() methodu ==> bir listede baska bir listenin TUM ELEMENTLERI varsa true return eder.
// Ancak bir element dahi eksikse -bulunmuyorsa- false return eder.
        System.out.println(names.containsAll(females));

// subList() methodu ==> bir listede belirttigimiz index sinirlarini alip alt List yapar. subString() ile ayni mantik.
        List<String> subList = names.subList(1,3);
        System.out.println(subList); // [Cuneyt, Mahsun] ==> ikinci girilen index dahil degildir.


// retainAll() methodu ==> Bir List ile baska bir list arasinda ortak olmayan elemanlari siler.
        names.retainAll(females); // names listi ile females listi arasinda ayni olmayan elemanlari
                                  // names listinden silecez.
        System.out.println(names); // [Ajda] ==> tek ortak eleman "Ajda" oldugu icin o haric digerleri silindi.
        System.out.println(females); // [Ajda, Emel] ==> methodu names ile kullandigimiz icin bu liste degismedi.

        // Example 1 : Elektronik aletler ve ev aletleri listleriniz var.
        //             Elektronik ev aletlerini listeleyiniz.

        List<String> electronics = new ArrayList<>();
        electronics.add("TV");
        electronics.add("Radio");
        electronics.add("Refrigerator");
        electronics.add("Mobile Phone");
        electronics.add("Notebook");

        List<String> homeGoods = new ArrayList<>();
        homeGoods.add("Carpet");
        homeGoods.add("Fork");
        homeGoods.add("Radio");
        homeGoods.add("Chair");
        homeGoods.add("TV");

        // homeGoods.retainAll(electronics) ==> homeGoods ile electronics list'lerinin
        // ortak elemanlarini homeGoods list'i icinde verir.
        // In other words (Baska bir deyisle) homeGoods listindeki ortak olmayan elemanlari siler.
        // Mesela fork'u sildi cunku electronics'in icinde yok. TV silinmedi cunku electronics'te var.
        homeGoods.retainAll(electronics);
        System.out.println(homeGoods); // [Radio, TV]


// isEmpty() methodu ==> List'te hic eleman yoksa "true" return eder.
// 1 veya daha fazla eleman varsa "false" return eder.
        // String'teki isEmpty() ile ayni mantiktadir.
        // "isEmpty()" esasinda "names.size()==0" demektir.
        names.isEmpty();

// hashCode() methodu ==> Java'nin heap memory'de nonPrimitiveler icin urettigi reference'i bize verir.
        System.out.println(names.hashCode()); // 2041509 bu bizim local hashCode'umuz. Baskasi ulasamaz.
        // ama biz baskasina bizim bilgisayarimiza girme yetkisi verirsek bunu ancak o zaman kullanir.
        // hashCode'lar unique'dir. Degismez. Nasil bizim mail adresimiz tum dunyada degismiyorsa ayni oyledir.
        // Bu kod bizim local'imizde boyledir. Baska bir local'de ayni numara farkli bir seye verilmis olabilir.
        // hashCode methodu piyasada spesific bir mesele yoksa cok kullanilmaz.
        // Bu kod uretme java'nin kendi ic isleyisidir.
        // Mantikli bir sayi ile numara belirlemeye "Hashing Technique" denir.
        // Mesela uni ogrenci numaralarinin ilk iki hanesi uniye giris yilini simgeler vs gibi.
        // "Map"leri ogrenirken "Hashing Technique"yi yine gorucez, dedi.


    }
}

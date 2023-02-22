package day36lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {

        List<Double> myList = new ArrayList<>();
        myList.add(12.0);
        myList.add(4.0);
        myList.add(7.0);
        myList.add(3.0);
        myList.add(26.0);
        myList.add(38.0);
        List<Double> half = getHalfElements(myList);
        System.out.println(half); // [19.0, 13.0, 6.0, 3.5]


        List<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("John");
        list.add("Ajda");
        list.add("Angelina");
        list.add("Tom");
        list.add("Brad");
        list.add("Cuneyt");

        printAllAlphabeticallyUpperDistinct(list); // AJDA ANGELINA BRAD CUNEYT TOM
        System.out.println();
        printAllAlphabeticallyLowerDistinct(list); // tom cuneyt brad angelina ajda
        System.out.println();
        printAllSortWithLengthUpperDistinct(list); // TOM AJDA BRAD CUNEYT ANGELINA
        System.out.println();
        printAllSortWithLastCharDistinct1(list); // AJDA ANGELINA BRAD TOM JOHN CUNEYT **
        System.out.println();
        printAllSortWithLengthUpperDistinctSameLengthInAlphabeticalOrder(list); // TOM AJDA BRAD JOHN CUNEYT ANGELINA
        System.out.println();
        //System.out.println(removeElementIfTheLengthGreaterThanFive(list));
        System.out.println();
        //System.out.println(removeElementIfStartWithAOrEndsWithd(list));
        System.out.println();
        System.out.println(printLengthSquare(list)); // [9, 16, 16, 64, 9, 16, 36]
        System.out.println();
        System.out.println(printEvenWords(list));
        System.out.println();
        printAllSortWithLastCharDistinct2(list); // CUNEYT JOHN TOM BRAD AJDA ANGELINA **

    }

    // create a method to find the half of the elements greater than 5, distinct, in reverse order in a list.
    static List<Double> getHalfElements(List<Double> myList) {
        return myList.stream().distinct().filter(t -> t > 5).map(t -> t / 2).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    // write the all the list elements with uppercase, alphabetical order, as distinct
    static void printAllAlphabeticallyUpperDistinct(List<String> list) {
        list.stream().distinct().map(t -> t.toUpperCase()).sorted().forEach(t -> System.out.print(t + " "));
    }

    // write the all the list elements with lowerCase, reverse-alphabetical order, as distinct
    static void printAllAlphabeticallyLowerDistinct(List<String> list) {
        list.stream().distinct().map(t -> t.toLowerCase()).sorted(Comparator.reverseOrder()).forEach(t -> System.out.print(t + " "));
    }

    // write the all the list elements with upperCase, uzunluklarina gore artan sirayla, as distinct
    static void printAllSortWithLengthUpperDistinct(List<String> list) {
        list.stream().distinct().map(t -> t.toUpperCase()).sorted(Comparator.comparingInt(t -> t.length())).forEach(t -> System.out.print(t + " "));
    }

    // write the all the list elements with upperCase, son harflere gore AZALAN siralama order by last letter, as distinct
    static void printAllSortWithLastCharDistinct1(List<String> list) {
        list.stream().
                distinct().
                map(t -> t.toUpperCase()). // asagida bu kodu yazmadan lambda yaptik. oraya bak
                sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))).
                // (t->t.charAt(t.length()-1) bu ifade lambda expression olarak adlandirilir.
                // lambda yazarken 2 tarzimiz var. ya lambdra expressions kullaniriz ya da method reference kullaniriz.
                // method reference tercih edilir. ama mumkun degilse ya da daha cok is cikariyosa lambda expression kullanilir.
                // lambda expression kullanirsak neden method reference kullanmadiniz diye sorarlar.
                // selenium bazen method referencei sart kosar. kod dogru olsa dahi lambda expression kullanirsak bazen hata verebilir.
                        forEach(t -> System.out.print(t + " "));
    }

    static void printAllSortWithLastCharDistinct2(List<String> list) {
        list.stream().
                distinct().
                map(String::toUpperCase).
                sorted(Comparator.comparing(Utils::getLastChar).reversed()). // java'da son karakteri veren bir method yok. util'de olusturup method reference kullandik.
                forEach(Utils::printInTheSameLine);
    }


    // write the all the list elements with upperCase, uzunluklarina gore artan sirayla, as distinct
    // Uzunluklari ayni olan elemanlar alfabetik sirada olsunlar

    static void printAllSortWithLengthUpperDistinctSameLengthInAlphabeticalOrder(List<String> list) {
        list.stream().
                distinct().
                map(String::toUpperCase). // bu yapiya method reference denir. kod yazmadan var olan kodlarla calisiyoruz.
                // :: 'in anlami ... Class'ina git ... methodunu kullan.
                        sorted(Comparator.comparing(String::length).
                        // bu yapiya method reference denir. classin icindeki methodu adresle demek. karsilastirirken String classtaki lenhth methodu kullan dedik.
                                thenComparing(Comparator.naturalOrder())).
                forEach(System.out::println); // System class'indan print methodunu kullandik. BAKIN HIC KOD YAZMIYORUZ ARKADASLAR DIYE GAZA GELDI HOCA
    }

    // Karakter sayisi 5'ten fazla olan elemanlari siliniz.
//    static List<String> removeElementIfTheLengthGreaterThanFive(List<String>list){
//        list.removeIf(t->t.length()>5); // burada stream kullanmadan lambda kullandik.
//        return list;
//    }

    // "A" ile baslayan veya "d" ile biten elementleri silin
//    static List<String> removeElementIfStartWithAOrEndsWithd(List<String> list) {
//        list.removeIf(t -> t.startsWith("A") || t.endsWith("d"));
//        // Bazen "stream()" methodu bize lazim olan method'lara ulasmamiza engel olur.
//        // Bu yuzden "stream()" method'unu kullanmayiz. "removeIf()" methodunda oldugu gibi.
//
//        // Fakat "stream()" method'unu daha sonradan kullanmamiz gerekebilir.
//        // Bu durumda "stream()" methodunu kullanarak istedigimiz method'lara ulasiriz. "distinct()" methoduna ulastigimiz gibi.
//
//        // Sonuc bize list olarak lazimsa "collect(Collectors.toList())" ile sonucu List'e ceviririz.
//        return list.stream().distinct().collect(Collectors.toList()); // list return etcegi icin streamden collect list diyip return ettik.
//    }

    // List elemanlarinin karakter sayilarinin karelerini aliniz ve bir List olarak ekrana yazdiriniz.
    static List<Integer> printLengthSquare(List<String> list) {
        //return list.stream().map(t->t.length()*t.length()).collect(Collectors.toList()); -----> bunun yerine ;
        return list.stream().map(Utils::getLengthSquare).collect(Collectors.toList());
        // lambda expression yerine kendi olusturdugumuz baska bir class'taki methodu reference ettik.
    }

    // List elemanlarindan karakter sayisi cift sayi olanlari bir List icinde ekrana yazdiriniz.
    static List<String> printEvenWords(List<String> list) {
        return list.stream().filter(Utils::isLengthEven).collect(Collectors.toList());
    }

}

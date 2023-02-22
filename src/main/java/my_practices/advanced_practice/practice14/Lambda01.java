package my_practices.advanced_practice.practice14;

import java.util.*;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {

        List<Integer> sayi = new ArrayList<>(Arrays.asList(-5, -8, -12, 0, 1, 12, 5, 5, 6, 9, 15, 8));

        printAllEvenAndPositiveNumsByLamdaExpression(sayi);
        System.out.println();

        printAllEvenAndPositiveNumsByMethodReference(sayi);
        System.out.println();

        printSquare(sayi);
        System.out.println();

        printSquareDistinct(sayi);
        System.out.println();

        buyKucSirala(sayi);
        System.out.println();

        positiveCubeBirlerBas5(sayi);
        System.out.println();

        sumOflistElementsByMethodReference(sayi);
        System.out.println();

        sumOflistElementsByLambdaExpression(sayi);
        System.out.println();

        multiplyOflistsEvenElementsByLambdaExpression(sayi);
        System.out.println();

        System.out.println(sortTheListsEvenCubeElements(sayi));


    }

    // SORU 1: List elemanlarının çift ve pozitif olanlarını,
    // Lambda Expression kullanarak aralarında bosluk olacak sekilde yazdırın.
    static void printAllEvenAndPositiveNumsByLamdaExpression(List<Integer> list) {
        list.stream().filter(t -> t % 2 == 0 && t > 0).forEach(t -> System.out.print(t + " "));
    }

    // SORU 2: List elemanlarının çift ve pozitif olanlarını, Method Referances
    // kullanarak aralarında bosluk olacak sekilde yazdırın.
    static void printAllEvenAndPositiveNumsByMethodReference(List<Integer> list) {
        list.stream().filter(Utilities::evenAndPositive).forEach(Utilities::print);
    }

    //SORU 3 : List elemanlarının karelerini, aralarında bosluk olacak sekilde yazdırın
    static void printSquare(List<Integer> list) {
        list.stream().map(Utilities::square).forEach(Utilities::print);
    }

    //SORU 4 : List elemanlarının karelerini, tekrarsiz yazdırın.
    static void printSquareDistinct(List<Integer> list) {
        list.stream().map(Utilities::square).distinct().forEach(Utilities::print);
    }

    //SORU 5: List elemanlarını buyukten kucuge sıralayarak yazdırın
    public static void buyKucSirala(List<Integer> list) {
        list.stream().sorted(Comparator.reverseOrder()).forEach(Utilities::print);
    }


    // SORU 6 : List elemanlarının pozitif olanlarının,
    // kuplerini bulup, birler basamagı 5 olanları yazdırınız
    static void positiveCubeBirlerBas5(List<Integer> list) {
        list.stream().filter(t -> t > 0).map(t -> t * t * t).filter(t -> t % 10 == 5).forEach(Utilities::print);
    }

    // SORU 7: List elemanlarının Method References ile toplamını bulun ve yazdırın.
    static void sumOflistElementsByMethodReference(List<Integer> list) {
        Optional<Integer> result = list.stream().reduce(Integer::sum);
        // reduce() methodu streamdeki elemanlari degistirmeyen ancak elemanlarla islem yapmaya yarayan bir methoddur.
        // terminal method : methoddan sonra baska hicbir method kullanilamiyorsa buna terminal method denir.
        // reduce() methodu terminal method'dur.
        result.ifPresent(Utilities::print); // forEach()'de terminal method'dur.
        // ifPresent() : If a value is present,
        // performs the given action with the value, otherwise does nothing.
    }

    // SORU 8: List elemanlarının Lambda Expression ile toplamını bulun ve yazdırın
    static void sumOflistElementsByLambdaExpression(List<Integer> list) {
        Integer result = list.stream().reduce(0, (t, u) -> t + u);
        Utilities.print(result);
        //Orn; reduce( 0,(t,u)->t+u) ==>  "t" ilk degeri "sifir" dan alir, daha sonraki degerleri toplamanin sonucundan alir.
        //"u" ise degerlerini her zaman "stream " den yani akista bize ne verilmis ise (orn List) oradan alir .
        // //reduce( 0,(t,u)->t+u) burada bu codu int bir konteyner a koydugumuzda kizarmaz
        // //cunku herhalukarda  "0" bir deger oldugu icin "Optional Integer" a da gerek kalmaz.
        // //Aksi takdirde "0 Identity"  olmadiginda Java, Ya listte hic eleman yoksa(null ise)!!!  diye kizarir.
        // //Java null i Integer kabul etmedigi icin hata verir , bunu engellemek icin java "Optional IInteger" a cevirir
    }

    //SORU 9 : Listin pozitif elemanlarının, carpımını Lambda Expression ile return ederek yazdırın
    static void multiplyOflistsEvenElementsByLambdaExpression(List<Integer> list) {
        int result = list.stream().filter(t -> t > 0).reduce(1, (t, u) -> t * u);
        Utilities.print(result);
    }

    //SORU 10 : Listin cift elemanlarının, karelerini, kucukten buyuge sıralayıp list halinde return ederek yazdırınız
    static List<Integer> sortTheListsEvenCubeElements(List<Integer> list){
        List<Integer> result = list.stream().filter(t->t%2==0).map(t->t*t).sorted().collect(Collectors.toList());
        return result;
    }








}
package day35lambda;

import java.util.*;

public class Lambda01 {
    public static void main(String[] args) {

            /*
        Lambda nedir?
        1)  Lambda == Functional Programming
         Yani methodlari kullanarak kod yazmaktir.
        2)  "Functional Programming" "ne yapmak gerekir?" ile ilgilenir. "nasil yapmak gerekir?" ile ilgilenmez.
        "ne yapmak gerekir" ==> "what to do?"        "nasil yapmak gerekir" ==> "how to do?"

        3)  "Functional Programming"; Collections ve Arrays'de kullanilir.*******************************************************

        4)  Lambda, Java'ya "Java 8"de eklendi.
        5)  Programming 2 turludur. 1) Functional Programming (Lambda)  2) Structured Programming (Bodozlama kod yazmak)


        "stream()" elemanlari yukardan asagiya dizer."Lambda" list'i "stream" e cevirir öyle calisir.
        "filter()" filtrelemek icin kullanilir.
        "map()" u var olan elemani degistirmek icin kullanilir.
        "distinct()" u tekrarli elemanlari sadece bir kere gosterir ve tekrarsizlari olduklari kadar gosterir.
         Note : Distinct methodu ilk baslara konulursa "Lambda" ya daha az is yaptirmis oluruz.
        "reduce()" u  kullanildiginda elementler uzerınde degisiklik yapılmaz fakat üzerinde çalışma yapılır.
         Orn; reduce(0,(t,u)->t+u) ==> "t" ilk degeri "sifir" dan alir, daha sonraki degerleri toplamanin sonucundan alir.
         "u" ise degerlerini her zaman "stream" den alir

         get() methodu Optional data type'ini Integer'a cevirir.
            */

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);


        printElements1(nums); // 12 9 131 14 9 10 4 12 15
        System.out.println();

        printElements2(nums); // 12 9 131 14 9 10 4 12 15 -> functional
        System.out.println();

        printEvenElements1(nums); // 12 14 10 4 12
        System.out.println();

        printEvenElements2(nums); // 12 14 10 4 12 -> functional
        System.out.println();

        printSquareOfOddElements(nums); // 81 17161 81 225
        System.out.println();

        printCubeOfDistinctOddElements(nums); // 729 2248091 3375
        System.out.println();

        printSumOfSquaresOfDistinctEvenElements(nums); // 456
        System.out.println();

        printSProductOfSquareOfDistinctEvenElements(nums); // 45158400
        System.out.println();

        getMaxValue1(nums); // 131
        System.out.println();

        getMaxValue2(nums); // 131
        System.out.println();

        getMaxValue3(nums); // 131
        System.out.println();

        getMinValue1(nums); // 4
        System.out.println();

        getMinValue2(nums); // 4
        System.out.println();

        getMinValue3(nums); // 4
        System.out.println();

        getMinValue4(nums); // 4
        System.out.println();

        getMinGreaterThanSevenEven(nums); // 10
        System.out.println();


    }

    // 1)Create a method to print the list elements on the console
    // in the same line with a space between two consecutive elements.(Structured)
    public static void printElements1(List<Integer> nums) { // Structured Programming
        for (Integer w : nums) {
            System.out.print(w + " ");
        }
    }


    // 2) Create a method to print the list elements on the console
    // in the same line with a space between two consecutive elements.(Functional)
    public static void printElements2(List<Integer> nums) {
        nums.stream().forEach(t -> System.out.print(t + " ")); // "for each" --> "her biri icin"
    }//"stream" elemanlari yukardan asagiya dizer."Lambda" list'i "stream" e cevirir öyle calisir


    // 3) Create a method to print the "even"(cift) list elements on the console in the
    // same line with a space between two consecutive elements.(Structured)
    public static void printEvenElements1(List<Integer> nums) {
        for (Integer w : nums) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }
    }

    // 4) Create a method to print the "even"(cift) list elements on the console in the
    // same line with a space between two consecutive elements.(Functional)
    public static void printEvenElements2(List<Integer> nums) {
        nums.
                stream().
                filter(t -> t % 2 == 0).
                forEach(t -> System.out.print(t + " "));
    }   // filter methodu yazdigimiz kurala gore elemanlari ayiklar.
    // genel uygulamada bir satira 80 karakterden fazla yazilmaz. noktadan sonra asagi satira gecilir.
    // functional programming bu formatta yazilir.


    // 5) Create a method to print the square of odd list elements on the console in the same
    // line with a space between two consecutive elements. (Functional)
    public static void printSquareOfOddElements(List<Integer> nums) { // "odd" -- tek sayi -- even'in tersi
        nums.
                stream().
                filter(t -> t % 2 != 0).
                map(t -> t * t). // Lambda'da, map() methodu var olan elemani degistirmek icin kullaniliyor.
                forEach(t -> System.out.print(t + " "));
    }

    //6)Create a method to print the "cube" of "distinct" "odd" list
// elements on the console in the same line with a space between two consecutive elements.
//  Bir list'teki "tek sayi" olan elemanlarin "kup"lerini tekrarsiz olarak ayni satirda
//  aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void printCubeOfDistinctOddElements(List<Integer> nums) {
        nums.
                stream(). // distinct() buraya da konulabilir
                filter(t -> t % 2 != 0). // distinct() buraya da konulabilir
                distinct(). // distinct --> tekrarsiz // distinct() buraya da konulabilir
                map(t -> t * t * t). // distinct() buraya da konulabilir
                forEach(t -> System.out.print(t + " "));
    }

    //7)Create a method to calculate the "sum" of the "squares" of "distinct" "even" elements
    static void printSumOfSquaresOfDistinctEvenElements(List<Integer> nums) {
        Integer sum = nums.
                stream().
                distinct().
                filter(t -> t % 2 == 0).
                map(t -> t * t).
                reduce(0, (t, u) -> t + u); // reduce -- azaltmak
        // reduce() metodunda 0 sum başlangıç değeri, önce t ==> 0 olur, u ilk eleman, t ve u toplanır, sum yeni t olur, u ikinci eleman,
        //  ve bu şekilde loop tüm sayıları toplar,
        System.out.println(sum);
    }

    // 8)Create a method to calculate the "product" of the "square" of "distinct" "even" elements
    public static void printSProductOfSquareOfDistinctEvenElements(List<Integer> nums) {
        Integer product = nums.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(1, (t, u) -> t * u);
        System.out.println(product); // "product" -- Matematikte "carpim" anlamina geliyor.
    }

    // 9)Create a method to find the "maximum value" from the list elements
    // Maximum degeri ararken Integer.MIN_VALUE kullanmak genel pratiktir.
    // Minimum degeri ararken Integer.MAX_VALUE kullanmak genel pratiktir.
    // 1. yol
    public static void getMaxValue1(List<Integer> nums) {
        Integer max = nums.stream().distinct().reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u); // "t" ilk degerini reduce()'un ilk parametresinden alir.
        System.out.println(max);                                                               // "u" degerlerini stream'den alir.
    }

    // 2. yol
    public static void getMaxValue2(List<Integer> nums) {
        Integer max = nums.stream().distinct().reduce(nums.get(0), (t, u) -> t > u ? t : u);
        System.out.println(max);
    }

    // 3. yol
    public static void getMaxValue3(List<Integer> nums) {
        Integer max = nums.stream().distinct().sorted().reduce((t, u) -> u).get(); // sorted --> natural order'a gore siralar
        System.out.println(max);                                        // get() optional data type'ini Integer'a cevirir.
    }


    // 10) Create a method to find the minimum value from the list elements.
    // 1. yol
    public static void getMinValue1(List<Integer> nums) {
        Integer min = nums.stream().distinct().reduce((t, u) -> t > u ? u : t).get();
        System.out.println(min);
    }

    // 2. yol
    public static void getMinValue2(List<Integer> nums) {
        Integer min = nums.
                stream().
                distinct().
                sorted(Comparator.reverseOrder()) // ters siraladik
                .reduce((t, u) -> u) // en sondaki en kucuk olacagi icin tersten siralayinca sonra gelen sayiyi bize ver dedik.
                .get();
        System.out.println(min);
    }


    // 3. yol
    public static void getMinValue3(List<Integer> nums) {
        Integer min = nums.
                stream().
                distinct().
                sorted()
                .reduce((t, u) -> t)
                .get();
        System.out.println(min);
    }

    // 4. yol
    public static void getMinValue4(List<Integer> nums) {
        Integer min = nums.
                stream().
                distinct()
                .reduce((t, u) -> Math.min(t, u))
                .get();
        System.out.println(min);
    }


    // 11) Create a method to find the minimum value which is greater than 7 and even from the list
    // 12 9 131 14 9 10 4 12 15 ==> 10 <-- 7 den buyuk en kucuk cift sayi
    public static void getMinGreaterThanSevenEven(List<Integer> nums) {
        Integer min = nums.stream().filter(t-> t>7 && t%2==0).sorted().reduce((t,u)->t).get();
        System.out.println(min);
    }
}












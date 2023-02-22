package day37lambda;

import day36lambda.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda01 {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();

        myList.add(12);
        myList.add(8);
        myList.add(23);
        myList.add(10);
        myList.add(7);

        System.out.println(getSumOfAllElements(myList));
        System.out.println(getSumFrom7To70());
        System.out.println(getMultiplicationFrom3ToNine1());
        System.out.println(getMultiplicationFrom3ToNine2());


        System.out.println(getFactorial(5));
        System.out.println(getSumOfEvensBetweenTwoInt(14, 5));
        System.out.println(getSumOfDigitsBetweenTwoInts(12, 18));

    }

    // 1) Verilen List'teki tum sayilarin toplamini veren methodu olusturunuz.
    static int getSumOfAllElements(List<Integer> list) {
        return list.stream().reduce(Math::addExact).get();
    }

    // 2) 7'den 70'e kadar tum sayilarin toplamini veren kodu yaziniz.
    static int getSumFrom7To70() {
        //inclusive -- dahil <<<>>> exclusive -- dahil degil
        return IntStream.rangeClosed(7, 70).reduce(Math::addExact).getAsInt();
        // Intstream==> integerlari range'de verdigimiz araliklarda dizer.
        // Exact == Bire bir aynı
        // rangeClosed==> baslangis ve bitis araligi veriyor.
    }

    // 3) 3'ten 9'a kadar tum tam sayilarin carpimini veren methodu olusturunuz.
    static int getMultiplicationFrom3ToNine1() {
        return IntStream.rangeClosed(3, 9).reduce(Math::multiplyExact).getAsInt();
    }

    static int getMultiplicationFrom3ToNine2() {
        return IntStream.range(3, 10).reduce(Math::multiplyExact).getAsInt();
    }

    // 4) Size verilen sayinin faktoriyelini hesaplayan kodu yaziniz.
    static int getFactorial(int x) {
        if (x == 0) {
            return 1;
        } else if (x < 0) {
            System.out.println("Factorial operation cannot be done with negative numbers.");
            return -1;
        } else {
            return IntStream.rangeClosed(1, x).reduce(Math::multiplyExact).getAsInt();
        }
    }

    // 5) Size verilen iki tam sayi arasindaki tum cift sayilarin toplamini veren kodu yaziniz.
    static int getSumOfEvensBetweenTwoInt(int a, int b) {
        if (a > b) { // kullanici ilk sayiyi buyuk verirse diye swap yaptik.
            int temp = a;
            a = b;
            b = temp;
        }
        return IntStream.range(a + 1, b).filter(Utils::isNumberEven).sum(); // reduce degil sum kullandik.
    }

    // 6) Size verilen iki tam sayi arasindaki tum tam sayilarin rakamlari toplamini veren kodu yaziniz.
    // 12 ve 18 ==> 13 14 15 16 17 ==> 4+5+6+7+8 = 30
    public static int getSumOfDigitsBetweenTwoInts(int a, int b) {
        if (a > b) { // kullanici ilk sayiyi buyuk verirse diye swap yaptik.
            int temp = a;
            a = b;
            b = temp;
        }
        return IntStream.range(a + 1, b).map(Utils::getSumOfDigits).sum();
        // rakamlari teker teker alip sonradan toplayacak streamdeki elemanlar degiscek bu yuzden reduce yerine map kullandik.
    }


}
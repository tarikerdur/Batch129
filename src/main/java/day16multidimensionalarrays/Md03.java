package day16multidimensionalarrays;

public class Md03 {
    public static void main(String[] args) {

        // Example 1 : Bir tane int multi dimensional array olusturun
        // Bu Array'deki tum sayilarin toplamini veren kodu yazin.

        int a[][] = {{2, 62, 82}, {3, 13}};

        int sum = 0;
        for (int[] w : a) { // w ==> "{2,62,82}" bunu aldi. Iceri girdi.

            for (int k : w) { // k ==> "2 , 62 , 82" sayilarinin her birini aldi.
                sum += k; // sum'in icine atama yapti. sonra tum elemanlar icin bu tekrarlandi.
            }
        }
        System.out.println(sum); // 162

    }
}

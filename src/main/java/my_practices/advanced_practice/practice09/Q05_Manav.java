package my_practices.advanced_practice.practice09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q05_Manav {
    /*
     Basit bir 5 ürünlü manav alışveris programı yazınız.
 * 1. Adim : Ürün ve fiyat listesi oluştur.
 * 2. Adim : Ürün listesinden kod ile ürün seçtir ve kaç kilo olduğunu sor.
 * 3. Adim : Müşteri her ürün seçtiğinde, aldığı ürünün fiyatını toplam fiyata ekle.
 * 4. Adim : Alışveriş bitince ödemesi gereken tutarı göster.
 * 5. Adim : Başka bir ürün almak isteyip istemediğini sor.
 * 			 İstemiyorsa ödenecek tutarı göster, istiyorsa tekrar ürün seçtir.
 * 			 Bu islemi alışveriş bitene kadar tekrarla.
    */
    static List<String> productList = new ArrayList<>();
    static int totalPayment = 0;


    public static void main(String[] args) {
        productList.add("Tomato - Product Num: 1 - Price: 20");
        productList.add("Pepper - Product Num: 2 - Price: 25");
        productList.add("Potato - Product Num: 3 - Price: 9");
        productList.add("Apple - Product Num: 4 - Price: 15");
        productList.add("Banana - Product Num: 5 - Price: 30");

        System.out.println("productList = " + productList);
        customerChoice();

    }

    static void customerChoice() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the product num : ");
        int productNum = input.nextInt();

        System.out.println("Enter the kg that you want to buy : ");
        int kg = input.nextInt();

        totalPayment += Integer.parseInt
                (
                        productList.get(productNum - 1).split(" ")
                                [productList.get(productNum - 1).split(" ").length - 1]
                )
                * kg;
        System.out.println("Total Payment : " + totalPayment);
        System.out.println("Enter 'd' for continue, for over market enter any character : ");

        if (input.next().equalsIgnoreCase("d")){
            customerChoice();
        } else {
            System.out.println("Total Payment : " + totalPayment);
            System.out.println("Thanks for choosing us. See you later alligator.");
        }


    }
}

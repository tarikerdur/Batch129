package day18lists;

import java.util.ArrayList;
import java.util.List;

public class Lists01 {
    public static void main(String[] args) {

        // Example 1: Integer bir List olusturunuz.
        //            List'e 5 tane eleman ekleyiniz.
        //            Bu elemanlardan 12'yi siliniz.


        List<Integer> ages = new ArrayList<>();
        ages.add(10);
        ages.add(25);
        ages.add(12);
        ages.add(8);
        ages.add(12);

        ages.remove(12);
        /*
            Boyle yaparsak java 12'yi object olarak degil index olarak algilar ve hatali islem yapariz.
            Javaya tam sayi yazdigimizda java tam sayinin data tipini otomatik olarak primitive kabul eder.
            Tam sayiyi object olarak gostermek icin bazi yollar :
        */
        // 1. YOL
        Integer nonPrimitive = 12; // Yeni bir yer olusturduk memoryde yer isgal ettik
        ages.remove(nonPrimitive);
        // 2. YOL ==> Recommended
        ages.remove((Integer) 12); // En temiz ve memoryi kullanmayan yoldur. Tavsiye edilir.
        // 3. YOL
        ages.remove(Integer.valueOf(12)); // 2 method kullandik
        // 4. YOL
        ages.remove(ages.indexOf(12)); // 2 method kullandik

        // Bu 4 yolun hepsi de sadece elementlerin ilk gorunumlerini siler.


        // Example 2: Integer bir List olusturunuz.
        //            List'e 5 tane eleman ekleyiniz.
        //            Bu elemanlardan tum 12'leri siliniz.

// removeAll() methodu
        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(25);
        nums.add(12);
        nums.add(8);
        nums.add(12);

        System.out.println(nums);

        /*
            removeAll() methodunu kullanmak icin silinmesini istedigimiz tum elementleri
            bir list'e koyup o listeyi methodun icinde kullanmamiz lazim.
        */

        List<Integer> silinecekler = new ArrayList<>();
        silinecekler.add(12);

        nums.removeAll(silinecekler);
        System.out.println(nums);
    }
}

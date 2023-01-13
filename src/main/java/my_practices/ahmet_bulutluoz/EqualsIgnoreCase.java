package my_practices.ahmet_bulutluoz;

public class EqualsIgnoreCase {

    public static void main(String[] args) {

        String str1 = "Pazar";
        String str2 = "PAZAR";
        String str3 = "pazar";
        String str4 = "PaZaR";

        System.out.println(str1==str2); // false
        System.out.println(str1==str3); // false
        System.out.println(str1==str4); // false

                // "==" yaparsak hem harfleri hem de referanslari karsilastirir.

        System.out.println(str1.equals(str2)); // false
        System.out.println(str1.equals(str3)); // false
        System.out.println(str1.equals(str4)); // false

                /*
                Eger iki metni KARSILASTIRIRKEN buyuk harf-kucuk harf duyarliligi (case sensitive)
                onemsiz ise equalsIgnoreCase() methodu kullanilir.
                */

        System.out.println(str1.equalsIgnoreCase(str2)); // true
        System.out.println(str1.equalsIgnoreCase(str3)); // true
        System.out.println(str1.equalsIgnoreCase(str4)); // true



    }

}

package day15arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays05 {
    public static void main(String[] args) {

        // Example 1 : String Array elemanlarini karakter sayisina gore kucukten buyuge siralayiniz.
        // ["Michael" , "Ajda" , "Thomas", "Tom"]  ====> ["Tom", "Ajda", "Thomas", "Michael"]
        // Ilk aklima gelen LOGIC: Her elemanin uzunlugunu length'e gore alip int arrayinde topla sonra sort() methoduyla sirala.

        // Hocanin cozumu YENI BIR SEY OGRENDIK:
        // Comparator ==> Karsilastirma
        String[] arr = {"Michael", "Ajda", "Thomas", "Tom"};
        System.out.println(Arrays.toString(arr)); // [Michael, Ajda, Thomas, Tom]

        Arrays.sort(arr, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(arr)); // [Tom, Ajda, Thomas, Michael]

        /*
            "::" ==> method reference
            "Comparator" ==> karsilastirmak demek.
            array'i sort yaptiktan sonra normalde alfabetik olarak siralamasi gerekirken
            Java'ya Comparator.comparingInt diyerek buna gore sirala dedik.
            String::length ==> uzunluga gore int dondur sirala dedik.
        */



        // Example 2 : String elemanlarini buyukten kucuge sirala
        //["Michael" , "Ajda" , "Thomas", "Tom", "Cuneyt"]  ====> ["Michael", "Thomas", "Cuneyt", "Ajda", "Tom"]
        String[] brr = {"Michael", "Ajda", "Thomas", "Tom", "Cuneyt"};
        System.out.println(Arrays.toString(brr)); // [Michael, Ajda, Thomas, Tom, Cuneyt]

        Arrays.sort(brr, Comparator.comparingInt(String::length).reversed()); // reversed() methodu tersten siralar.
        System.out.println(Arrays.toString(brr)); // [Michael, Thomas, Cuneyt, Ajda, Tom]


        // Example 3 : String elemanlarini buyukten kucuge sirala
        // Ayni karakter sayisinda olanlari da alfabetik siraya koyunuz.
        //["Michael" , "Ajda" , "Reyhane", "Gabriel", "Thomas", "Tom","Ali", "Cin","Cuneyt", "Cem"]
        //                  ====> ["Gabriel", "Michael","Reyhane", "Thomas", "Cuneyt", "Ajda", "Ali", "Cem", "Cin", "Tom"]

        String[] crr = {"Michael", "Ajda", "Reyhane", "Gabriel", "Thomas", "Tom", "Ali", "Cin", "Cuneyt", "Cem"};
        System.out.println(Arrays.toString(crr)); // [Michael, Ajda, Reyhane, Gabriel, Thomas, Tom, Ali, Cin, Cuneyt, Cem]

        Arrays.sort(crr, Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        System.out.println(Arrays.toString(crr)); // [Gabriel, Michael, Reyhane, Cuneyt, Thomas, Ajda, Ali, Cem, Cin, Tom]

        /*
            crr'yi sort() ettik. sonra uzunluga gore karsilastir ve length'e gore sirala dedik.
            sonra terse cevirerek buyukten kucuge hale getirdik.
            Bunu yaptiktan sonra yani "thenComparing" diyerek alfabetik siraya koydurduk.
            thenComparing() ===> Comparing yaptiktan sonra naturalOrder() diyerek alfabetik siralamayi yapiyoruz.

            Methodlari pespese kullandik lego gibi kodlari java gibi dusunerek is yaptik.
            Java'da var olan methodlari kullanmaya "functional programming" denir.
            Bu iyi bir seydir. Java'da yanlis olmaz ama siz olustururken hata yapabilirsiniz.
            functional programming'in diger adi LAMBDA'dir.
            LAMBDA cok eglencelidir core Java bitince ogreneceksiniz, dedi.

            functional programming ==> java'nin olusturdugu methodlari kullanmak, saglam yol.
            functional programming ==> lampda
            reversed ==> buyukten kucuge diz
            thencomparing ==> iceri gir iceriyi de duzenle
            Comparator.naturelorder==> iceride dogal siralama yap; yani alfebetik siralama yap
            Hem buyukler hemde kucukler icin ayri ayri siralama yapti
        */
    }
}

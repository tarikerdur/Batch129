package day05typecastinstringmanipulations;

public class StringManipulations01 { // Bu konuda cesitli method'lar ogrenecez.

    // String bir non-primitive data type'idir ve ayni zamanda bir class'tir.
                            /*
                            Bir methodu ogrenirken;
                                1- Bu method ne is yapar?
                                2- Bu methodun farkli kullanimlari nasildir?
                                3- Bu method size ne return eder?
                             */
    public static void main(String[] args) {

        String s = "Java is easy";

        //Example 1: "s" String'indeki tum character'leri buyuk harf yapiniz.
        String sUpper = s.toUpperCase(); // method isimleri yaptigi isleri ozetler. to upper case de buyuk harf demek.
        System.out.println(sUpper); // JAVA IS EASY

        //Example 2: "s" String'indeki tum character'leri kucuk harf yapiniz.
        String sLower = s.toLowerCase();
        System.out.println(sLower); // java is easy

        //Example 3: "s" String'indeki ilk character'i aliniz.
        char firstChar = s.charAt(0); // character aradigimiz icin char sinifinin bir methodudur bu.
        System.out.println(firstChar); // J

        //Example 4: "s" String'indeki 2. ve sondan 2. character'i aliniz ve ekrana yan yana yazdiriniz.
        char secondChar = s.charAt(1); // character aradigimiz icin char sinifinin bir methodudur.
        char secondLast = s.charAt(10);
        System.out.println(" " + secondChar + secondLast); /* char'lari matematiksel islemde kullanirsak ASCII degerlerini kullanir.
                                                          bu yuzden "" koyduk. Basa koysan da olur ortaya koysan da olur.
                                                          Ama sona koyarsan olmaz (concatination) */
        System.out.print(secondChar);
        System.out.println(secondLast); // bu da diger yol. ln koymadan yazdirirsin.

        //Example 5: "s" String'inde kullanilan character sayisini bulunuz.
        int sLength = s.length(); // (ENG) length = (TR) uzunluk ==> sayi return edecegi icin int sinifinda bir methoddur.
        System.out.println(sLength); // length() karakter sayisini verir.

        //Example 6: "s" String'indeki ilk 4 characteri aliniz.
        String sub1 = s.substring(0,4);
        /* substring(0,4) ==> yazilan ilk index dahildir. Bu yuzden 1 fazlasi yazilmaz,
                              bitis noktasinda yazilan index de haric demektir. Bu yuzden 1 fazlasi yazilir.

                              substring, String'in alt stringi demektir. Yani Stringin icinden bir bolumunu alicaz. */
        System.out.println(sub1); //"Java"

        //Example 7: "s" String'indeki "is" kelimesini aliniz.
        String sub2 = s.substring(5,7);
        System.out.println(sub2); //"is"

        //Example 8: "s" String'indeki "easy" kelimesini aliniz.
        String sub3 = s.substring(8,12);
        System.out.println(sub3); //"easy"
                  // Eger baslangic index'inden sonra her seyi almak istiyorsak sadece ilk baslangic yerini yazsan yeter.
        String sub4 = s.substring(8);
        System.out.println(sub4); //"easy"

        //Example 9: "s" String'inde "money" kelimesinin var olup olmadigini kontrol ediniz.
        boolean isExist = s.contains("money");
        System.out.println(isExist);
        /* bu methodun returnu true or false'dir. boolean donucek.
           (ENG) "contains" = (TR) "icermek" demektir.
         */

        //Example 10: "s" String'inin belli bir harfle baslayip baslamadigini kontrol ediniz. (mesela iban numaralari TR'de TR ile baslar bunu kontrol ederler, dedi)
        boolean isStart = s.startsWith("Java"); // "starts with ,,," (ENG) ==> "... ile baslar" (TR)
        System.out.println(isStart); // return boolean donecek.

        //Example 11: "s" String'inin 6. character'den (karakter dedim index demedim dikkat edin, dedi) itibaren "i" harfi ile baslayip baslamadigini kontrol ediniz.
        boolean isBegin = s.startsWith("i",5); // offset = "at gitsin" demek
        System.out.println(isBegin);
                        /*
                        toffset rakami 5. index dahil onceki indexteki karakterleri at gitsin demek oluyor.
                        prefix harfi de "i" ile basliyor mu sorusundaki karakteri yazdigimiz yerdir.
                         */



    }
}

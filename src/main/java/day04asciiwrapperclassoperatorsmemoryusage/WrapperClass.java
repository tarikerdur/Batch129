package day04asciiwrapperclassoperatorsmemoryusage;

public class WrapperClass {

    public static void main(String[] args) {

        /*
                            Wrapper Class (Heap Memory) : Icinde method bulunduran primitiveler diyebiliriz.
                    byte    ==>  Byte
                    short   ==>  Short
                    int     ==>  Integer
                    long    ==>  Long
                    float   ==>  Float
                    double  ==>  Double
                    char    ==>  Character
                    boolean ==>  Boolean

            Neden hep wrapper class kullanmiyoru??
    Answer: Wrapper Classlar non primitivedir. O yuzden memoryde cok yer kaplarlar. Wrapper Class mutlaka sart degilse kullanmayiz.

            Primitivelerin wrapping classa donusturmeye AUTO BOXING (kutuya koyma === Java bunu otomatik yaptigi icin auto deniyor) denir.
            Wrapping classlarin primitivelere donusturmeye UNBOXING (kutudan cikarma (UNboxing) === Java bunu otomatik yapmaz.)

        */

        int n = 12; // "n" yazip "nokta" koyarsak hic method goremezsiniz. Cunku primitiveler method icermez.
        Integer m = 12; // "m" yazip "nokta" koyarsak bircok method goruruz. Cunku "wrapper class"lar method icerir.

        byte p = 23;
        Byte r = 43;


        // Example: short data tipinin min ve max degerlerini kod yazarak bulunuz.

        System.out.println("max short\t:" + Short.MIN_VALUE);
        System.out.println("min short\t:" + Short.MAX_VALUE);

        // Example: int min degeri ile byte max degerinin toplamini bul.
        System.out.println("Toplam : " +  (Integer.MIN_VALUE + Byte.MAX_VALUE));


        // Example 3: (AUTO BOXING) i) primitive int'i wrapper Integer'a ceviriniz.
        int num = 22;
        Integer wrapperNum = num ; // Java esitligin sagina geldi. degeri alip soldaki kutunun icine otomatikmen koydu.
        System.out.println(wrapperNum);

        // Example 3: (UN BOXING) ii) wrapper byte'i primitive Byte'a ceviriniz.
        Byte wrapperK = 43;
        byte primitiveK = wrapperK; // Java esitligin sagina geldi. wrapper'i alip primiitivein icine koydu.
                                    // Eger burada deger yerine method olsaydi methodlar güme gıdecektı.

        // primitive char'i wrappera cevir.
        char initial = 'T';
        Character initialWrapper = initial;
        System.out.println(initialWrapper);

        // Wrapper booleani primitive cevir

        Boolean isOld = true;
        boolean isOldWrapper = isOld;
        System.out.println(isOldWrapper);

        // Example : Size String olarak verilen 2 fiyatin toplamini ekrana yazdirin
                                /*
                                  Java'da toplama (+) isareti hem TOPLAMA yapar hem de BIRLESTIRME yapar.
                                  Java String'leri toplarken toplama islemi yapmak yerine iki String'i birbirine yapistirir.
                                  Buna CONCATENATION denir. Concatenation'in sonucu hep String'tir.
                                  Java soldan gelirken gordugu islemleri hemen yapar. Mesela 3+4+"K" gorurse 7K yazdirir.
                                  Ama once String gorup sonra sayi gorurse artik String sonuc cikarir.
                                  Mesela "J"+5+12 gorurse J512 yazdirir.
                                  Islem onceligi var ise once orayi yapar. (JAVA MATEMATIK BILIR !!!)
                                */
        String shirt = "2300";
        String shoes = "5200";
        // Wrapper class'daki Integer'dan faydalanarak valueOf() methoduyla String'leri matematiksel olarak topluyoruz.
        int toplamFiyat = Integer.valueOf(shirt) + Integer.valueOf(shoes);
        System.out.println(toplamFiyat);


        // Example: Stringleri matematiksel olarak toplama islemi yaptir. Tum sayilar rakam degilken napcaz sorusunun cevabi?
        // String'lerin icine value disinda bir karakter koyarsan code hata verir. Bu hatayi duzeltmeyi yakinda ogreniceksiniz, dedi.
        String tv = "$11000";
        String radio = "$3000";
        int totalPrice = Integer.valueOf(tv) + Integer.valueOf(radio);
        System.out.println(totalPrice);


    }
}

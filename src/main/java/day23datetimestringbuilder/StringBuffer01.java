package day23datetimestringbuilder;

public class StringBuffer01 {
    public static void main(String[] args) {

     /*
        String olusturmak icin String Class, StringBuilder Class ve StringBuffer kullanilabilir.
            Aralarindan sadece String immutable'dir. StringBuilder ile StringBuffer arasindaki farklar sunlardir :
        1) StringBuffer, Java'nin String uretmek icin olusturdugu ilk Class'tir. Java 5'te uretilmistir. (Su an Java 19 var)
        2) StringBuffer, "synchronized"dir, StringBuilder "synchronized" degildir.
        3) StringBuffer, "thread-safe"dir, StringBuilder "thread-safe" degildir. -- THREAD (ENG) == İŞ (JAVA'CA) --
        4) StringBuffer ve StringBuilder ikisi de mutable'dir. -- mutable (ENG) == değişken (TR) --

        Note 1: Immutable String lazim oldugunda String Class kullaniriz.
        Note 2: Mutable String lazim oldugunda StringBuilder Class veya StringBuffer Class kullanilir.
        Note 3: StringBuffer "Multi Thread" ve "Synchronization" lazim oldugunda tercih edilir.
                StringBuilder "Multi Thread" ve "Synchronization" GEREKMEZSE tercih edilir.

        thread-safe ===> multi thread'e uygun yani ayni anda birden fazla is yapabilmektir.
        thread safe ve synchronized gerekiyorsa StringBuffer'la calis.
        Ama gerekmiyorsa StringBuilder ile calis. Cunku StringBuilder daha hizli calisir.
        StringBuilder, StringBuffer'dan daha basit bir yapidir. Daha hizlidir. Ama "Multi Thread" ve "Synchronization" yoktur.
     */

        StringBuffer sbf = new StringBuffer("Java");
        System.out.println(sbf); // Java

        System.out.println(sbf.capacity()); // 20 -- Java, StringBuffer'da 16+4 yapar. StringBuilder olsaydi 16 verecekti.
        // Testerlar String, StringBuilder, StringBuffer arasindaki farki bilsin yeter.
        // Thread ve synchronized gibi isin esas kismini developerlar advanced Java'da ogrenecek, dedi.



    }
}
package my_practices.ahmet_bulutluoz;

public class Substring {
    public static void main(String[] args) {
        String str = "Java ogren, isi kap";
        System.out.println(str.length()); //19

        // metnin tam ortasindaki karakter nedir ?
        System.out.println(str.charAt(str.length()/2)); // n ==> tam ortadaki karakter

        // metnin son karakteri nedir ?
        System.out.println(str.charAt(str.length()-1)); // p ==> son karakter

        // verilen Stringin icerdigi bir metin parcasini elde etmek istersek??
        // mesela "ogren" kelimesini yazdir
        System.out.println(str.substring(5, 10).toUpperCase()); //"OGREN" yazdirir
        // substring (baslangic, bitis) methodunda ilk index sayisi dahildir (inclusive),
        // son index sayisi dahil degildir.(exclusive)
        System.out.println(str.substring(str.length()-3)); // kap


    }
}

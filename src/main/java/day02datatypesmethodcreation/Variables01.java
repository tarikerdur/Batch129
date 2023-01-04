package day02datatypesmethodcreation;

public class Variables01 {

       /*
       float ===> kesirli (decimal) sayilar. sonuna f veya F konulur.
       float genelde fiyatlandirmalarda falan kullanir.

       double ==> kesirli (decimal) sayilar. double genelde hucre agirligi gibi hassas degerler icin kullanilir.
       cunku virgulden sonra cok hane vardir.
       */
       public static void main(String[] args) {

           // Ornek 1: Gomlek ve ayakkabi fiyatlari icin iki tane variable olusturup toplam fiyati ekrana yazdiriniz.
           // Java kesirli sayiyi hep double kabul eder. Bu yuzden valuenin yanina f ya da F koyarak float olsun diye israr ederiz.

           float shirtPrice = 12.99F ;
           float shoePrice = 15.89f ;

           System.out.print("Tisort fiyati\t: "  + shirtPrice);
           System.out.println("\nAyakkabi fiyati\t: "+ shoePrice);
           System.out.println("Toplam fiyat\t: " + (shirtPrice+shoePrice));

           // System.out.print() ekrana yazdirir ama "pointer"i ayni satirda birakir. Alt satira gecirmez.
           // System.out.println() ekrana yazdirir ve "pointer"i bir sonraki satira koyar.

           // Ornek 2: Hucre agirligi ve Amip`in agirligi icin iki tane variable olustur ve agirliklari farkini consolea yazdirin.

           double weightCell = 0.000000000000112;
           double weightAmip = 0.000000000000023;
           System.out.println(weightCell - weightAmip);/* Sonuc consolea 8.9E-14 yazdirdi. E harfi exponent demektir.
                                                        Yani ornegimizde 8.9 carpi uzeri =14 anlamamiz gerekir. */


           /*
                Note 1: Primitive data typelarini Java olusturur. Biz olusturamayiz. Eger ilerde bir primitive olusturmak
           gerekirse bunu yine Java halleder.

                Note 2: Primitive data typlari sadece kucuk harf kullanilir.
           Buyuk harf kullanilirsa wrapping class olur. (ileride anlaticam dedi)

                Note 3: Primitive datalar data typelara gore memoryde farkli farkli yer kaplarlar.
                Note 4: Primitive datalar iclerinde sadece bizim verdigimiz value bulundurur. Method bulundurmaz.
           */


    }
}
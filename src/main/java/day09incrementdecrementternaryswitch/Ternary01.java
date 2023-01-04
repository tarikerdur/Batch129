package day09incrementdecrementternaryswitch;

public class Ternary01 {
    public static void main(String[] args) {

        // EXAMPLE 1:
        int a = 10;
        int b = 20;

        int r1 = a < 7 ? a++ : b++; // true taraf hic calismadigi icin a'nin degeri degismedi.
        System.out.println(r1); // yukarida b'nin degerini arttirmadan r1'e atama yaptigi icin 20 gorduk.
        System.out.println(a); // a'ya dokunmadi zaten. 10
        System.out.println(b); // java yukarida degeri arttirdigi icin artmis halini bu satirda kullandik. 21
        // Java soldan saga ustten asagi islem yapar.


        // EXAMPLE 2: verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz.
        // mutlak deger (absolut value) sifirdan kucukler icin kullanilir.
        // ==> -4 ==> -1*-4         4 ==> 4       0 ==> 0
        int c = -4;
        int r2 = c < 0 ? c *= -1 : c;
        System.out.println(r2); // 4

        // EXAMPLE 3: iki sayinin isareti ayni ise bu sayilari carpan,
        // isaretleri farkli ise "Farkli isaretli sayilari carpamiyorum" mesaji veren kodu yaz

        int m = 5;
        int n = -6;

        Object r3 = (m > 0 && n > 00) || (m < 0 && n < 0) ? m * n : "Farkli isaretli sayilari carpamiyorum";
        /*
        Object ==> parent'i olmayan tek data type'dir.
        Object non-primitive olarak kabul edilir. Ve non-primitivelerin en ustteki parent'idir.

            Object her data type'larin primitive, non-primitive, wrapper class'i gibi tum her seyin
        en ustundeki kesisim yeridir. BABASIDIR.
            Bu yuzden farkli data type donme ihtimalleri var ise
        return edecek data type olarak "Object" non-primitive'ini kullaniriz.

            Object java'da Hz. Adem'e benzer.
         */


        // EXAMPLE 4: Size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yazin.
        int p = -123;
        int r = Math.abs(p); // mutlak degerli sonucu r'ye atayip if icinde r'yi kullandik.
                             // Ancak goze daha hos gorunsun diye kullaniciya mesaj gonderirken onun girdigi p'yi yazdik.
        String r4 = (r > 99 && r < 1000) ? p + ", 3 basamakli" : p + ", 3 basamakli degil";
        System.out.println(r4);

    }
}

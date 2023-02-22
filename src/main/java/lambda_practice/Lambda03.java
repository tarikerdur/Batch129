package lambda_practice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambda03 {
    public static void main(String[] args) {

        Apartman da01 = new Apartman("dogu", 1, 7000);
        Apartman da02 = new Apartman("bati", 2, 10000);
        Apartman da03 = new Apartman("guney", 3, 12000);
        Apartman da04 = new Apartman("dogu", 5, 15000);
        List<Apartman> daireler = new ArrayList<>(Arrays.asList(da01, da02, da03, da04));


        System.out.println(tumDaireKira5000denBuyuk(daireler));
        System.out.println(enAzBirininKatSayisi2Mi(daireler));
        System.out.println(cephesiDoguOlanSayisi(daireler));
        System.out.println(katSayisinaGoreBuyuktenKucugeSiralama(daireler));
        System.out.println(kirayaGoreBuyuktenKucugeSiralama(daireler));
        kirayaGoreBuyuktenKucugeSiralama2Yol(daireler);
        System.out.println(katSayisi3denAzOlanKiraGoreKucBuySiralaEnKucKiraListYazdir(daireler));


    }

    // SORU 1: Tüm dairelerin kira'ları 5000'den buyuk ise return ederek True yazdırın
    public static boolean tumDaireKira5000denBuyuk(List<Apartman> daireler) {
        boolean s = daireler.stream().allMatch(t -> t.getKira() > 5000);
        return s;
    }

    // SORU 2: Dairelerden En Az Birinin katSayisi 2 ise return ederek True yazdırın
    public static boolean enAzBirininKatSayisi2Mi(List<Apartman> daireler) {
        boolean s = daireler.stream().anyMatch(t -> t.getKatSayi() == 2);
        return s;
    }

    // SORU 3: Dairelerden cephesi "dogu" olanların, sayısını return ederek yazdırınız.
    public static long cephesiDoguOlanSayisi(List<Apartman> daireler) {
        long sonuc = daireler.stream().filter(t -> t.getCephe().contains("dogu")).count();
        return sonuc;
    }

    // SORU 4: Daireleri, katSayisina göre buyukten kucuge sıralayınız.
    // List halinde return ederek yazdırınız.
    public static List katSayisinaGoreBuyuktenKucugeSiralama(List<Apartman> daireler) {
        List<Apartman> sonuc = daireler.
                stream().
                sorted(Comparator.comparing(Apartman::getKatSayi).reversed()).
                collect(Collectors.toList());
        return sonuc;
    }

    // SORU 5: katSayisi 2'den fazla olan daireleri, kiraya gore buyukten kucuge sıralayınız
    // en buyuk kira'sını list halinde return ederek yazdırınız.
    public static List kirayaGoreBuyuktenKucugeSiralama(List<Apartman> daireler) {
        List<Integer> sonuc = daireler.
                stream().filter(t -> t.getKatSayi() > 2).
                sorted(Comparator.comparing(Apartman::getKira).reversed()).
                limit(1).
                map(t -> t.getKira()).
                // biz sadece kirayi almak istiyoruz.
                // Stream'deki elementler degisiklige ugrayacagi icin
                // map kullandik ve Stream'i sadece kiraya indirgedik.
                        collect(Collectors.toList());
        return sonuc;
    }
    // SORU 5: katSayisi 2'den fazla olan daireleri, kiraya gore buyukten kucuge sıralayınız
    // en buyuk kira'sını list halinde return ederek yazdırınız.
    // 2. YOL
    public static void kirayaGoreBuyuktenKucugeSiralama2Yol(List<Apartman> daireler) {
        Stream<Integer> sonuc = daireler.
                stream().filter(t -> t.getKatSayi() > 2).
                sorted(Comparator.comparing(Apartman::getKira).reversed()).
                limit(1).
                map(t -> t.getKira());
                // biz sadece kirayi almak istiyoruz.
                // Stream'deki elementler degisiklige ugrayacagi icin
                // map kullandik ve Stream'i sadece kiraya indirgedik.
        System.out.println(Arrays.asList(sonuc.toArray()));
    }

    // SORU 6: katSayisi 3'den az olan daireleri, kiraya gore kucukten buyuge sıralayınız
    // en kucuk kira'sini list halinde return ederek yazdırınız.
    public static List katSayisi3denAzOlanKiraGoreKucBuySiralaEnKucKiraListYazdir(List<Apartman> daireler) {
        List<Integer> kira = daireler.
                stream().
                filter(t->t.getKatSayi()<3).
                sorted(Comparator.comparing(Apartman::getKira)).
                limit(1).
                map(t->t.getKira()).
                collect(Collectors.toList());
        return kira;
    }


}

package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Hello {
    public static void main(String[] args) {

        /*
            projemizin adı YIYECEK OTOMATI
        --15 adet ürün ve bu ürünlerin fiyatlarını belirleyiniz.
                Bu ürünler ekranda listelensin
        --ürün seçip, para miktarı giriniz
        --girdiğiniz para fazla ise üstünü versin, eksik ise ekleme yapmanızı istesin
        --Ek ürün seçme seçeneği olsun, siz devam ettiğiniz sürece,para kontrolünü de yaparak işlem yapmaya devam etsin...
            NOT: Otomat sadece 1 tl , 5 tl, 10 tl, 20 tl miktarlarını kabul etsin
        iyi çalışmalar
        Kolay gelsin...
        1 ne istedigini sor
        2 fiyatini hesabla
        3 parasini al
            */

        String[] yiyecekler = {"elma", "armut", "mandalin", "cikolata", "nutella", "portakal",
                "makarna", "kivi", "kola", "su", "coconat",
                "kavun", "muz", "ayva", "karpuz"};

        ArrayList<String> otomat = new ArrayList<>();
        otomat.addAll(Arrays.asList(yiyecekler));

        String[] price = {"1", "5", "10", "20"};
        ArrayList<String> priceList = new ArrayList<>();
        
        priceList.addAll(Arrays.asList(price));

        
        
        
        
        ArrayList<String> otomatNew = new ArrayList<>();

        int idx = 0;
        for (String w : yiyecekler) {

            otomatNew.add(w + " = " + priceList.get(idx));
            idx++;
        }

        System.out.println(otomatNew);



    }
}

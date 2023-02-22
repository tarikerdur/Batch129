package lambda_practice;

import java.util.Iterator;
import java.util.stream.IntStream;

public class Lambda04 {
    public static void main(String[] args) {
        System.out.println(birdenXeKadarToplam(10));
        System.out.println(birdenXeKadarToplamLoop(10));
        System.out.println(birdenXeKadarTekSayilarToplam(10)); // 1 + 3 + 5 + 7 + 9 == 25
        System.out.println(birdenXeKadarTekSayilarToplamLoop(10));
        System.out.println(birdenSonsuzaKadarTekSayilardanXTanesininToplami(3)); // 1 + 3 + 5 == 9
        System.out.println(ikidenSonsuzaKadarCiftSayilardanXTanesininToplami(3)); // 2 + 4 + 6 == 12
        System.out.println(bestenSonsuzaKadarGidenKuvvetlerindenXKuvvetineKadarToplam(3));
        System.out.println(getFactorial(5));
    }

    // SORU 1: 1'den x'e kadar int degerleri akısa alınız(x dahil olacak), toplamını bulup return ederek yazdırınız.
    public static int birdenXeKadarToplam(int x) {
        int sonuc = IntStream.range(1, x).sum();
        return sonuc;
    }
    // SORU 1: 1'den x'e kadar int degerleri akısa alınız(x dahil olacak), toplamını bulup return ederek yazdırınız.
    // For Loop
    public static int birdenXeKadarToplamLoop(int x) {
        int sonuc = 0;
        for (int i = 0; i < x; i++) {
            sonuc += i;
        }
        return sonuc;
    }
    // SORU 2: 1'den x'e kadar int degerleri akısa alınız(x dahil olacak),
    // tek sayıların, toplamını bulup return ederek yazdırınız. (x dahil olacak)
    public static int birdenXeKadarTekSayilarToplam(int x){
        int sonuc = IntStream.rangeClosed(1,x).filter(t->t%2==1).sum();
        return sonuc;
    }
    // SORU 2: 1'den x'e kadar int degerleri akısa alınız(x dahil olacak),
    // tek sayıların, toplamını bulup return ederek yazdırınız. (x dahil olacak)
    // 2. YOL FOR LOOP
    public static int birdenXeKadarTekSayilarToplamLoop(int x) {
        int sonuc = 0;
        for (int i = 0; i<x+1; i++) {
            if (i%2==1) {
                sonuc += i;
            }
        }
        return sonuc;
    }

// ITERATE() *******************************************************************************************
    // SORU 3: 1'den sonsuza kadar giden Tek sayılardan,
    // ilk x tanesini toplayınız sonucu return ederek yazdırınız
    public static int birdenSonsuzaKadarTekSayilardanXTanesininToplami(int burayaKadarkiSayilariTopla){
        int sonuc = IntStream.
                iterate(1,t->t+2).
                limit(burayaKadarkiSayilariTopla).
                sum();
        return sonuc;
    }
    // SORU 4: 2'den sonsuza kadar giden Çift sayılardan,
    // ilk x tanesini toplayınız sonucu return ederek yazdırınız
    public static int ikidenSonsuzaKadarCiftSayilardanXTanesininToplami(int burayaKadarkiSayilariTopla){
        int sonuc = IntStream.
                iterate(2,t->t+2).
                limit(burayaKadarkiSayilariTopla).
                sum();
        return sonuc;
    }
    // SORU 5: 5'den sonsuza kadar giden kuvvetlerinden
    // ilk x kuvvetinin toplamını return ederek yazdırınız
    public static int bestenSonsuzaKadarGidenKuvvetlerindenXKuvvetineKadarToplam(int burayaKadarkiKuvvetleriTopla){
        int sonuc = IntStream.iterate(5,t->t*5).limit(burayaKadarkiKuvvetleriTopla).sum();
        return sonuc;
    }
    // Soru 6: x sayisinin faktoriyelini hesaplayan methodu yaziniz.
    public static int getFactorial(int x){
        int sonuc = IntStream.rangeClosed(1,x).reduce(1,(t,u)->t*u);
        return sonuc;
    }

}

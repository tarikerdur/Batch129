package my_practices.advanced_practice.practice03;

import java.util.Scanner;

public class Q03_DoWhile_TahminOyunu {
    //       0 ile 100 arasında rastgele numara tahmini yapan bir kod yazın.
    //İpucu: Girdiğiniz numara rastgeleSayi'dan küçükse ==> Daha büyük bir numara giriniz.
    //       Girdiğiniz numara rastgeleSayi'dan büyükse ==> Daha küçük bir numara giriniz.
    //       Girdiğiniz numara rastgeleSayi'ya eşitse ==> Tebrikler!!! ? tahminde sayiyi buldunuz. Puaniniz: ?

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rastgeleSayi = (int) (Math.random() * 100);
        System.out.println("0-100 arasi (dahil) bir tam sayi giriniz");
        int sayi = 0;
        int sayac = 10;

        do {
            sayac--;
            sayi = input.nextInt();

            if (sayi < rastgeleSayi) {
                System.out.println((sayac) + " hakkiniz kaldi");
                System.out.println("Daha BUYUK bir sayi giriniz");
            } else if (sayi > rastgeleSayi) {
                System.out.println((sayac) + " hakkiniz kaldi");
                System.out.println("Daha KUCUK bir sayi giriniz");
            } else {
                System.out.println("TEBRIKLER!!!\n" +
                        (10 - sayac) + ". tahminde buldunuz.\n" +
                        "Puaniniz : " + (10 * (10 - sayac)) +
                        "\nRandom sayi : " + rastgeleSayi);
            }
            if (sayac == 0) {
                System.out.println("Hakkiniz bitti");
                // ODEV : Yeniden oynamak icin gereken kodu yaz.
                // random sayi yenilenecek tekrar loop basa sarilcak.
                // Hayir cikmak istiyorum derse oyun yenilenmesin.
                break;
            }

        } while (sayi != rastgeleSayi);


    }
}

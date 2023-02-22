package mini_project_bilet_rezervasyon;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BiletRezervasyon {
    /*
Project: mesafeye ve şartlara göre otobüs bileti fiyatı hesaplayan uygulama

     Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş)
     koltuk no  bilgilerini alın.

     Mesafe başına ücret 1 Lira / km olarak alın.(Gidiş-Dönüş için *2)

     Tekli Koltuk ücreti:Koltuk numarası 3 veya 3 ün katı ise bilet fiyatı %20 daha fazladır(1.2 Lira).

     İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki kuralları uygulayın ;

     Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.********
     Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.

   1- Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise son bilet fiyatı üzerinden %20 indirim uygulanır.
   2- Yaş indirimi:
     Kişi 12 yaşından küçükse son bilet fiyatı üzerinden %50 indirim uygulanır.
     Kişi 12-24 yaşları arasında ise son bilet fiyatı üzerinden %10 indirim uygulanır.
     Kişi 65 yaşından büyük ise son bilet fiyatı üzerinden %30 indirim uygulanır.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km = 0, yolculukTipi = 0, koltukNo = 0,age=0;
        double mesafeUcreti = 1;
        boolean check = true;

        while (check){
            System.out.println("Kac km gideceksiniz");
            km = input.nextInt();
            if (km>0){
                check = false;
            } else {
                System.out.println("Hatalı Veri Girdiniz !\nMesafe pozitif sayi olmalidir. Tekrar giris yapin");
                check = true;
            }
        }

        do {
            System.out.println("Yasinizi girin");
            age = input.nextInt();
            if (age>0){
                check = false;
            } else {
                System.out.println("Hatalı Veri Girdiniz !\nYas pozitif sayi olmalidir. Tekrar giris yapin");
                check = true;
            }
        } while (check);

        do {
            System.out.println("Yolculuk Tipini Secin (1-2)\n1.Tek Yon\n2.Gidis-Donus");
            yolculukTipi = input.nextInt();
            if (yolculukTipi==1 || yolculukTipi==2){
                check=false;
            } else {
                System.out.println("Hatalı Veri Girdiniz !\nYolculuk tipi 1 ya da 2 olarak secilmedi. Tekrar giris yapin");
                check=true;
            }
        } while (check);


        System.out.println("Koltuk numarasi secin");
        koltukNo = input.nextInt();


        switch (yolculukTipi) {
            case 1:
                mesafeUcreti = 1 * km;
                break;
            case 2:
                mesafeUcreti = 2 * km;
                break;
        }

        if (koltukNo % 3 == 0) {
            mesafeUcreti *= 1.2;
        }

        System.out.println("Brut Toplam Yolculuk Ucreti : " + mesafeUcreti);
        System.out.println("Gidis donus indirimi : " + yolculukTipIndirimi(yolculukTipi,mesafeUcreti));
        System.out.println("Yas indirimi : " + ageDiscount(mesafeUcreti,age));


    }
    static double yolculukTipIndirimi(int yolculukTipi, double mesafeUcreti){
        if (yolculukTipi==2){
            return mesafeUcreti *= 0.20;
        } else {
            return mesafeUcreti;
        }
    }
    static double ageDiscount(double mesafeUcreti , int age){
        if (age<12){
            return mesafeUcreti *= 0.50;
        } else if (age<24) {
            return mesafeUcreti *= 0.10;
        } else if (age<65) {
            return mesafeUcreti;
        } else {
            return mesafeUcreti *= 0.30;
        }
    }

}

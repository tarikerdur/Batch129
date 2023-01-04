package day03scanner;

public class Car {

    // Variable'lar (pasif) olusturalim
    public String model = "Corolla";
    public int fiyat = 20000;


    // Method'lar (aktif) olusturalim
    public void hareket (){ // Hareket etmesi (yani sadece aksiyon yaptiran seyler) yeni bir data uretmediginden void kullandik.
        System.out.println("Corolla hizli hareket eder..."); /* void kullaninca return kullanmamiza gerek yok.
                                                                Cunku return edilen bir sey yok. */
    }

    public void dur (){ // Durmasi (yani sadece aksiyon yaptiran seyler) yeni bir data uretmediginden void kullandik.
        System.out.println("Corolla guvenli bir sekilde durur..."); /* void kullaninca return kullanmamiza gerek yok.
                                                                       Cunku return edilen bir sey yok. */
    }

}

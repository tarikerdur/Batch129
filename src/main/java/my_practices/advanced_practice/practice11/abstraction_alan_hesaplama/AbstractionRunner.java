package my_practices.advanced_practice.practice11.abstraction_alan_hesaplama;

public class AbstractionRunner {
    //Dikdörtgen ve üçgenin alanlarını hesaplayan bir kod yazınız.(abstraction kullanın)
    public static void main(String[] args) {

        DikdortgenAlan DikdortgenAlan = new DikdortgenAlan();
        System.out.println(DikdortgenAlan.alanHesapla(5,4));
        System.out.println(DikdortgenAlan.alanHesapla(7,4));

        UcgenAlan ucgenAlan = new UcgenAlan();
        System.out.println(ucgenAlan.alanHesapla(6,2));
        System.out.println(ucgenAlan.alanHesapla(10,5));



    }

}

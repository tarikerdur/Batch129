package my_practices.advanced_practice.practice09.overriding;

public class Q02_Kredi { // Runner

    // Bir bankadan kredi alan müşterileri kredi türlerine göre objeler oluşturarak kaydeden bir kod yazınız.
    // Emekli: %12 standart faiz, işçi: %15 isçi oranı, Memur: %10 memur oranı

    public static void main(String[] args) {

        Emekli emekli = new Emekli();
        System.out.println("emekli.faizHesapla(100) = " + emekli.faizHesapla(100));

        Isci isci1 = new Isci();
        System.out.println("isci1.faizHesapla(100) = " + isci1.faizHesapla(100));

        Memur memur1 = new Memur();
        System.out.println("memur1.faizHesapla(100) = " + memur1.faizHesapla(100));

    }
}

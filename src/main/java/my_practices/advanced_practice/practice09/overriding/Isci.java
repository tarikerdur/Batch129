package my_practices.advanced_practice.practice09.overriding;

public class Isci extends Banka {
    @Override
    double faizHesapla(double alinacakKredi) {
        return alinacakKredi * 0.15;
    }
}

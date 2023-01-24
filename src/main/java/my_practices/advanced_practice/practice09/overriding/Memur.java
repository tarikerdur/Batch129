package my_practices.advanced_practice.practice09.overriding;

public class Memur extends Banka{
    @Override
    double faizHesapla(double alinacakKredi) {
        return alinacakKredi * 0.10;
    }
}

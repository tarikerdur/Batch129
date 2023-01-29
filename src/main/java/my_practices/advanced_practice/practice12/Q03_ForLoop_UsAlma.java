package my_practices.advanced_practice.practice12;

public class Q03_ForLoop_UsAlma {
    public static void main(String[] args) {
        //Bir sayının istenen kuvvetini hesaplayan bir method yazınız.


        System.out.println(kuvvetiniAl(0, -5));
    }
    static double kuvvetiniAl(double taban, int us ){

        double sonuc = 1;

        if (taban==0 && us==0){
            throw new ArithmeticException("Base and power are can not be zero at the same time");
        }

        if (us>= 0){
            for (int i = 0; i < us; i++) {
                sonuc *= taban;
            }
            return sonuc;
        } else {
            for (int i = 0; i < Math.abs(us); i++) {
                sonuc *= taban;
            }
            return 1/sonuc;
        }

    }
}

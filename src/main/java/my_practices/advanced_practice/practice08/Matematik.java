package my_practices.advanced_practice.practice08;

public class Matematik {

    double carpma(double... x){
        double sonuc = 1;
        for (double w:x){
            sonuc *=w;
        }
        return sonuc;
    }

    double karesiniAl(double x){
        return x*x;
    }


}

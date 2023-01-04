package day09incrementdecrementternaryswitch;

public class NestedTernary {
    public static void main(String[] args) {
        /*
        Verilen yilin Artik Yil (Leap Year) olup olmadigini kontrol eden kodu yazin.
        Leap Year ==> Yil 100'e bolunurse 400'e de bolunmelidir. ==> 1600, 100 ve 400'e bolunur. leap year.
                                                                 1800, 100 ve bolunur ama 400'e bolunmaz. not leap year.
                      Yil 100'e bolunmuyorsa 4'e bolunmelidir. ==> 2004 leap      2005 not leap
        */

        int year = 2005;
                        // kural  - soru isareti - kural - soru isareti   -  sonuc        -   kural   - soru isareti  -   sonuc
        String isLeap = (year % 100 == 0) ? (year % 400 == 0 ? "leap year" : "not leap year") : (year % 4 == 0 ? "leap year" : "not leap");
        System.out.println(isLeap);            // .........sonuc...................................................................
        // interviewlerde parantez koymazlar, dedi.
    }
}

package my_practices.ssgpassbyvalueoverloading;

public class C04_Overloading {
        /*
    3 tane carpim isimli method olusturalim 1. methdodda 2 tane int deger carpalim
    2. methodda 1 tane double 1 tane int deger carpalim
    3. methodda 2 tane double deger carpalim
        */
    public static void main(String[] args) {


        // sadece method signiture degistirerek ayni isimde farkli isler yapan methodlar urettik.
        carpim(10,15);
        carpim(2.1,25);
        carpim(2.0,4.0);



    }

    private static void carpim(double a,double b) {
        System.out.println(a*b);
    }
    private static void carpim(double a,int b) {
        System.out.println(a*b);
    }
    private static void carpim(int a,int b) {
        System.out.println(a*b);
    }
}

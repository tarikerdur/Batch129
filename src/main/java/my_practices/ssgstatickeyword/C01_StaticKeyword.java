package my_practices.ssgstatickeyword;

public class C01_StaticKeyword {
    /*
    soru 1) bir static birde non-static(instance) variable olusturun ve arasindaki farklari inceleyin
     */

    static int a;
    int b;

    public static void main(String[] args) {

        System.out.println("a : " + a); // static'i obj olusturmadan static bir method icinde kullanabiliyoriz.

        C01_StaticKeyword obj = new C01_StaticKeyword();
        System.out.println("obj.b : " + obj.b);

        obj.b = 12;
        a = 20;
        System.out.println("a : " + a);
        System.out.println("obj.a : " + obj.a);
        System.out.println("obj.b : " + obj.b);


        C01_StaticKeyword obj2 = new C01_StaticKeyword();
        obj2.b = 25;
        obj2.a = 15;

        System.out.println("obj.b = " + obj.b);
        System.out.println("obj.a = " + obj.a);
        System.out.println("obj2.b = " + obj2.b);


    }


}

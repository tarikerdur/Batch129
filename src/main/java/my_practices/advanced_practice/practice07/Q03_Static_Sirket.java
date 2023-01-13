package my_practices.advanced_practice.practice07;

public class Q03_Static_Sirket {
    public static void main(String[] args) {

        //Basit bir şirket bütçesi kodu yazınız.

        Sirket dep1 = new Sirket();
        dep1.kasadanButceyeParaAl(1000);
        dep1.paraKazan(5000);
        System.out.println("dep1.depButcesi = " + dep1.depButcesi);
        System.out.println("Sirket.kasa = " + Sirket.kasa);

        Sirket.kasadanParaHarca(2500);
        System.out.println("Sirket.kasa = " + Sirket.kasa);
        System.out.println("dep1.depButcesi = " + dep1.depButcesi);

        dep1.departmanHarcamasi(1000);
        System.out.println("dep1.depButcesi = " + dep1.depButcesi);
        System.out.println("Sirket.kasa = " + Sirket.kasa);


        Sirket dep2 = new Sirket();
        dep2.kasadanButceyeParaAl(1000);
        System.out.println("dep2.depButcesi = " + dep2.depButcesi);
        System.out.println("Sirket.kasa = " + Sirket.kasa);
        System.out.println("dep1.depButcesi = " + dep1.depButcesi);


    }


}

package my_practices.advanced_practice.practice07;

public class Sirket {

    static int kasa;

    int depButcesi;

    public void paraKazan(int kazanilanPara) {
        kasa += kazanilanPara;
        System.out.println(kazanilanPara + " lira kazanildi");
    }


    public void kasadanButceyeParaAl(int alinacakPara) {
        depButcesi += alinacakPara;
        kasa -= alinacakPara;
        System.out.println("Kasadan " + alinacakPara + " lira alindi");
    }


    public static void kasadanParaHarca(int harcanacakPara) {
        kasa -= harcanacakPara;
        System.out.println("Kasadan " + harcanacakPara + " lira harcandi");
    }

    public void departmanHarcamasi(int harcanacakPara) {
        depButcesi -= harcanacakPara;
        System.out.println("Departman Butcesinden " + harcanacakPara + " lira harcandi");
    }


}

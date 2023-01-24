package my_practices.oylesinecalismalar;

public class sdf implements Asd.I02, Asd.I03 {
    public static void main(String args[]){
        Asd.Test03 obj = new Asd.Test03();
        obj.cal(Asd.I03.x);
        System.out.println(obj.x);
        obj.cal(Asd.I02.x);
        System.out.println(obj.x);
    }

    @Override
    public void cal(int x) {

    }
}

package my_practices.oylesinecalismalar;
public class Asd {

    public interface I02{
        int x = 5;
        void cal(int x);
    }
    public interface I03 {
        int x = 6;
        void cal(int x);
    }
    public static class Test03 implements I02, I03 {
        int x;
        public void cal(int item){
            x = item * item;
        }

    }


}

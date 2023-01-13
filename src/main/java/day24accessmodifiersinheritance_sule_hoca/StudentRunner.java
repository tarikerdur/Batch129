package day24accessmodifiersinheritance_sule_hoca;

public class StudentRunner {


    public static void main(String[] args) {

        Student can = new Student();
        System.out.println(can.stdName);
        System.out.println(can.address);
        System.out.println(can.email);
        // System.out.println(can.tcNo); private oldugu icin
        // ayni package-farkli class'tan tcNo'ya ulasamiyoruz.




    }
}

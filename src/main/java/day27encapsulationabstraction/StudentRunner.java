package day27encapsulationabstraction;

public class StudentRunner {
    public static void main(String[] args) {

        Student myStd = new Student();

        System.out.println(myStd.getStdId()); // AC123
        System.out.println(myStd.getGpa());
        System.out.println(myStd.isPoor());

        myStd.setStdId("TH123");
        myStd.setGpa(4.0); // static olmadigi icin pass by value yapti orj deger degismedi
        myStd.setPoor(false);

        System.out.println(myStd.getGpa()); // 4.0




        Student yourStd = new Student();
        System.out.println(yourStd.getGpa()); // 3.99


    }
}

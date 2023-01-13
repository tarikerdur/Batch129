package day24accessmodifiersinheritance_sule_hoca;

public class Car extends Vehicle {

    public String renk;
    int km;



    public Car(){

    }

    public Car(String renk, int km){
        super("Car"); // super keywordu ilk satirda yer almali.
                           // Benim bir ust classimdaki methodu kullan dedik.
        this.renk = renk;
        this.km = km;
        System.out.println("Car Constructor");
    }


}

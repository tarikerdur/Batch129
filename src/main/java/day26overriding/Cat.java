package day26overriding;

public class Cat extends Mammal {

    public void meow() {
        System.out.println("Cats meow...");
    }

    @Override // "Override Annotation" : Provides the control of the Override rules by Java.
    public void eat() { // child'daki override edilmis eat() methoduna "Overriding Method" denir.
        System.out.println("Cats eat...");
    }

    @Override
    public void drink() {
        System.out.println("Cats drink...");
    }

    @Override
    public Cat create() {
        return new Cat(); // new Cat() ==> Cat olusturduk. Cat bir Animal oldugu icin
        // olusturdugumuz Cat'i Animal data type'ina koyabiliriz. Animal parent'tir cat child'dir.
        // Java kucuk datayi buyuk datanin icine autoboxing yapar.
    }

    @Override
    public int add(int a, int b) { // Overriding'de primitive data type varsa degistirilemez.
        // Cunku overriding edilen method aynisi ya da parenti degil.
        // primitiveler class degil ki nasil parent child iliskisi olsun.
        return a + b;
    }

    @Override
    public Integer multiply(int a, int b) {
        return a*b;
    }
}

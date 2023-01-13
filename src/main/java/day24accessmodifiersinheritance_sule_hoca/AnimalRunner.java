package day24accessmodifiersinheritance_sule_hoca;

import day23datetimestringbuilder.Monkey;

public class AnimalRunner {

    public static void main(String[] args) {
            /*
        Kendi classimizda method varsa oncelikle onu kullanin.
        eger orada yoksa parentinizdakini kullanin.
        o da yoksa object classtan kullanin.

        Asagida kendi classinda olmayan methodlari parent classindan kullandik.
        "extends" keyword Arapca "bin" gibi biseydir.
        "tarik bin hasan" ==> "hasan oglu tarik" gibi

        child class ==> Tarik
        parent class ==> Hasan

        "public class Tarik extends Hasan" seklinde yazariz.

        1) "Inheritance" sayesinde
            i) Code tekrarlarindan kurtuluruz
            ii) Code tamiri(maintenance) kolay olur
            iii) Child Class'lari daha atomic yapmis oluruz

        2) Bir Class'i baska bir Class'in Child Class'i yapmak icin
        "extends" keyword kullanilir. Ilk yazilan Class Child, ikinci
        yazilan Class parent olur Parent Class'a super Class da denir

        3) Child Class object'leri Parent Class'dan method ve variable'lari
        kullanabilirler.

        4) Parent Class object'leri Child Class'dan method ve variable'lari
        kullanamazlar.

        5) Object Class her Class'in parent'idir.
        Java da Object Class haric her Class'in parent'i vardir.
        Java'da parent'i olmayan tek Class Object Class dir.
            */


        Cat cat = new Cat();
        cat.eat();
        cat.drink();
        cat.breath();
        cat.meow();

        Dog dog = new Dog();
        dog.eat();
        dog.drink();
        dog.breath();
        dog.bark();

        Bird bird = new Bird();
        bird.eat();
        bird.drink();
        bird.breath();
        bird.tweet();

        Monkey monkey = new Monkey();
        monkey.eat(); // protected olunca child class ulasabildi.



    }


}

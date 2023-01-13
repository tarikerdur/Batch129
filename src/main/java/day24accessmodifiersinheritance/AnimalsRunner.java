package day24accessmodifiersinheritance;

import day23datetimestringbuilder.Snake;

public class AnimalsRunner {
    public static void main(String[] args) {

        Cat myCat = new Cat();
        myCat.meow();
        myCat.drink();
        myCat.eat();

        Snake yourSnake = new Snake();
        yourSnake.tiss(); // default tiss() farkli packagelarda inherit edilmedi.
        yourSnake.eat(); // protected eat() farkli packagelarda inherit edildi.
        // Eger Snake child degilse protected olana baska package'dan ulasamayiz.




    }
}

package day26overriding;

public class AnimalRunner {
    public static void main(String[] args) {

        Cat myCat = new Cat();
        myCat.eat(); // override yapip eat methodunu kedilere uyarlamazsak Animals eat yazar.
        // Override ettik Cats eat yazdi. Daha guzel ve duzenli oldu.
        // Override edilen methodlarin orjinalleri artik obje olusturulan classlar tarafindan kullanilamaz.
        // Ama diger classlar orjinal methodu kendi classlarinda override edilmedikleri surece kullanmaya devam eder.
        // @Override keywordune Annotation denir. "Override Annotation"i denir.
        myCat.drink();


    }
}

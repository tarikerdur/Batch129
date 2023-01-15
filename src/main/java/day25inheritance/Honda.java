package day25inheritance;

public class Honda extends Car {

    public int price = 10000;
    public void engine(){
        System.out.println("Honda engine");
    }
    public Honda(){
        super.engine();
        // this() ==> super'a gitme ayni classtaki baska bir constructor'i kullan demek icin this() yazdik.
        System.out.println("Honda 1");
    }

    //      super("Accord"); // parent'a git. parametresi String olan constructor'i kullan dedik. Yoksa parametresiz olani kullaniyor.
    //      2)  super(); ne ise yarar ?
    //          Note: "super()" parent'teki constractor'i calistirmaya yarar.
    //          "super()" keyword'unu parent'taki parametresi belli olan constractur'lar icin kesinlikle kullanılmalıdır.


    public Honda (String model, int year){
         // super classi parametresiz kullanmak istiyorsak super() yazmamiza gerek yok.
        // biz parametre belirtmedigimiz surece Java'da child-parent constructorlari arasinda gorunmez bir super() bulunuyor.
        // Ama koyarsak code daha okunakli olur.
        // Eger parametresi cons calistiracaksak super(parametre) kullanmak zorundayiz.
        System.out.println("Honda 2: " + model + " - " + year);
    }

}

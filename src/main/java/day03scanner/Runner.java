package day03scanner;

public class Runner {
    public static void main(String[] args) {

        /* Object nasil olusturulur?
        Java dilinde ===>   ClassName object = new ClassName();
        Turkce meali ===>   Class ismi + Object ismi + atama (=) operatoru + "new" keywordu + Constructor
        Obje olusturmanin amaci daha duzenli ve hizli hareket etmektir. Baska classlardan buraya cekip kullaniyoruz.
        Car classina aktif ve pasif ozellikleri yukledigimiz icin kalibimiz bu class olacak.
        Bu yuzden Car classini kullaniyoruz asagida. */

        Car myCar = new Car(); // Objemizin ismini myCar yaptik. "new" keywordu Java'da yoktan var ettirir.
        System.out.println(myCar.fiyat);
        System.out.println(myCar.model);
        myCar.hareket();
        myCar.dur();


        Student tomHanks = new Student();
        System.out.println(tomHanks.name);
        System.out.println(tomHanks.grade);
        System.out.println(tomHanks.address);
        tomHanks.study();
        tomHanks.feed();



    }
}

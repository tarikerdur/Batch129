package day22staticblocksconstructors;

public class Car {
    /*
        Constructor nedir ?

        Java'da Classlar objenin kaliplaridir.
        Class'lari obje haline getiren yaraticiya (kod blocklarina) "Constructor" denir.

        Malzeme var, kalip var, malzemeyi kalipa kim dokup kek yapacak ???
            CONSTRUCTOR yapacak.

        Java bize otomatik olarak bir constructor verir. buna default constructor denir.
        Car class'i olusturunca java bize otomatik olarak bir constructor uretti.
        Ama bu constructor invisible'dir. Gozle gorulmeyen otomatik olarak Java tarafindan verilen
        bu Constructor'lara "DEFAULT CONSTRUCTOR" denir.

        default constructor'lar "Class ismi(){}" seklindedir.
        mesela burada "Car(){}" seklindedir.

                    INTERVIEW SORUSU : Method ile Constructor'in farki var midir? Varsa nedir? diye sorarlar, dedi.
                        Cevap :
                    Method ile Constructor farkli yapilardir.
                    2 Temel fark vardir.
                        1) Methodlarda return type vardir ama constructorlarda return type yoktur.
                        2) Methodlarin ismi yaptiklari ise gore developerlar tarafindan belirlenir.
                           Constructorlarin ismi ise HER ZAMAN Class ismi ile ayni olmalidir.

        Ancak default olanlarda parantezlerin ici bos oldugundan
        biz kendimiz daha kullanisli constructor olusturmayi daha cok tercih ederiz dedi.

        Siz kendi constructor'inizi olusturdugunuzda Java
        default constructor'i siler.

        constructor'a access modifier eklemezsek default olur.
        Genelde piyasada public yapilir, dedi.

        Bir Class'da farkli parametreler kullanarak istedigimiz kadar constructor olusturabilirsiniz.

        Farkli constructor'lar sayesinde bir Class'tan farkli farkli objeler olusturabiliriz.
     */

    String make = "Honda";
    String model = "Accord";
    int year = 2023;
    boolean hybrid = true;


    Car(String make, String model, int year, boolean hybrid) {
        this.make = make; // this ==> bu class'taki "make"'i benim verdigim make yap dedim.
        this.model = model;
        this.year = year;
        this.hybrid = hybrid;
    }

    Car(String make , String model){
        this.make = make;
        this.model = model;
        if (year==2023){
            this.year = 0;
        }
        if (hybrid==true){
            this.hybrid = false;
        }
    }

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }
}

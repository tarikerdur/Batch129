package day27encapsulationabstraction;

public abstract class Courses { // abstract keyword
    // abstract class
                /*

                abstract methodlar, abstract classlarin icinde olmalidir.

                            ABSTRACT METHOD
                    abstract (ENG) == soyut (TR)
                    concrete (ENG) == somut (TR)
                Body'si olmayan methodlara "abstract method" denir.

                Bir method "parent class"ta "abstract method" ise;
            Her bir child Class abstract method'u "override" edip kullanmak zorundadir.
                Bir tane child override etmezse app hata verir.
                Bu yuzden her hangi bir fonksiyonu "Child Class" icin mecburi
            yapmak isterseniz o method'u "abstract" (body'siz) yapmalisiniz.






    1) Bazen method body'sini yazmak gerekme, bu durumlarda body'siz method olusturmak gerekir.
        Body'si olmayan method'lara "abstract method"lar denir.

    2) Abstract method'lar child class'lar tarafından "override" edilmek zorundadirlar. ******
       Abstract method 1 kere override edilse yeter.
       Yani child override ettiyse onun grand child'i override etmese de olur.
       Ama childlerin derecesi esit ise her child override etmelidir.

       Eger bir fonksiyonun child class'lar tarafindan kullanilmasini mecbur kilmak isterseniz. ***********
       o method'u abstract yapmak gerekir.   **************************************************************


    3) Bir method'un body'sini silmek o method'un abstract olmasi icin yeterli degildir.
       "acces modifier" ile "return type" arasine "abstract" keyword koymak gerekir.
    4) "abstract method"lar siradan class'larin icine yazilamazlar. "abstract method"larin icine yazildiklari classlar'da
    abstract olmak zorundadirlar.
    5) "abstract class"larda hem "abstract method"lar hem de "concrete method"lar kullanilabilir.

    6) "concrete class"lar, "abstract classlar"in child'i olabilir. ***************************
    "abstract methodlar"in override edilme zorunlulugu "concrete class"lar icindir. ***********
    "abstract class"larda "concrete method"lar olabilir. ****************************************
    Ama "concrete class"larda "abstract methodlar" olamaz. ****************************************

    7) concrete class'lar final oldugunda child class'a sahip olamazlar.
    Ama abstract classlar icin child class olmak zorundadir. yoksa nasil override yapilacak.
    Bu nedenle Java, abstract classlar'in final olmasina izin vermez.

    8) abstract methodlar private olamazlar. Cunku child classlar abstract methodlari kullanirlar.
    private yapinca kullanima kapali olur (encapsule).
    Bu nedenle Java, abstract methodlarin private olmasina musade etmez.

    9) "abstract method" lar "static" olamazlar. cunku static method'lar override edilemez,
    halbuki abstract method'lar override edilmek icin olusturulmustur.

    10) abstract classlardan obje olusturulamaz.



    abstract methodlar implement, (esasinda override ama teknik olarak implement denirse sasirmayin, dedi)
    concrete methodlar override, edilir

OOP Principals:
 i)Inheritance +
 ii)Polymorphism: Method Overloading + Method Overriding
 iii)Encapsulation -
 iv)Abstraction - Abstract Classes and Interfaces

                */

    public abstract void math(); // abstract (soyut) methodlar abstract class'larda olur o yuzden
    // class isminin yanina da abstract keywordu koyduk.

    public void art() { // concrete (somut) method oldu
        System.out.println("Painting...");
    }

    // final methodlar override edilemezler. Halbuki "abstract" methodlar override edilmek icin olusturulurlar.
    // Bu celiskidir. Bu yuzden Java abstract methodlarin final olmasina izin vermez.
    //public final abstract void science();

    Courses() { // constructori kendimiz yapsak da hata verir. obje uretemiyoruz.
    }

}

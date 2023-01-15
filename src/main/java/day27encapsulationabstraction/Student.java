package day27encapsulationabstraction;

public class Student { // Exceptions'lara baslicaz, dedi

        /*
        Biz bazen bir Class'in icindeki datalari saklamak isteriz. Mesela ogrencinin Student id'yi herkes bilmemeli degil mi?
    Arkadaslar kapsul seklinde ilaclar vardir. Bu kapsullere toz ilac koyarlar.
    Napmis oluyorlar ilaci o kapsulun icinde saklamis oluyoruz. Bu kapsulu Class gibi dusunun,

        Icindeki toz ilaci da variable olarak dusunun. Ben bu sekilde bir ilac uretirsem ilaci kapsulun icinde saklamis olurum.
    Buna kapsulleme, ingilizce "ENCAPSULATION" denir.
        Benim ilk aldigim offerda aldigim soru buydu :
        What is encapsulation could you please tell me? dedi. Ben de dedim ki "Data Hiding" dedim. Sorarlarsa boyle diyin
    offer alirsiniz :)) dedi.

        "private" access yaparak encapsulation yapmis oluruz. Kapsulun disindayken ilaci goremeyiz. Kapsulun icinden goruruz.
    Ayni mantikla Class'in icinde olursak "private" datayi goruruz. Ayni bu kapsulde oldugu gibi.

        Simdi size dicekler ki encapsulation nedir? Data Hiding, diyin. Data nasil saklanir?
    Access Modifier "private" yapariz, diyeceksiniz, dedi.

        Access modifier ne kadar dar olursa o kadar sade bir App olur.
    Mecbur kalmadikca public, protected access modifier kullanilmaz.



    OOP Pricipals:
        i)  Inheritance - (gorduk)
        ii) Polymorphism - Method Overloading (gorduk) + Method Overriding (gorduk)
       iii) Encapsulation - (gorduk)
        iv) Abstract - (gormedik)
        */

    private String stdId = "AC123";
    private double gpa = 3.99;
    private boolean poor = true;


    //Encapsulation faydalarindan biri de tek bir obje olusturup set methodu ile
    // istedigimiz objeye cevirebiliriz
    // Could we read the encapsulated data ?
    // Encapsulated data could be using by getter() - setter() methods.

            // getter
    public String getStdId() { // getter
        return stdId; // getter saklanmis datayi okumaya yarar.
        // bize stdId'yi return ediyor.
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isPoor() { // variable'in data type'i booleansa method ismi "is" ile baslar.
        return poor;
    }
                //Encapsulation yapilmis data'yi okuyabilir miyiz?
    //get method'lar(getter) encapsule edilmis(saklanmis) data'yi okumamiza yarar.
    //get method'lar(getter) piyasadaki uygulamada her zaman "public" olur.
    //get method'larin(getter) return type'i variable'in data type'i ile ayni olur.
    //get method'larin(getter) isimleri "get + variable name" seklinde olur.
    //get method'larin(getter) isimleri variable boolean ise "is + variable name" seklinde olur.
    //get method'lar(getter) parametre kullanmazlar.


    // getter ve setter'larin ikisine birden "JAVA BEANS" denir.


            // setter
    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setPoor(boolean poor) {
        this.poor = poor;
    }

                //Encapsulation yapilmis datalarin degeri degistirilebilir mi?
    //set method'lar (setter) encapsule edilmis datalarin degerlerini update etmemize ( degistirmemize) yarar.
    //set method'lar (setter) her zaman "public" olur.
    //set method'larin (setter) return type'i her zaman void olur.
    //set method'larin (setter) isimleri "set + variable name" seklinde olur.
    //set method'lar (setter) variable ile ayni data type' inda parametre kullanir.
}

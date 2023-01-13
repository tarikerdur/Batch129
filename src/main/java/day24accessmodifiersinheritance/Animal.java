package day24accessmodifiersinheritance;

public class Animal {
    /*
    inheritance (ENG) == miras (TR)

        INHERITANCE'IN FAYDALARI :
    1) Code standardında tekrar iyi değildir.
    2) Code değişime açık olmalıdır. Hatayı düzeltmek kolay olmalı.
    3) Gelişime update'e açık olmalıdır.
    4) Code atomic yapıda olmalı.

    Note 1 : "parent class" (super class) (Ortak ozellikleri icerir) - child class (sub class) (Class'a ozel ozellikleri icerir.)
    Note 2 : Bir parent class'a bağlı child class'ı belirtmek için "extends" keyword kullanırız.
    Note 3 : "public" method ve variablelarda child classlar tarafindan kullanilabilir.
             "child classlar tarafindan kullanilabilir" demek "inherit" edilebilir demektir.
    Note 4 : "protected" methodlar inherit edilebilir.
              Cunku protectedlar baska packagelara gidildiginde childlarda kullanilabilir.
              Kaldi ki biz su an ayni packagedayiz.
    Note 5 : "default" methodlar obje ile ayni package'de olduklari surece inherit edilebilirler.
              Ama "default" method ile objectin uretildigi class farkli package'larda ise inherit edilemezler.
    Note 6 : "private" methodlar inherit edilemezler.

    Note 7 : "Multiple Inheritance" Java tarafindan desteklenmez.
             Yani Java'da bir child'in sadece 1 parent'i olur.
             Ancak 1 parent'in birden fazla child'i olabilir.
    Note 8 : "Child ---> Parent ---> Grand Parent ---> Grand Grand Parent ---> ... ---> Object Class"'a kadar gider.
             seklinde ilerleyen inheritance'lara
             Multi Level Inheritance denir.
    Note 9 : Java'da "Object Class" tum Java Class'larinin ortak parentidir.
    Note 10 : Java'da "Object Class" haric tum Class'larin parent'i vardir.
    Note 11 : child'dan parent'a dogru giden iliskiye "IS-A Relationship"  (Mammal is a Animal)(true)
              parent'tan child'a dogru giden iliskiye "HAS-A Relationship" (Animal has a Mammal)(true) denir.
                                                                           (Animal is a Mammal dersek -false- olur)
    Note 12 : Java'da her Class'in bir tane default constructor'i vardir.
              Bu default constructor Class'in icinde gorunmez. Cunku default Constructor "Object Class" icindedir.
              Bizim Class'imiz default constructor'a ihtiyac duydugunda parent olan Object Class'a gider ve oradaki
              constructor'i kullanir.
              Child class, Object Class'i parent olarak secmek isterse "extends" yazmasina gerek yoktur.



    parent == super
    child == sub
    Insan dunyasinda child'i parent secer.
    Ama Java'da parent'i child secer.
    child class'in yanina "extends" + super class name yazilinca Java child-parent iliskisini anlar.


    */
    protected void eat() {
        System.out.println("Animals eat...");
    }

    public void drink() {
        System.out.println("Animals drink...");
    }

}
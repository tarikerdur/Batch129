package day26overriding;

        /*
            1)  Parent Class'taki method'u Child Class icinde ozellestirerek kullanmaya "Overriding" yapmak denir.
            2)  "Overriding"de methodun parantezine, methodun ismine dokunulmaz. Method'un body'si degistirilir.
            3)  @Override ==> "Override Annotation" : Provides the control of the Override rules by Java.

            4)  Overriding'de parent Class'taki methoda "Overridden Method" denir.
            5)  Child Class'taki methoda ise "Overriding Method" denir.

            6)  private methodlar Override edilemezler. default methodlar da farkli packagelardan Override edilemez.
            7)  Child Class'taki Override edilmis method(Overriding Method)'un
            access modifier'i Parent Class'taki Override edilmis method (Overridden Method)'un
            access modifier'indan dar olamaz.
            YANI CHILD, PARENT'TAN HER ZAMAN DAHA GENIS (ya da esit) OLMAK ZORUNDA.
            Overriden Method==>protected ise Overriding method ==> protected + public
            Overriden Method==>default ise Overriding method ==> default + protected + public
            Overriden Method==>private ise Overriding method ==> override olmaz ki acces modifier olsun. (bkz 6. kural)


            8)  Child Class'ta Override edilen method'un(Overriding Method) return typei methodu
            return ettigi data type'inin aynisi veya o data type'in parent'i olarak secilebilir.
            Olusturulan obje ile return type arasinda IS-A Relationship olmalidir.

            9)  Methodun return type'i primitive ise Overriding yaparken return type degistirilemez.
            Cunku return type primitive ya ayni olur veya parent'tan secilir. Ama primitiveler arasinda
            parent-child iliskisi olmadigindan parent'tan secmek mevzu bahis olamaz.
            O zaman tek secenek aynisi olmalidir. primitiveler class olmadigindan Overridden'a Object de yazamayiz.

            10) Method'un return type'i Wrapper Class ise Overriding yapilirken return type degistirilemez.
            Cunku return type ya ayni olur ya da parenttan secilir. Ama Java bir Wrapper Class'i dogerinin parenti
            yapmadigindan parent'tan secme ihtimali yoktur. Geriye sadece aynisi olma ihtimali kalir.
            Ama Wrapper Class'lar Class oldugu icin Overridden'a Object yazabiliriz.

            11) Method'un return type'i "void" ise Overriding yapilirken return type degistirilemez.

            12) final kelimesi onemli bir kelimedir.
            final variable'lar, method'lar ve Class'lar vardir.
            final keywordu 3 yerde kullanilir.
                1) variable'larda
                2) method'larda
                3) Class'larda

            final variable :
                1- Bir variable "final" ise mutlaka deger atanmalidir.
                2- ilk atanan value degistirilemez.

            final method :
                1- Bir method "final" ise methodun body'si degistirilemez. Bu yuzden final methodlar override yapilamaz.

            final Class :
                1- Bir Class "final" ise o Class'in child'i olamaz.

            13) final method'lar ve static method'lar "Override" edilemezler.   ************************************

            14) static olan methodlar herhangi bir child tarafindan degistirilemezler.
            static olan methodlar tum childlar icin ortak bir methoddur.
            degistirilemez. dolayisiyla override yapilamaz. ama overload yapilabilir.

            15) "Override" yapabilmek icin "Inheritance" sarttir. Baska bir ifadeyle parent-child iliskisi sarttir.

            16) Method Overloading "Compile Time Polymorphism"dir. Method Overriding "Run Time Polymorphism"dir.
            17) Method Overloading "static Polymorphism"dir. Method Overriding "dynamic Polymorphism"dir.


                    ---- POLYMORPHISM OZETLE SUDUR ----
                public int add(){ }
                public int add(int a){ }
                public int add(int a, int b){ } ----> Overloading

                public int multiply(){ a * b }
                public int multiply(){ (a + b) * a }
                public int multiply(){ (a * b) / 100 }  ----> Overriding




                OOP Pricipals:
        i)  Inheritance - (gorduk)
        ii) Polymorphism - Method Overloading (gorduk) + Method Overriding (gorduk)
       iii) Encapsulation - (gormedik)
        iv) Abstract - (gormedik)
        */


public class Animal {

    protected void eat() { // parent'taki override edilmis eat() methoduna "Overridden Method" denir.
        System.out.println("Animals eat...");
    }

    public void drink() {
        System.out.println("Animals drink...");
    }

    public Animal create() {
        return new Animal();
    }

    public int add(int a, int b) {
        return a + b;
    }

    public Integer multiply(int a, int b) {
        return a * b;
    }
}
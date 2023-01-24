package day25inheritance;

public class Vehicle {


    /*
    1)  Child Class'tan bir Object olusturdugumuzda Constructor'lar en usttteki
    parent Class'tan baslatilarak alta dogru calistirilir.
    En alttaki childdan obje olusturulursa birbirine parent bagi ile baglanan
    her classin Constructor'lari en dis parent'tan en kucuk child'a dogru olmak uzere sirayla calisir.
    2)  Child classtaki constructordan parent classtaki constructora gidebilmek icin "super()" kullanilir.
    3)  Parent classta birden fazla constructor varsa istenilen constructor "super()" ifadesinin parantezi icine yazilan
    parametreleri yardimi ile secilebilir.
    4)  Ayni class icindeki constructor'lari secmek icin "this()" kullanilir.
    5)  Ayni classta birden fazla constructor varsa istenilen constructor "this()" ifadesinin parantezi icine yazilan
    parametreleri yardimi ile secilebilir.
    5)  "super()" ifadesini yazmak istege baglidir. Yazmasaniz da Java sanki "super()" varmis gibi davranir.
    Ama kodunuzu daha okunur kilmak icin yazmaniz tavsiye edilir.
    6) "super()" ve "this()" ifadesi constructor icinde her zaman ilk satirda olmalidir.
    7)  Ayni constructor icinde "super()" ve "this()" sadece bir kez kullanilabilir. (Bkz. 6. Kural) (interview question)
    8)  Inheritance'da variable'lari ve method'lari cagirmak icin "this" veya "super" kullanilir. (interview question)
        "this" ayni class icindeki variable'lari ve method'lari cagirmak icin kullanilir.
        "super" parent class icindeki variable'lari ve method'lari cagirmak icin kullanilir.

    9)  Method cagirirken constructora bakilir.
        Methodu'i ararken belirtilen constructordan aramaya baslayip bulanan kadar super'a dogru gideriz.
    10) Variable cagirirken data type'a bakilir.
        Variable'i ararken data typedaki classtan aramaya baslayip bulanan kadar super'a dogru gideriz.

    11) Inheritance'da object kullanarak variable cagirirsaniz, object'nin data type'ini temsil eden
        Class'tan variable'i aramaya baslayiniz. O Class'ta yoksa parent'lara bakiniz.
    12) Inheritance'da object kullanarak method cagirirsaniz, object'nin constructor'ini temsil eden
        Class'tan method'u aramaya baslayiniz. O Class'ta yoksa parent'lara bakiniz.



        OOP Pricipals:
        i)  Inheritance - (gorduk)
        ii) Polymorphism - Method Overloading (gorduk) + Method Overriding (gormedik)
       iii) Encapsulation - (gormedik)
        iv) Abstraction - (gormedik)

        */

    public int price = 1200;

    public void engine(){
        System.out.println("Vehicle engine");
    }
    public Vehicle(){

        System.out.println("Vehicle 1");
    }


    public Vehicle (int price){
        System.out.println("Vehicle 2: " + price);
    }

}

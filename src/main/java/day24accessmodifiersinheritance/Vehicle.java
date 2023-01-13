package day24accessmodifiersinheritance;

public class Vehicle {

    public Vehicle(){
        System.out.println("Vehicle 1");
    }
        /*
        Child Class'tan bir Object olusturdugumuzda Constructor'lar en usttteki
    parent Class'tan baslatilarak alta dogru calistirilir.
        En alttaki childdan obje olusturulursa birbirine parent bagi ile baglanan
    her classin Constructor'lari en dis parent'tan en kucuk child'a dogru olmak uzere sirayla calisir.
        */

}

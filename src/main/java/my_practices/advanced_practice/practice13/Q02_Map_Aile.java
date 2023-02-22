package my_practices.advanced_practice.practice13;


public class Q02_Map_Aile {

    public static void main(String[] args) {

        //Ad-Soyad-Yaş ve kardeşler listesini tek bir Map içerisinde saklayan bir kod yazınız.

        Aile velet1 = new Aile("Tarik","Erdur",24,"Salim","Halid");
        System.out.println(velet1.getAileMap());

        Aile velet2 = new Aile("Veli","Han",15,"Mehmet","Hatice","Hasan","Huseyin");
        System.out.println(velet2.getAileMap());

        Aile velet3 = new Aile("Genghis","Khan",100,"Subutay","Tangut","Ogedai");
        System.out.println(velet3.getAileMap());

        System.out.println();

        System.out.println(velet1);
        System.out.println(velet2);
        System.out.println(velet3);

    }
}

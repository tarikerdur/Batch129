package day22staticblocksconstructors;

public class CarRunner {
    public static void main(String[] args) {

        Car c1 = new Car("BMW","M4",2023,false);
        Car c2 = new Car("Audi","R8",2022,true);
        Car c3 = new Car("Honda","Civic",1999,false);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

                /*
        Runner class'ta olusturulan objeleri yazdirmak icin objesini olusturdugumuz classta
            toString() methodu olusturmamiz lazim.
            Class'a gidip sag tik yapip "Generate"ye tikla. sonra "toString()"'e tikla.
            Sonra istedigin senaryoyu secip "ok"'a bas


            Piyasada constructor elle yazilmaz intellij'den yardim alinir, dedi.
            Class'a gidip sag tik yapip "Generate"ye tikla. sonra "Constructor"a tikla.
            Sonra istedigin senaryoyu secip "ok"'a bas
                */

        Car c4 = new Car("Mercedes","C300");
        System.out.println(c4);

    }
}

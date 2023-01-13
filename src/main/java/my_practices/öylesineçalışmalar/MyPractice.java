package my_practices.öylesineçalışmalar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyPractice {

    public static void main(String[] args) {
        /*
            Rastgele kullanici adi olusturan JAVA kodu yaziniz.
               1. Kullanicidan ismini isteyelim
               2. Kullanici adindaki bastaki ve sondaki bosluklari silelim.
               3. Kullanici adinin alinabilir olup olmadigina bakalim.
               4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
               5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim ve gosterelim.
        */
        List<String> databaseIsim = new ArrayList();
        databaseIsim.add("FATIH");
        databaseIsim.add("YAVUZ");
        databaseIsim.add("HALID");
        databaseIsim.add("SALIM");
        databaseIsim.add("NEFISE");
        databaseIsim.add("TARIK");
        databaseIsim.add("OKTAY");

        Scanner input = new Scanner(System.in);
        String name = "";
        int rnd = 0;
        System.out.println("Isminizi girin\n" +
                "Cikmak icin 'Q'ya basin");
        do {
            name = input.nextLine().trim().toUpperCase();
            if (name.equalsIgnoreCase("q")) {
                break;
            } else {
                boolean check = name.replaceAll("[a-zA-Z]", "").isEmpty(); // if it returns true that mean "name" is acceptable.
                if (!check) {
                    System.out.println("Lutfen gecerli bir isim giriniz");
                } else {
                    if (!databaseIsim.contains(name)) {
                        databaseIsim.add(name);
                    } else {
                        rnd = (int) (Math.random() * 100);
                        databaseIsim.add(name + rnd);
                    }
                }
            }
        } while (true);

        System.out.println(databaseIsim);



    }
}


package day19listsvarargs;

import java.util.*;

public class Lists02 {
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
        databaseIsim.add("AYSE");
        databaseIsim.add("AHMET");
        databaseIsim.add("SERDAR");
        databaseIsim.add("OKAN");
        databaseIsim.add("BETUL");

        Scanner input = new Scanner(System.in);
        System.out.println("Kullanici adinizi giriniz");
        String userName = input.nextLine().trim().toUpperCase();

// 1. YOL : Random tam sayi bulmak icin
        int random = (int) (Math.random() * 100);
// 2. YOL : Random tam sayi bulmak icin
        int random2 = new Random().nextInt(100); // bound (ENG) == sinir (TR)  100'e kadar random sayi al dedik
                    // Random classindan obje olusturduk.
        while (databaseIsim.contains(userName + random)){ // eger okan15 varsa tekrar random sayi uret diyoruz.
            random = (int) (Math.random() * 100); // okan15 varsa tekrar random uretip
                                                    // randomlu isim bulunmayana kadar loop calisacak
        }

        if (databaseIsim.contains(userName)) {
            System.out.println("Bu username database'de var. Tekrar kullanilamaz.\n" +
                    "Sonuna sayi ekleyip listeye ekledik.");
            databaseIsim.add(userName + random);
        } else {
            databaseIsim.add(userName);
            System.out.println("Girdiginiz kullanici ismi data base'de bulunmamaktadir.\n" +
                    "Kullanici adiniz database'imize eklenmistir.\n" +
                    "Girilen isim : " + userName + "\n" +
                    "Index numarasi : " + databaseIsim.indexOf(userName));
        }
        System.out.println("Duz siralama\t\t: " + databaseIsim);
        databaseIsim.sort(Comparator.naturalOrder());
        System.out.println("Alfabetik siralama\t: " + databaseIsim);


    }
}

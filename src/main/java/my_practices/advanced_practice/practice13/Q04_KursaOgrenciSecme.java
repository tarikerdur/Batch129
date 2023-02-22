package my_practices.advanced_practice.practice13;

import java.util.*;

public class Q04_KursaOgrenciSecme {
    /*
    Spor kursu için seçilecek öğrencileri belirleyen bir kod yazınız.
    kurs gereklilikleri:
        erkekler: boy: 1.60 ve üstü
                  kilo:70-90 kg
        kızlar: boy: 1.50 ve üstü
                kilo:50-70 kg
    kullanıcıdan öğrenci sayısı ve herbir öğrenci
    için isim , cinsiyet, kilo ve boy bilgilerini girmesini
    isteyiniz.
    */
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Ogrenci sayisi gir");
        int stdCount = scan.nextInt();

        String[] nameArr = new String[stdCount];
        String[] genderArr = new String[stdCount];
        double[] weightArr = new double[stdCount]; // kilo
        double[] heightArr = new double[stdCount]; // boy
        int count = 0;

        for (int i = 0; i < stdCount; i++) {
            scan.nextLine(); // dummy
            System.out.println((i + 1) + ". ismi gir");
            nameArr[i] = scan.nextLine();
            System.out.println("Cinsiyet gir ('E' veya 'K')");
            String gender = scan.next().toLowerCase().trim().replaceAll("[^a-z]", "");
            if (gender.equals("e") || gender.equals("k")) {
                genderArr[i] = gender;
            } else {
                System.out.println("Gecerli cinsiyet girmedin. Tekrar gir");
                i--;
                continue;
            }
            System.out.println("Kilo gir");
            weightArr[i] = scan.nextDouble();
            System.out.println("Boy gir");
            heightArr[i] = scan.nextDouble();
        }
        System.out.println(Arrays.toString(nameArr));
        System.out.println(Arrays.toString(genderArr));
        System.out.println(Arrays.toString(weightArr));
        System.out.println(Arrays.toString(heightArr));

        System.out.println("\t\t*** Kursa secilen ogrenciler ***");
        for (int i = 0; i < stdCount; i++) {
            if ((genderArr[i].equals("k") || genderArr[i].startsWith("k")) && (weightArr[i] >= 50 && weightArr[i] <= 70) && heightArr[i] >= 1.50) {
                System.out.println("\t" + nameArr[i]);
                count++;
            } else if ((genderArr[i].equals("e") || genderArr[i].startsWith("e")) && (weightArr[i] >= 70 && weightArr[i] <= 90) && heightArr[i] >= 1.60) {
                System.out.println("\t" + nameArr[i]);
                count++;
            }
        }

        if (count==0){
            System.out.println("Kursa secilen ogrenci yoktur.");
        } else {
            System.out.println("Kursa secilen ogrenci sayisi " + count + " tanedir.");
        }

    }
}

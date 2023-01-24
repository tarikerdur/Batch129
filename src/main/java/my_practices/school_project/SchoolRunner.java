package my_practices.school_project;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class SchoolRunner {

    public static void main(String[] args) {

        Students std1 = new Students();
        Teachers teachers = new Teachers();

        Scanner input = new Scanner(System.in);

        System.out.println(std1.SchoolName + "'a hosgeldiniz");

        boolean whileController = true;

        label:
        do {
            System.out.println(std1.yonetimPaneli);
            System.out.println("Lutfen yapmak istediginiz islemi giriniz");
            String secim = input.next().toLowerCase().trim();
            String teacherSecim;
            switch (secim) {
                case "q":
                    break;
                case "1":
                    std1.islemler();
                    std1.ekleme();
                    break;
                case "2":
                    teachers.islemler();
                    System.out.println("Yapmak istediginiz islemi seciniz");
                    teacherSecim = input.next().toLowerCase();
                    switch (teacherSecim.toLowerCase()) {
                        case "1":
                            teachers.ekleme();
                            break;
                        case "2":
                            teachers.arama();
                            break;
                        case "3":
                            teachers.listeleme();
                            break;
                        case "4":
                            teachers.silme();
                            break;
                        case "5":
                            break;
                        case "q":
                            break;
                        default:
                            System.out.println("Gecersiz tuslama yaptiniz basa donduruluyorsunuz");
                            continue;
                    }
                default:
                    System.out.println("Gecersiz tuslama yaptiniz en basa donduruluyorsunuz.");
                    continue;
            }

        } while (whileController);


    }


}

package my_practices.advanced_practice.practice10.school;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SchoolMain {
        /*
         1- Değişkenleri ad, soyad, yaş olan bir Ogrenci pojo class'ı oluşturunuz.
         2- Değişkenleri okulAd, maxOgrenciSayisi, ArrayList cinsinden Öğrencileri olan bir Okul pojo class oluşturunuz
         3- Main metodunun olduğu OkulMain isimli bir class oluşturunuz.

         4- Bir okul objesi oluşturup, bu okula max öğrenci miktarına ulaşana kadar öğrenci ekleyiniz.
         Fakat oluşturacağınız öğrencilerin yaşı 15'i geçmemeli, 8'den küçük olmamalı.
         Bu yaşı geçen bir öğrenci eklenmek istenir ise yerine başka öğrenci isteyiniz.
     */

    public static void main(String[] args) {

//        Student std1 = new Student("Ali","Can",12);
//        std1.setName("Sally");
//        Student std2 = new Student("Veli","Bek",20);
//
//
//        List<Student> stdList = new ArrayList<>();
//        //Her class bir data type'idir ama her data type'i bir class degildir.
//        //Ogrenci class'indan bir List olusturuldugundan data type'ina onu yazdik
//        stdList.add(std1);
//        stdList.add(std2);
//                      (ornek olsun diye bunu yazdik comment icinde kalsin)

        Scanner input = new Scanner(System.in);
        School school = new School();

        System.out.println("Enter the school name");
        school.setOkulAd(input.nextLine());

        System.out.println("Enter the max student number");
        school.setMaxOgrenciSayisi(input.nextInt());

        List<Student> stdList = new ArrayList<>();
        for (int i = 0; i < school.getMaxOgrenciSayisi(); i++) {
            Student student = new Student();
            System.out.println((i + 1) + ". Student ad: ");
            student.setName(input.next());

            System.out.println((i + 1) + ". Student soyad: ");
            student.setSurname(input.next());

            System.out.println((i + 1) + ". Student yas: ");

            try {
                student.setAge(input.nextInt());
                if (student.getAge()>15 || student.getAge() < 8){
                    throw new ArithmeticException("Student age can not greater than 15 and less than 8...");
                }
            } catch (ArithmeticException e){
                System.out.println(e.getMessage());
                i--;
                continue;
            } catch (Exception e){
                System.out.println("Must use digit...");
                i--;
                continue;
            }
            school.addOgrenciToList(student);

        }
        System.out.println(school);

    }

}

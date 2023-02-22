package my_practices.oylesinecalismalar;

import java.util.*;

public class ArthurHellas {
    static HashMap<String, String> person = new HashMap<>();
    static Scanner sc = new Scanner(System.in);
	              /*
                     1) Kullanicidan kimlik numarasini(4 haneli), tam ismini, adresini, telefonunu, alin
                     2) Kimlik numarasini key olarak, diger bilgileri value olarak bir map'e depolayin

                     saveInfo() method olusturun:
                     3)Kullanicidan bircok kimlik numarasi(4 haneli), isim, adres ve telefon alin.
                     4)Kimlik numarasini key olarak, diger bilgileri value olarak bir map'e depolayin.
                     5)Ayni kimlik numarasi ile bilgi girilmesine engel olun.

                	 getInfo() method olusturun:
          		     1)Kimlik numarasini girerek kullanicinin bilgilerine ulasin.
                     2)Olmayan kimlik numarasi girilirse kullaniciya hata mesaji verin.

                     removeInfo() method olusturun:
                     1)Kimlik numarasini girerek data silin.
                     2)Girilen kimlik numarasi yoksa kullaniciya hata mesaji verin.
                     3)Collection bos ise kullaniciya hata mesaji verin.

                     selectOption() method olusturun:
                     1)Yukaridaki 3 methodu programi sonlandirana kadar secme hakki verin
               */

    public static void main(String[] args) {

        selectOption();

    }

    private static void selectOption() {
        System.out.println("yapmak istediginiz islemi giriniz :\n0:islemi sonlandir\n" +
                "1:kullanici ekle\n2:kullanici bilgisi alma\n3:kullanici silme");
        int secim = sc.nextInt();//nextLine hata verir.çünkü bir üst satır println değil print olduğu için tum satırı alır.
        switch (secim) {
            case 0:
                cikis();
                break;
            case 1:
                saveInfo();
                break;
            case 2:
                getInfo();
                break;
            case 3:
                removeInfo();
                break;
            default:
                System.out.println("yanlis giris yaptiniz. Tekrar deneyiniz");
                selectOption();
                break;
        }
    }

    private static void cikis() {
        System.out.println("cikis isleminiz yapildi. haydi selametle....");
    }

    private static void removeInfo() {
        System.out.print("silinecek tc yi giriniz :");
        String silinecekTc = sc.next();//nextLine hata verir.çünkü bir üst satır println değil print olduğu için tum satırı alır.
        if (person.containsKey(silinecekTc)) {//1. adım
            person.remove(silinecekTc);
            System.out.println("girilen tc gayet basarili silindi"+person);//silinecekTc nin tüm bilgilerini person map'inden getirdik.(map.get(key);tüm değerleri value getirir.)

        } else {System.out.println("aradiginiz tc sahip sahis yoktur.\n tekrar deneyin");//2. adım
            removeInfo();}//kullanıcı, silinenTc ye sahip şahıs olmadığı  için tekrar tc girişi için
        selectOption();
    }

    private static void getInfo() {
        System.out.print("aradiginiz tc yi giriniz :");
        String arananTc = sc.next();//nextLine hata verir.çünkü bir üst satır println değil print olduğu için tum satırı alır.
        if (person.containsKey(arananTc)) {
            System.out.println(person.get(arananTc));//aranaTc nin tüm bilgilerini person mmap'inden getirdik.(map.get(key);tüm değerleri value getirir.)
        } else {System.out.println("aradiginiz tc sahip sahis yoktur.\n tekrar deneyin");
            getInfo();}//kullanıcı, arananTc ye sahip şahıs olmadığı  için tekrar tc girişi için //kullanıcı var olan tc girdiği için tekrar tc girişi için saveInfo() metoda geri gönderdik. metoda geri gönderdik.
        selectOption();
    }



    private static void saveInfo() {

        System.out.print("4 haneli tc nizi girin : ");
        String tc = sc.next();//nextLine hata verir.çünkü bir üst satır println değil print olduğu için tum satırı alır.
        sc.nextLine();//arda arda scan.nextline çalışınca hata vermemesi için boş bir sc.nextLine(); atadık .

        if (person.containsKey(tc)) {
            System.out.println("var olan bir tc girdiniz tekrar deneyiniz...");
            saveInfo();//kullanıcı var olan tc girdiği için tekrar tc girişi için saveInfo() metoda geri gönderdik.
        } else {
            System.out.print("adinizi giriniz: ");
            String name = sc.nextLine();

            System.out.print("soyadinizi giriniz: ");
            String surName = sc.nextLine();

            System.out.print("adres giriniz: ");
            String adress = sc.nextLine();

            System.out.print("tel  giriniz: ");
            String phone = sc.nextLine();

            String values = name + " " + surName + " " + adress + " " + phone;//tc haric verileri bir stringe atadık
            person.put(tc, values);//person map'ine tc key olarak diğer bilgiler (name surname...) value olarak eklendi.
            System.out.println("verilerinizi dogru sekilde girdiniz tebrikler verileriniz kaydedildi. verileriniz : "+person);
            System.out.println("     *****    ");
            selectOption();
        }

    }
}

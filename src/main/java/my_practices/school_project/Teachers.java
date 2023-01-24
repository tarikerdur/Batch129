package my_practices.school_project;

import java.util.ArrayList;
import java.util.Scanner;

public class Teachers extends School {
Scanner input = new Scanner(System.in);
    ArrayList<String> teacherList = new ArrayList<>();

    private String ad;
    private String soyad;
    private String TCKN;
    private byte age;
    protected String bolum;
    protected String sicil;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getTCKN() {
        return TCKN;
    }

    public void setTCKN(String TCKN) {
        this.TCKN = TCKN;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    @Override
    void islemler() {
        String islemler = "\t============= İŞLEMLER =============\n" +
                "\t\t 1- OGRETMEN EKLEME\t\t\t \n" +
                "\t\t 2- OGRETMEN ARAMA\n" +
                "\t\t 3- OGRETMEN LİSTELEME\n" +
                "\t\t 4- OGRETMEN SİLME\n" +
                "\t\t 5- ANA MENÜ\n" +
                "\t\t Q- ÇIKIŞ\n" +
                "\t\t\n" +
                "\tSEÇİMİNİZ:\n";
        System.out.println(islemler);
    }

    @Override
    void ekleme() {
        System.out.println("Eklenecek ogretmenin ad, soyad, TCKN, yas, bolum" +
                " sicilini girin");

        this.setAd(input.nextLine());
        this.setSoyad(input.nextLine());
        this.setTCKN(input.next());
        this.setAge(input.nextByte());
        this.bolum = input.next();
        this.sicil = input.next();
        teacherList.add(getAd() + " " +  getSoyad() + " " + getTCKN() + " " +
                getAge() + " " + bolum + " " + sicil);
    }

    @Override
    void arama() {
        System.out.println("Isme gore arama yapilacaktir");
        System.out.println(teacherList.contains(getAd()));
    }

    @Override
    void listeleme() {
        System.out.println(teacherList);
    }

    @Override
    void silme() {
        System.out.println("TCKN'ye gore silme yapilacaktir");
        teacherList.set(teacherList.indexOf(getTCKN()),"");
    }
}

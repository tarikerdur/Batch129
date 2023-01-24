package my_practices.school_project;

import java.util.ArrayList;

public class Students extends School {
    ArrayList<String> stdList = new ArrayList<>();
    private String ad;
    private String soyad;
    private String TCKN;
    private byte age;

    protected int stdNum;
    protected int stdGrade;

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
                "\t\t 1- OGRENCI EKLEME\t\t\t \n" +
                "\t\t 2- OGRENCI ARAMA\n" +
                "\t\t 3- OGRENCI LİSTELEME\n" +
                "\t\t 4- OGRENCI SİLME\n" +
                "\t\t 5- ANA MENÜ\n" +
                "\t\t Q- ÇIKIŞ\n" +
                "\t\t\n" +
                "\tSEÇİMİNİZ:\n";
        System.out.println(islemler);
    }

    @Override
    void ekleme() {

    }

    @Override
    void arama() {

    }

    @Override
    void listeleme() {

    }

    @Override
    void silme() {

    }
}

package my_practices.school_project;

public abstract class School {

    final String SchoolName = "TAOL";

    final String yonetimPaneli = "\t====================================\n" +
            "\t ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
            "\t====================================\n" +
            "\t 1- ÖĞRENCİ İŞLEMLERİ\n" +
            "\t 2- ÖĞRETMEN İŞLEMLERİ\n" +
            "\t Q- ÇIKIŞ\n";

    abstract void islemler();
    abstract void ekleme();
    abstract void arama();
    abstract void listeleme();
    abstract void silme();


}

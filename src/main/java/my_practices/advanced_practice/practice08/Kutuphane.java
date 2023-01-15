package my_practices.advanced_practice.practice08;

public class Kutuphane {

    String kitapAdi;
    String yazarAdi;
    int sayfaSayisi;
    String seriNumarasi;
    static int kitapSayisi;

    public Kutuphane(String kitapAdi, String yazarAdi, int sayfaSayisi) {
        kitapSayisi++;
        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.sayfaSayisi = sayfaSayisi;
        seriNumarasi = kitapAdi.substring(0,2) + yazarAdi.substring(0,2) + kitapSayisi;
        kitapBilgileri();
    }
    public void kitapBilgileri(){
        System.out.println("\nKitap Adi\t\t: " + kitapAdi +
                "\nYazar Adi\t\t: " + yazarAdi +
                "\nSayfa Sayisi\t: " + sayfaSayisi +
                "\nSeri Numarasi\t: " + seriNumarasi +
                "\nKitap Sayisi\t: " + kitapSayisi);
    }
}

package day26overriding;

public class Student { // Exceptions'lara baslicaz, dedi

        /*
        Biz bazen bir Class'in icindeki datalari saklamak isteriz. Mesela ogrencinin Student id'yi herkes bilmemeli degil mi?
    Arkadaslar kapsul seklinde ilaclar vardir. Bu kapsullere toz ilac koyarlar.
    Napmis oluyorlar ilaci o kapsulun icinde saklamis oluyoruz. Bu kapsulu Class gibi dusunun,
    Icindeki toz ilaci da variable olarak dusunun. Ben bu sekilde bir ilac uretirsem ilaci kapsulun icinde saklamis olurum.
    Buna kapsulleme, ingilizce "ENCAPSULATION" denir. Benim ilk aldigim offerda aldigim soru buydu.
    What is encapsulation could you please tell me? dedi. Ben de dedim ki "Data Hiding" dedim. Sorarlarsa boyle diyin
    offer alirsiniz :)) dedi.
        "private" access yaparak encapsulation yapmis oluruz. Kapsulun disindayken ilaci goremeyiz. Kapsulun icinden goruruz.
    Ayni mantikla Class'in icinde olursak "private" datayi goruruz. Ayni bu kapsulde oldugu gibi.
    Simdi size dicekler ki encapsulation nedir? Data Hiding, diyin. Data nasil saklanir?
    Access Modifier "private" yapariz, diyeceksiniz, dedi.

        Access modifier ne kadar dar olursa o kadar sade bir App olur.
    Mecbur kalmadikca public, protected access modifier kullanilmaz.
        */

    private String stdId = "AC123";


}

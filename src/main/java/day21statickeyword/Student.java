package day21statickeyword;

public class Student { // Projelerde genelde sadece runner classta main method olur, dedi.

        /*
        STATIC'I INTERVIEWLERDE SORARLAR DEDI.


            classin icinde aktifler ve pasifler olur. Yani ;
            "class members = variables + methods" diyebiliriz.

                class variable              == static variable
                instance / object variable  == non-static variable

            instance (ENG) ==> gorunum (TR)



            1) "static" variable veya static method'lar (class member) tum objeler icin ortak elemandir.
            2) "static" class members uzerinde yapilan tum degisiklikler tum objeleri etkiler.
            3) "static" class members class'a, non-static class members object'lere monte edilir.
                    Mesela; bir class'tan 100 tane object olusturdugumuzda non-static olanlar 100 kere olusturulur.
                    Ama static olanlar object sayisindan bagimsiz olarak 1 kere olusturulur.
            4) "static" class memberlara ulasmak icin object olusturmaya gerek duyulmaz.
                    Ama non-static class memberlara ulasmak icin object olusturmak sarttir.
            5) "static" variablelarin diger adi "class variable"dir.
            6) "non-static" variablelarin diger adi "instance variable" veya "object variable"dir.



            Static variable'lara sadece classin ismi kullanilarak da ulasilabilir.
            Static olmayan variable'lara ulasabilmek icin object olusturmak zorundayiz.
            Static variable'larin diger adi class variable'dir. Instance variable'larin diger adi object variable'dir.
            Static variable'lar object'lerin ortak kullanimina aciktir fakat instance variable'lar degildir.
        */

    public static String stdName = "Tom Hanks"; /*
    Bu kodu yazinca memoryde bir alan olusturduk alanin ismi stdName ve degeri Tom Hanks oldu.
    Ve her yerden ulasilabilen static bir variable oldu
        */
    public int age = 13; // bu static degil.

    // Ogrenci isimlerinin ilk harfini veren method olustur
    public static String getInitials(String name) {
        String first = name.substring(0, 1);
        String second = name.split(" ")[1].substring(0, 1);
        return first + second;
    }

    // Ogrenci ismindeki sesli harfleri sayan method olustur - [a e i o u A E I O U]
    public int countVowels(String name) {
        int counter = 0;
        for (int i = 0; i < name.length(); i++) {
            char ch = name.toLowerCase().charAt(i);
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    counter++;
                    break;
            }
        }
        return counter;
    }
}

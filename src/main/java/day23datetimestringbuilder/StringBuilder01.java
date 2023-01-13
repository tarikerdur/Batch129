package day23datetimestringbuilder;

public class StringBuilder01 {

    public static void main(String[] args) {
        /*
        Java'da String, "String Class" kullanilarak veya "StringBuilder" Class kullanilarak olusturulabilir.
            Farki ne ?
        "String Class" kullanarak uretilen String'ler "immutable"dir.
        "StringBuilder" kullanarak uretilen String'ler "mutable"dir.
                mutable ==== degistirilebilir.
                immutable == degistirilemez

                "mutable" olmak assign yapilmasa bile datayi degistirmek demektir.
                "immutable"larda assign yapilmazsa degisiklik kalici olmaz.

            "immutable"larda atama yapilmadan degisiklik yapilirsa Java'da yeni bir container acilir
        ve degisiklik oraya assign edilir. orjinali degismemis olur. Olusturulan her yeni container icin
        stack memoryde reference olusturulur. Bu immutable olmaktir. Bu sekilde calisir.

        *** immutable'i pass by value ile karistirmayin. pass by value methodlarla ilgilidir, dedi. ***

            "mutable"da yapilan degisikliklerde assign yapilmadan orjinal value degisir.



            Var olan deger degismesin istiyorsaniz String kullanin.
            Var olan deger degisebilir habire yeni container olusmasin diyorsaniz StringBuilder kullanin.
            StringBuilder farkli bir Class oldugu icin kendine has methodlari vardir.
            Mesela String'te concat() kullanilirken StringBuilder'da append() kullaniriz.

            concat == birlestirmek
            append == eklemek
        */

        // "immutable"
        String s = "Java"; // String Class kullanirak String olusturduk. Stringler immutable'dir.
        String t = s+"!";
        String w = t+"?";

        // String'i degistirdikten sonra ayni String'e assign ederseniz, Java yine yeni bir container olusturur.
        // degismis degeri bu yeni container'in icine koyar ve eski container'i gosteren ok'u yeni container'a yonlendirir.
        // dolayisiyla eski container reference'siz kalir ve "Garbage Collector" reference'siz olan container'lari siler.
        String a = "Money";
        a = a + " More"; // burada var olan String degismedi. String'in referenci kirildi ve yeni
        // containerla reference kuruldu. Java'daki "garbage collector" reference'i kalmayan "Money" container'ini sildi.

        // "mutable"
        // 1. YOL : StringBuilder constructor'inin icine String'i yazarak String uretmek.
        StringBuilder sb1 = new StringBuilder("Python");
        System.out.println(sb1); // Python

        sb1.append("!");// String'lerdeki concat() gibi StringBuilder'larda da append() methodu vardir.
        // python'un yanina unlem koymak istersek icine yazariz. Ve var olan container assign yapilmadan degismis olur.

        sb1.append("?").append("."); // seklinde tekrarli olarak kullanilabilir.
        System.out.println(sb1); // Python!?.



        // 2. YOL : Constructor'in icini bos birakarak String uretmek. append'le String'i olusturuyoruz.
        StringBuilder sb2 = new StringBuilder();
        System.out.println(sb2.length()); // 0
        System.out.println(sb2.capacity()); // 16
        // kapasite = capacity     StringBuilder kullaninca Java default olarak String'e 16 char'lik kapasite tanimlar.
        sb2.append("Java");
        System.out.println(sb2.length()); // 4
        System.out.println(sb2.capacity()); // 16

        sb2.append("xxxxxxxxxxxxxxx");
        System.out.println(sb2.length()); // 19
        System.out.println(sb2.capacity()); // 34 ==> var olan capacity sayisinin 2 katinin 2 fazlasi olarak Java kapasiyeyi arttirdi.

        sb2.append("yyyyyyyyyyyyyyyy");
        System.out.println(sb2.length()); // 35
        System.out.println(sb2.capacity()); // 70 ==> var olan capacity sayisinin 2 katinin 2 fazlasi olarak Java kapasiyeyi arttirdi.



        // 3. YOL : StringBuilder constructor'inin icine capacity belirleyerek String uretmek.
        StringBuilder sb3 = new StringBuilder(2); // Eger icine int yazarsak capacity'i belirlemis oluruz.
        // Mesela ABD'deki eyalet kisaltmalarini yazmak istersek 2 char'lik capacity yeterli.
        // Memory saving yapariz.

        sb3.append("Flo");
        System.out.println(sb3.length()); // 3
        System.out.println(sb3.capacity()); // 6
        // Sinir asimi olunca belirledigimiz capacity'nin 2 katinin 2 fazlasini verir yani 6 oldu.

        sb3.insert(2,"XXXXXX"); // insert (ENG) == arasina sokmak (TR)
        // StringBuilder'in istedigimiz yerine istedigimiz seyi yerlestirebiliriz.
        // offset gorunce index gibi 0'dan sayma, length hesaplar gibi 1'den soymaya basla dedi.
        // yani dedik ki ilk 2 karakterden sonra XXXXXX ekle dedik.
        System.out.println(sb3.length()); // 9
        System.out.println(sb3); // FlXXXXXXo

        sb3.toString().split("l"); // toString() method can be convert the StringBuilder to String.
        // In this way, it provides us to use String Class methods that not exist methods in StringBuilder Class.
        // toString() methodu String Class'in methodudur. StringBuilder Class'in methodu degildir.
        // Yani bu method immutable Class'a ait bir method oldugundan
        // kendisi de immutable bir methoddur. Yani atama yapmazsan orjinal degeri degistirmez.

        StringBuilder sb4 = new StringBuilder(sb3); // String'i tekrar StringBuilder haline getirdik.

        sb3.reverse(); // var olan String'i tersine cevirir. String'te bu method yok.
                // Tersten yazdirma cok meshur bir interview sorusudur.
                // Tersten yazma seklinde interview sorusu sorulursa for loopla mi yapayim yoksa
                // StringBuilder'daki reverse() methoduyla mi yapayim diye sorun. Adam size loop'la yapin diyecek.
        System.out.println(sb3); // oXXXXXXlF

        sb3.deleteCharAt(1); // StringBuilder'a git, verilen indexteki char'i sil. dedik.
        System.out.println(sb3); // oXXXXXlF ---> X'lerden biri silindi

        sb3.delete(1,6); // StringBuilder'a git, baslangic indexi ile bitis indexi arasindakileri sil. dedik.
        System.out.println(sb3); // X'leri silelim dedik. ---> olF


        StringBuilder sb5 = new StringBuilder("Kava");
        StringBuilder sb6 = new StringBuilder("Java");

        System.out.println(sb6.compareTo(sb5)); // -1 verir. Yani alfabetik sira olarak J harfi, K harfinden 1 oncedir.
        // compareTo() alfabetik olarak karsilastirir. Bu method ascii degerlere gore islem yapar.
        // compare (ENG) == karsilastirma (TR)

        sb6.setCharAt(2, 'm'); // verilen indexteki karakteri istedigimiz karakterle degistirir.
        // (set Java'da degisim icin kullanilir, dedi)
        System.out.println(sb6); // Jama

        sb6.replace(1,3,"xyz"); // baslangic ve bitis indexini veriyoruz onu siliyor ve verdigimiz String'i yerlestiriyor.
        System.out.println(sb6); // Jxyza

        // subString() methodu String Class'in methodudur. StringBuilder Class'in methodu degildir.
        // Yani bu method immutable Class'a ait bir method oldugundan
        // kendisi de immutable bir methoddur. Yani atama yapmazsan orjinal degeri degistirmez.
        // Ama mesela replace() methodu StringBuilder Class'tan gelen bir methoddur.
        String s7 = sb6.substring(1,3); // subString() bize String return eder.
        System.out.println(s7); // xy
        System.out.println(sb6); // Jxyza  ---> bakin yukarida atama yapmadigimiz icin orjinal degeri degismedi.









    }

}

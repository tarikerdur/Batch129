package day06stringmanipulationsifstatement;

public class StringManipulations01 {
    public static void main(String[] args) {

// trim() METODU  // Example 1: Bir String'in basinda ve sonunda space karakteri varsa siliniz. (trim() metodu)

        String s = "   Ali Can  ";
        System.out.println(s);

        // trim methodu bir String'in bas ve sonundaki space karakterlerini siler. Ortadaki space'lere dokunmaz.
        String sTrimmed = s.trim();
        System.out.println(sTrimmed);

        // Example 2: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //            String tv = "$456.99";    +    String laptop = "$875.99";     = $1332.98

        String tv1 = "$456.99";
        String laptop1 = "$875.99";

        String tv2 = tv1.replace("$",""); // dolar isaretleri toplama yapmamiza engel oldugu icin dolar isaretini siliyoz.
        System.out.println(tv2);

        String laptop2 = laptop1.replace("$",""); // dolar isaretleri toplama yapmamiza engel oldugu icin dolar isaretini siliyoz.
        System.out.println(laptop2);

        Double totalPrice = Double.valueOf(tv2) + Double.valueOf(laptop2);
        System.out.println(totalPrice); //1332.98

// split() METODU  // Example 3: Verilen ismin ilk harfi ve soyismin ilk harfini ekrana yazdirin.

        String name = "   ali cAN "; // split() metoduyla ortadan ikiye bolecegiz sonra charAt() alicaz

        char first = name.trim().toUpperCase().charAt(0);
        System.out.println(first); // A

        char second = name.trim().toUpperCase().split(" ")[1].charAt(0); // split(" ")[1] ==> "Can" kaldi elimizde
        System.out.println(second);// C             // split yapacagimiz yer bosluk karakteri. sonra [] icine yazilan yer splitten sonra ayrilan 2. kelimenin sayisi.

        System.out.println("" + first + second);


// isEmpty() METODU  // Example 4: Bir String'in hic karakter icermedigini (bos String) kontrol eden kodu yaziniz.

        String str = "";

        //1. Yol ==> length() kullan
        boolean result1 = str.length()==0;
        System.out.println("String bos mu? " + result1); // true

        //2. Yol ==> isEmpty() kullan (Java bir konu hakkinda ozel bir method hazirladiysa bunu kullanmak daha iyidir, dedi.)
        boolean result2 = str.isEmpty();
        System.out.println("String bos mu? " + result2); // true


// isBlank() METODU  // Example 5: Bir String'in "space" haric hicbir karakter icermedigini kontrol eden kodu yaziniz.
        String t = "         ";

        //1. Yol ==> replace() ve length() kullan
        boolean result3 = t.replace(" ","").length()==0;
        System.out.println("Sadece space mi var? " + result3);

        //2. Yol ==> replace() ve isEmpty() kullan
        boolean result4 = t.replace(" ","").isEmpty();
        System.out.println("Sadece space mi var? " + result4);

        //3. Yol ==> isBlank() kullan
        boolean result5 = t.isBlank(); // bu method stringe gidip sadece space karakteri icin var mi yok mu diye kontrol eder.
        System.out.println("Sadece space mi var? " + result5);
        /*
        isBlank() metodu sadece space iceren Stringler icin true verir. Space disinda herhangi bir karakter var ise false doner.
        Ancak bu method bos String'ler icin de true verir.
        Yani isBlank() ==> space + "hicbir sey" icin true               isEmpty() ==> "hicbir sey" icin true
         */

// indexOf() METODU  // Example 6: Bir String'te a,i,e karakterlerinin ILK gorunumlerinin indexleri toplamini ekrana yazdiriniz.
        //          "Java is easy to learn" ==> 1 + 5 + 8 = 14
        String r = "Java is easy to learn";
        int idxA = r.indexOf('a');
        System.out.println(idxA); //1

        int idxI = r.indexOf('i');
        System.out.println(idxI); // 5

        int idxE = r.indexOf('e');
        System.out.println(idxE); // 8

        System.out.println("Index'ler toplami: " + (idxA+idxI+idxE)); // 14


// indexOf() METODU  // Example 7: Bir String'te "Java" kelimesinin ilk olarak kacinci indexte kullanildigini gosteren kodu yaziniz.
                // "Ah Java vay Java sensiz olmuyor Java."
        String u = "Ah Java vay Java sensiz olmuyor Java.";
        int idxJava = u.indexOf("Java"); // Java ilk harfin basladigi yerdeki indexi verir.
        System.out.println(idxJava); //3

        int idxOfXyz = u.indexOf("xyz"); // olmayan bir sey icin kullanilirsa her zaman -1 verir.
        System.out.println(idxOfXyz); // -1

// lastIndexOf() METODU  // Example 8: Bir String'te "a, i, e" karakterlerinin SON gorunumlerinin kacinci indexte kullanildigini gosteren kodu yaziniz.
                        // "Java is easy to learn"   ===> 18 + 5 + 17 = 40
        // olmayan bir sey icin kullanilirsa her zaman -1 verir.
        String v = "Java is easy to learn";
        int lastIdxA = v.lastIndexOf('a'); // 18
        int lastIdxI = v.lastIndexOf('i'); // 5
        int lastIdxE = v.lastIndexOf('e'); // 17
        System.out.println("Son indexler toplami: " + (lastIdxA + lastIdxI + lastIdxE)); // 40


        // Example 9: Bir String'deki tekrarsiz karakterleri ekrana yazdiriniz. (EBAY mulakatinda bana sorulan soru, dedi)
                 // "abb" ===> a
                 // bastan gelen index ile sondan gelen indexi karsilastirip
                 // cozuyoruz ama daha kisa yolunu ileride ogrenecegiz, dedi.

        /* Note: Bazi kodlarin bazi sartlara bagli olarak calismasi gerekir.
                 Bazi kodulari bazi sartlara gore aktive etmek icin "if statement" kullanilir. */

        String y = "abb";
        char ch1 = y.charAt(0);

        if (y.indexOf(ch1) == y.lastIndexOf(ch1)){
            System.out.println(ch1);
        }

        char ch2 = y.charAt(1);
        if (y.indexOf(ch2) == y.lastIndexOf(ch2)){
            System.out.println(ch2);
        }

        char ch3 = y.charAt(2);
        if (y.indexOf(ch3) == y.lastIndexOf(ch3)){
            System.out.println(ch3);
        }



//if statement      // Example 11: Sayi pozitif ise ekrana "Pozitif" yazdirin.
        int num = 12;
        if(num>0){
            System.out.println("Pozitif");
        }


        // Example 11: Sayi -1 ile 10 arasinda ise ekrana "Rakam" yazdirin.
        int number = 3;
        if (number>-1 && number<10){
            System.out.println("Rakam");
        }


// abs() METHODU    // Example 12: Sayi uc basamakli ise ekrana "Wooow!!" yazdirin.
        int n = -123; // Negatif sayilar da uc basamakli olabilir. bu yuzden abs methodu kullanmayi unutmayin, dedi.
        n = Math.abs(n); // Matematik classindaki mutlak deger methodudur. abs = absolute value (mutlak deger)
        if (n>99 && n<1000){
            System.out.println("Wooow!!");
        }
    }
}

package day23datetimestringbuilder;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime01 {
    public static void main(String[] args) {

        // Example 1: Time'i formatlayiniz.

        LocalTime myTime = LocalTime.now(); // icinde bulundugumuz bolgedeki anlik zamani aldik container'a yerlestirdik.
        System.out.println(myTime); // 21:39:08.446330800 ===> bu ciktiyi formatlayabiliriz. (format changing) (DateTimeFormatter class)

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh-mm-ss a"); // Java'da new kullanmadan
                                // var olan bir maddeyi baska bir maddeye donusturerek obje olusturduk.
        // saat ve dakika arasinda tire olsun dedik.
        // ss ==> saniye
        // hh ==> 12'lik saat sistemi  HH ==> 24'luk saat sistemi
        // hh kullandigimizda AM & PM demeliyiz. Bunu demek icin " a" yazmamiz yeterlidir. Yani; "hh:mm a"
        System.out.println(dtf.format(myTime)); // 09-44 PM   dtf objesinden format methoduna ulasip myTime'i yerlestirdik.
        // Java standarti 24'luk saat dilimidir. Ama biz 12'lik sistem kullanalim dedik. AM & PM kullanmak icin " a" koyduk.



    }

}

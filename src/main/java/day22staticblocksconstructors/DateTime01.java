package day22staticblocksconstructors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTime01 {

    public static void main(String[] args) {
// instant (ENG) == su an(TR)
        /*
            Tarih ve zamanla calisan application'lar date time kullanir.
        Kara Cuma indirimleri ornegin 3-9 Aralik araliginda gecerli ise bu indirimler date time ile saglanir.
        Ogrencilerin okula kayit tarihi applicationlarda date time ile yapilir.
        Ogrencinin yaslari date time'la depolanir. seneler ilerledikce otomatikmen o sayi artar.

            Bu ihtiyaca binaen Java, util library'de "Date" ve "Time" isimli iki class olusturmustur.
        */

        Date myDate = new Date(); // static olmayan methodlari da gorebilmek icin obje olusturalim, dedi.
        System.out.println(myDate); // Sat Jan 07 23:26:27 EET 2023  ==> yazdirdigin tarihteki zamani gosterir.

        System.out.println(myDate.getTime()); // 1673123306849  ==> 1 January 1970'den gunumuze kadarki milisaniye miktari.
        // Her calistiginda farkli zaman gosterir cunku her gecen zaman diliminde milisaniye ilerler. "unique" bir numaradir.

        // icinde bulundugumuz (current time) an nasil alinir ?
        // LocalDate Classinda static bir method olan now() methodunu kullanicaz
        System.out.println(LocalDate.now()); // 2023-01-07   yil - ay - gun
        // LocalTime Classinda static bir method olan now() methodunu kullanicaz
        System.out.println(LocalTime.now()); // 23:34:24.998782   hour - minute - second - nano-second olarak verdi
        //LocalDateTime Classinda static bir method olan now() methodunu kullanicaz
        System.out.println(LocalDateTime.now()); // 2023-01-07 T 23:36:01.892641500

        // Dunyanin herhangi bir saat dilimindeki saati nasil aliriz ?
// zone (ENG)= bolge (TR)
        System.out.println(LocalDateTime.now().atZone(ZoneId.of("Asia/Tokyo"))); // 2023-01-07 T 23:38:23.274207900 + 09:00 [Asia/Tokyo]
        System.out.println(LocalDateTime.now().atZone(ZoneId.of("Asia/Istanbul"))); // 2023-01-07 T 23:41:18.930696200 + 03:00 [Asia/Istanbul]
        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Istanbul"))); // bu da atZone() kullanmadan 2023-01-07 T 23:47:17.097798600


        // Ileriki bir tarihe nasil gidilir ? plus == toplama
        System.out.println(LocalDate.now().plusYears(7).plusMonths(5).plusDays(35)); // 2030-07-12

        // Geriye bir tarihe nasil gidilir ? minus == cikartma
        System.out.println(LocalDate.now().minusYears(4).minusMonths(3).minusDays(2)); // 2018-10-05

        // Ileriki bir zamana nasil gidilir ?
        System.out.println(LocalTime.now().plusHours(3)); // 02:56:09.351892800

        // Geriki bir tarihe nasil gidilir ?
        System.out.println(LocalTime.now().minusMinutes(45)); // 23:15:40.789798100
        // Zamanda belli bir bolumu nasil aliriz ?
        System.out.println(LocalTime.now().getHour() + " : " + LocalTime.now().getMinute()); // 0 : 2
        // getHour() saati al      getMinute() dakikayi al

        // Tarihte belli bir bolumu nasil aliriz.
        System.out.println(LocalDate.now().getMonthValue() + " : " + LocalDate.now().getDayOfMonth()); // 1 : 8
        // getMonthValue ==> ay numarasini verir  getMonth ==> ay ismini verir

        // Iki tarih nasil karsilastirilir ? isBefore isAfter isEqual gibi kiyaslama methodlari var.
        // 02/13/2005 - 03/01/2007
        System.out.println(LocalDate.of(2005, 2, 13).isBefore
                (LocalDate.of(2007, 3, 1))); // true


// DateTimeFormatter classta static bir method olan ofPatter() methodunu kullaniriz.
// Tarih'lerin formatlari nasil degistirilir ?     pattern (ENG) == kalip (TR)
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        //1 d - 2 d - 1 M - 2 M - 3 M - 4 M - 2 y - 4 y'li versionlar farkli versionlardir.
        System.out.println(dtf.format(LocalDate.now())); // 08/01/2023
    }
}

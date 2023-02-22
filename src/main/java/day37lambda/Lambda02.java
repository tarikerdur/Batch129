package day37lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Lambda02 { // Lambda Collection'larda ve Array'lerde ve gordugunuz gibi Text File'da da calisiyor.
    public static void main(String[] args) throws IOException {

            /*  BUNLARI QA'LER COK KULLANIYOR DEDI.

        anyMatch():  Vereceğimiz şarta bağlı olarak Stream içerisinde gezinir ve
                herhangi bir elemanla eşleşme durumunda true dönecektir.

        allMatch(): Verilen şarta göre Stream içerisindeki tüm elemanların
                bu şarta uyması durumunda true dönecektir.

        noneMatch(): Şarta göre Stream içindeki hiçbir
                 elemanın şartı sağlamaması durumunda true dönecektir.
            */


        //1) LambdaTextFile dosyasi icindeki metni console'a yazdiran kodu yaziniz.
        Files.lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).forEach(System.out::println);
        System.out.println();

        //2) LambdaTextFile dosyasi icindeki her characteri upperCase yapiniz.
        Files.lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).map(String::toUpperCase).forEach(System.out::println);

        //3) LambdaTextFile dosyasi icinde herhangi bir kelimenin var olup olmadigini gosteren kodu yaziniz.
        boolean result1 = Files.lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(t -> t.split(" ")).
                flatMap(Arrays::stream). // flatMap : streamin icindeki arrayleri kirip elemanlari streamin icine koyar. Darmadagin eder. like terminate
                        anyMatch(t -> t.contains("Java")); // Match == Eşleşmek ===>> any Match : herhangi bir kelime "Java" ise sonuc true return eder.
        System.out.println(result1);

        // 4) LambdaTextFile dosyasi icinde her bir kelimenin "a" icerip icermedigini kontrol eden kodu yaziniz.
        boolean result2 = Files.lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(t -> t.split(" ")).
                flatMap(Arrays::stream)
                .allMatch(t -> t.contains("a")); // Match == Eşleşmek ===>> all Match : Her bir kelime "a" iceriyor ise sonuc true return eder.
        System.out.println(result2);

        // 5) LambdaTextFile dosyasi icinde hicbir bir kelimenin "x" icermedigini kontrol eden kodu yaziniz.
        boolean result3 = Files.lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(t -> t.split(" ")).
                flatMap(Arrays::stream).
                noneMatch(t -> t.contains("x")); // Match == Eşleşmek ===>> none Match : Hicbir kelimede "x" yoksa ise sonuc true return eder.
        System.out.println(result3);

        // 6) LambdaTextFile dosyasi icinde hicbir bir kelimenin "r" ile biten kelimeleri sayan kodu yaziniz.
        int result4 = (int) Files.lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(t -> t.split(" ")).
                flatMap(Arrays::stream).
                filter(t -> t.endsWith("r")).
                count(); // count saymak icin kullanilir.
        System.out.println(result4);

        long result5 = Files.lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(t -> t.split(" ")).
                flatMap(Arrays::stream).
                filter(t -> t.endsWith("r")).
                collect(Collectors.toList()).size(); // count() yazmasaydik bu sekilde yapabilirdik.
        // Yani filtreleyip List'e doldurup List elemanlarini saydik.
        System.out.println(result5);


    }
}

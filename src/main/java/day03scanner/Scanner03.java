package day03scanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanicidan adresini aliniz ve ekrana yazdiriniz.

        System.out.println("Adres gir");
        String address = input.nextLine(); /* nextLine() methodu kullanicidan birden fazla kelimelik (satirin tamamini alir.
                                              Line==satir demek) String almak icin kullanilir. */

        System.out.println(address);




    }
}

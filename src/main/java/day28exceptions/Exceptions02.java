package day28exceptions;

public class Exceptions02 {
    public static void main(String[] args) {


        String s = "1234";
        convertStringToInt(s);

        String t = "1a2b"; // NumberFormatException
        convertStringToInt(t);

    }

    // Icinde rakam disinda char olan bir String'i sayiya cevirmek isterseniz Java "NumberFormatException" throw eder.
    static void convertStringToInt(String s) {
        int intS = 0;
        try {
            intS = Integer.valueOf(s);
        } catch (NumberFormatException e){ // NumberFormatException --> non primitive   e --> object
            System.out.println("Bir String'in sayiya donusturulebilmesi icin " +
                    "rakam disi karakter icermemesi gerekir."); // bu insani bir mesajdir.
            System.out.println(e.getMessage()); // getMessage() teknik bir mesaj vermek icin yazilir.
        }             // object'ten method cagirdigimiz icin getMessage() non-static bir methoddur.
        System.out.println(intS + 1); // 0 + 1 == 1
    }
}

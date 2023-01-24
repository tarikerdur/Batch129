package day28exceptions;

public class Exceptions03 {
    public static void main(String[] args) {

        String s = "Javs";

        getCharFromString(s, 2); // v

        getCharFromString(s, 4); // StringIndexOutOfBoundsException


    }

    // StringIndexOutOfBoundsException==>String de var olmayan indexler kullanildiginda bu hata throw edilir.
    // bound == sinir
    // range == sinir, aralik
    static void getCharFromString(String s, int idx) {
        try {
            char ch = s.charAt(idx);
            System.out.println(ch);
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("Using do not exist index exception..." + e.getMessage());
            System.out.println(e.getCause()); // null
            e.printStackTrace(); // developers use this usually. handle edilmeden once alinan mesaji yazar.
            /*
            e.printStackTrace();
        java.lang.StringIndexOutOfBoundsException: String index out of range: 4
        at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:47)
        at java.base/java.lang.String.charAt(String.java:693)
        at day28exceptions.CustomExceptions01.getCharFromString(CustomExceptions01.java:20)
        at day28exceptions.CustomExceptions01.main(CustomExceptions01.java:10)

            getCause()
        Bazi exceptionlarda java hatanin sebebini kendi soyler.
        Bu method da java tarafindan aciklamayi gormemiz icin kullanilir.
             */
        }

    }
}

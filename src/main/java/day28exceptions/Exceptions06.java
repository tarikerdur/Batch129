package day28exceptions;

public class Exceptions06 {

    public static void main(String[] args) {

        String s = "Java";
        getNumberOfChars(s); // 4

        String t = "";
        getNumberOfChars(t); // 0

        String u = null;
        getNumberOfChars(u); // NullPointerException

    }
    // String'in degeri "null" oldugunda String Class'taki bazi methodlari kullanamayiz.
    // Kullanirsak NullPointerException hatasi throw eder.
    static void getNumberOfChars(String s){
        try {
            int numOfChars = s.length();
            System.out.println(numOfChars);
        } catch (NullPointerException e){
            System.out.println("null degeri icin bazi methodlar kullanilamaz..." + e.getMessage()); //null degeri icin bazi methodlar kullanilamaz...null
            System.out.println(e.getCause()); // null
            e.printStackTrace();/*
                e.printStackTrace();
            java.lang.NullPointerException
            at day28exceptions.Exceptions06.getNumberOfChars(Exceptions06.java:21)
            at day28exceptions.Exceptions06.main(Exceptions06.java:14)
	            */
        }
    }
}

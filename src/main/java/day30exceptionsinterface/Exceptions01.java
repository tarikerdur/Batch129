package day30exceptionsinterface;

public class Exceptions01 {
// "finally" keyword
        /*
            1)  Exception olsa da olmasa da "finally block" her zaman calisir.
            2)  Eger bir kodun her halukarda calismasini istiyorsak onu "finally block" icine yazmaliyiz.
            3)  "finally" block try-catch block'dan sonra kullanilir.
            4)  Data Base ile baglantiyi kesme isini yapan kodlar gibi kodlar her halukarda calistirilmalidir.
            Bu tarz kodlari "finally" keywordlu block icine koyariz.
            5)  "try block" tek basina kullanilamaz.
                6)    "try block" + 1 "catch block" mumkundur.
                      "try block" + 1 "catch block" + 1 "finally block" mumkundur.
                      "try block" + coklu "catch block" mumkundur.
                      "try block" + coklu "catch block" + 1 "finally block" mumkundur.
                      "try block" + 1 "finally block" mumkundur.

            7)  Coklu "finally block" kullanilamaz.
            try block tek basina kullanilmaz. ya catch'le ya da finally'le ya da her ikisiyle birlikte kullanilmalidir.
            try ===> yapmayi dene
            catch ===> yapamazsan sunu yap
            finally ===> yapsan da yapmasan da siktiret salla gitsin.
        */

    public static void main(String[] args) {

        int a = 12;
        int b = 4;
        int[] c = {3, 6, 9, 12};

        m(c,a,b);

    }

    public static void m(int[] c, int a, int b) {

        try {
            int idx = a / b;
            int element = c[idx];
            System.out.println(element);
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Connection has cutted with Data Base");
        }

    }

}

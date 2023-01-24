package day30exceptionsinterface;

public class InvalidStudentGradeException extends Exception{
        /*
    1) Kendi application'imiza ozel kurallar olusturmak icin kendi "Exception Class"larimizi olusturabliriz.
    2) Olusturdugumuz "Exception Class"lar i)Compile Time Exception ii)Run Time Exception olabilir.

    3) "Compile Time Exception" olusturmak icin Class'inizin parent'i "Exception Class" olmalidir.**************
    4) "Run Time Exception" olusturmak icin Class'imizin parent'i "RuntimeException Class" olmalidir.***********

    5) Kendi olusturdugumuz Exception Class'lara "Custom Exception Class" denir.
        */

    public InvalidStudentGradeException(String message){
        super(message);
    }



}

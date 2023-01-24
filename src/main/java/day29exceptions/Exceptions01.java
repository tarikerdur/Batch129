package day29exceptions;

public class Exceptions01 {
    public static void main(String[] args) {

        // RUN TIME EXCEPTION : exists after press "run" button
        Object obj = 70;
        String str = "";
        try {
            str = (String) obj; // Birbirine donusturulemeyecek data typlarina donusturmekte
                                // israr ederseniz Java ClassCastException throw eder.
            System.out.println(str);
        } catch (ClassCastException e) {
            System.out.println("Her data type'i her data type'a ceviremeyiz \n" + e.getMessage());
        }



    }
}

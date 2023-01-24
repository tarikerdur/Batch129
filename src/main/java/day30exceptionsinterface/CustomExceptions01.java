package day30exceptionsinterface;

public class CustomExceptions01 {

    /*
        Bazen kendi Exception'imizi kendimiz uretiriz.
        Java'nin bilmedigi kendi kurallarimizi koyabiliriz.

        Mesela not ortalamasi hesaplarken biz negatif not girisine java izin verir. Ama izin vermemeliyiz.

    */


    public static void main(String[] args) {


        getStudentGrade(85);
        getTheNumberOfStudents(-23);

    }


    public static void getStudentGrade(int grade) {
        if (grade < 0 || grade > 100) {
            try {
                throw new InvalidStudentGradeException("Student's grades can not be less than zero or greater than hundred");
            } catch (InvalidStudentGradeException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(grade);
        }
    }

    public static void getTheNumberOfStudents(int numOfStudents) {

        if (numOfStudents<0){

            try {
                throw new InvalidNumberException("Student's number can not be negative");
            } catch (InvalidNumberException e){
                System.err.println(e.getMessage()); // err yazarsak kirmizi renk yazar daha gorunur olur.
                                        // err yazilinca java bunlari farkli bir yerde depoluyor.
            }

        } else {
            System.out.println(numOfStudents);
        }

    }


}

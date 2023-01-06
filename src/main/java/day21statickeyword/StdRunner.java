package day21statickeyword;

import java.util.List; //of() METHODU

public class StdRunner { // Projelerde genelde sadece runner classta main method olur, dedi.
    public static void main(String[] args) {

        System.out.println(Student.stdName); // static olan variable'a obje olusturmadan
        // sadece classin ismini kullanarak ulastik.

        Student std1 = new Student(); // non-static variablei kullanmak icin obje olusturmak zorunda kaldik.
        System.out.println(std1.age);

        String initials = Student.getInitials("Ali Can");
        System.out.println(initials);

        int vowels = std1.countVowels("Tom Cruise");
        System.out.println(vowels);

        String s = std1.getInitials("Ali Can"); // static methodlari da objeyle kullanabiliriz
        // ama bu tavsiye edilmez gerek yok. IT dunyasinda rezil olursunuz espirisi yapti.
        System.out.println(s);

//of() METHODU
        List<String> names = List.of("Ali","Veli","Can","Kemal");
                // List'e eleman eklerken uzun uzun add methodu kullanmak yerine
                // of() kullaniriz parametre icine elemanlari yazariz.
        System.out.println(names); // [Ali, Veli, Can, Kemal]

    }
}
package day27encapsulationabstraction;

public class CoursesRunner {

    public static void main(String[] args) {
        // "abstract class"larin icinde tamamlanmamis (body'si eksik) abstract methodlar vardir.
        // "abstract method"larin body'si olmadigindan bu methodlar yarim method sayilir.
        // Dolayisiyla abstract classlar eksigi olan kaliplar gibi dusunulebilir.
        // Eksigi olan classin objesi de eksik olur. eksik obje eksik is yapar.
        // Gercek dunyada eksik insanlar kotu is yapar. Sanal dunyada Java buna izin vermez.
        // Java eksik kaliplarin obje uretmesine izin vermez.
        // Bu yuzden abstract class'lardan object uretilemez.


        /*
            abstract classlarin constructor'i vardir ama obje uretme ozellikleri yoktur.
            bu yuzden asagida hata veriyor.
        */

        //Courses myCourse = new Courses();




    }
}


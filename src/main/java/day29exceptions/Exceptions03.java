package day29exceptions;

import java.io.FileInputStream; // "File"lara ulasip kullanmak icin Java bir Class uretmis
import java.io.FileNotFoundException;
import java.io.IOException;
// Bu Classi kullanarak file'daki datalara ulasicaz.
// io ==> i - input, o - output

public class Exceptions03 {

    /*
        1) "FileNotFoundException" ve "IOException" Compile Time Exception'lardir.
        Yani kodu yazarken hata aliriz. CTE'yi halletmeden kod yazmaya devam edemeyiz.

        2) "FileNotFoundException" path'in dogrulugu ve dosyanin varligi ile ilgilidir.
        "IOException" tum input ve output islemleri ile ilgilidir.

        3) "IOException" Class, "FileNotFoundException" Class'in parentidir.

        4) istenirse "FileNotFoundException" yerine "IOException" da kullanilabilir.

        5) "IOException" ve "FileNotFoundException" beraber kullanilacaksa
        child olan "FileNotFoundException" ustte parent olan "IOException" altta kullanilmalidir.
    */

    public static void main(String[] args) {

        // Hep "Run Time Error" anlattik artik "Compile Time Error" anlatalim dedi.
        // Text File'a gidip orada yazilan yaziyi consolea yazicaz.
        try {
            FileInputStream fis = new FileInputStream("src\\main\\java\\day29exceptions\\File01.txt");
            // src'den oncesini silebilirsiniz dedi. silmeseniz de calisir ama silin dedi.

            int k = 0;
            // okunacak karakter kalmayinca read() methodu -1 return eder.
            while ((k = fis.read()) != -1) {

                System.out.print((char) k);
            }


        } catch (FileNotFoundException e) {
            System.out.println("Path is wrong or the file does not exist");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nHi!");

    }
}

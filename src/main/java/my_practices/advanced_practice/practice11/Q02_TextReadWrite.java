package my_practices.advanced_practice.practice11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q02_TextReadWrite {
    public static void main(String[] args) throws IOException {
        //Bir text dosyasındaki her satırın kelime sayısını o dosyada her satırın sonun yazdıran bir kod yazınız.

        FileReader fr = new FileReader("C:/Users/MONSTER/Desktop/HelloWorld.txt");
        BufferedReader br = new BufferedReader(fr);

        String row = br.readLine();
        String newText = "";

        while (row != null) {
            newText += row + " ==> Number of row's letter = "+ row.split(" ").length + "\n";

            row = br.readLine();
        }

        System.out.println(newText);
        br.close();
        fr.close();

        FileWriter fw = new FileWriter("C:/Users/MONSTER/Desktop/techpro.txt");
        fw.write(newText);
        fw.close();



    }

}

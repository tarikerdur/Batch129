package my_practices.oylesinecalismalar;

import java.io.*;

public class FileWrite {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("C:/Users/MONSTER/Desktop/test1.txt");
        BufferedReader br = new BufferedReader(fr);

        String str = br.readLine();
        String newText = "";

        while (str!=null){
            newText += str;
            str = br.readLine();
        }

        fr.close();
        br.close();

        FileWriter fw = new FileWriter("C:/Users/MONSTER/Desktop/test2.txt");
        fw.write(newText);
        fw.close();









    }
}

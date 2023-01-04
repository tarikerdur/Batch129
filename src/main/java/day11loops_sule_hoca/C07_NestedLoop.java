package day11loops_sule_hoca;

public class C07_NestedLoop {
    public static void main(String[] args) {

        /*
        Type code to print the following image on the console
        X X X X X
        X X X X X
        X X X X X
        */

        int satir = 5 , sutun= 5 ;
        char ch = 'X';
        for (int i = 1 ; i<=satir; i++){
            String str = ""; // satirlar arasi bosluk
            for (int j = 1; j<=sutun; j++){
                str+=ch+"     "; // sutunlar arasi bosluk
            }//for j
            System.out.println(str);
        }//for i



        // 10x10 carpim tablosu yap (nested for loop)
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.println(i + "x" + j + "=" + (i * j));
            }
            System.out.println("*****************");
        }



    }//main
}//class

package day11forloop;

public class ForLoop04 {
    public static void main(String[] args) {
        //Example 1: 5'den 8'e kadar tam sayilarin toplamini veren kodu yaz.

                /*
                    Yeni bir deger elde edecegimiz icin yeni degeri koyacagimiz memoryde
                yeni bir konteyner olusturmamiz lazim. Bu yuzden int sum = 0; actik.
                    Islemin sonucunu etkilemeyecek bir deger olmasi lazim.
                Mesela carpmada ve bolmede 0 olmaz. 1 olmasi lazim.
                */
        int sum = 0;
        for (int i = 5; i < 9; i++) {
            sum += i;
        }
        System.out.println(sum);//26


        //Example 2: 7'den 9'a kadar tam sayilarin carpimini veren kodu yaz.
        int multiply = 1;
        for (int i = 7; i < 10; i++) {
            multiply *= i;
        }
        System.out.println(multiply);//504


    }
}

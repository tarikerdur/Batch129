package day08nestedifternary;

import java.util.Scanner;

    /*
    Java Nested If'leri calistirirken cok zamana ihtiyac duyar. (Time Consuming)
    Bu yuzden biz mecbur kalmazsak "Nested If" kullanmamaya calisiriz.

        Iyi kod == kisa ve clean koddur. Uzun karmasik kod yazanlari sevmezler.
        Acaba bu isi Nested kullanmadan yapabilir miyim diye dusunmek lazim.

        Parantez icleri de olabildigince kisa olmali.
        Bu yuzden asagida boolean olusturduk, dedi.
     */

public class NestedIf01 { // Nested (ENG) = Ic ice giren seyler (TR)
                          // Nested if = Ic ice gecmis if'ler
    public static void main(String[] args) {

                /*
                Example 1: Kullanicidan 3 tane pozitif bir tamsayi aliniz.
                              Bu 3 sayinin ucgen olusturma durumunu kontrol ediniz
                              Eger ucgen ise "eskenar"
                              Ucgen olma durumunu
                              kontrol ediniz.
                              INFO :
                              Ucgen Olma Sarti: herhangi iki kenar toplami ucuncu kenarda buyuk olmali
                                                herhangi iki kenar farki ucuncu kenardan kucuk olmali
                               a+b>c>a-b  ucgen olma 1. sart
                               a+c>b>a-c  ucgen olma 2. sart
                               b+c>a>b-c  ucgen olma 3. sart
                                        Bu kurallarin hepsinin ayni anda true olmasi lazim
                               a=b=c ise eskenar ucgen
                 */

        Scanner input = new Scanner(System.in);
        System.out.println("Ucgenin kenarlari icin 3 tane uzunluk giriniz");

        // Kullanici negatif girerse diye mutlak deger Math.abs() kod yazabilirsiniz.
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        boolean ucgenMi = (a+b>c && c>Math.abs(a-b)) && (a+c>b && b>Math.abs(a-c)) && (b+c>a && a>Math.abs(b-c));

        // Kullanicinin negatif ya da sifir sayisini girmesini affetmiyorsak
        if (a<=0 || b<=0 || c<=0){
            System.out.println("Ucgenin kenarlari negatif olamaz");

        }else if (ucgenMi){ // Outer if ==> ucgen olmanin genel kuralini yazicaz

            if (a==b && b==c && a==c){ // Inner if ==> eskenar ucgen olup olmadigini yazicaz
                System.out.println("Eskenar ucgen");
            }else {
                System.out.println("Ucgen ama Eskenar ucgen degil");
            }
        }else {
            System.out.println("Ucgen degil");
        }
    }
}

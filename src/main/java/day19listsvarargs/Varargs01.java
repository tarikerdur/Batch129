package day19listsvarargs;

public class Varargs01 { // "..." ===> varargs

    public static void main(String[] args) {

        /*
        Varargs'lar method olustururken "parametre" sayisinda bize esneklik saglar.
        Method'un parantezleri icine yazilanlara "parametre" denir.
        Method'u cagirirken kullanilan sayilara da "argument" denir.

        Parametre icinde varargstan SONRA varsa baska bir parametre (baska bir varargs dahil) yazamayiz.
        Varargs, varargstan ONCE varargs disindaki parametrelerle kullanilabilir.
        Cunku sonraki parametreler "reachable"'dir.

        Cunku varargslar dipsiz kuyu, kara delik gibidir.
        Kullanicinin verdigi tum parametreleri varargs emer.
        Varargs dolmadigi icin Java diger parametreye gecemez.
        Java'da unreachable Code & unused Code'lar hep error verir.

        Mesela 2 sayili toplama 3 sayili toplama 4 sayili toplama vs++
        icin ayri ayri bir method olusturmak istersek bir suru ihtimal cikar.
        Bir suru method yazmak yerine varargs kullanarak isimizi goruruz.
        istedigimiz miktardaki sayi ile islem yapabilmek icin Java varargs'lari uretmistir.
        Uc nokta "..." Java syntax'inde "varargs" anlamina gelir.

        Varargs, Array degildir, List degildir. Ama arka planda Array kullanir.
        Bu yuzden varargslar non-primitive'dir.
        Java == Array demeyin ama Array gibi calisir diyebilirsiniz, dedi.
        Varargs'lar Array gibi calistigi icin non primitive parametre yazarsak reference'lari kullanir.

        */

        addTwoNumbers(3, 5);
        addThreeNumbers(4, 7, 2);
        add(4, 5, 6, 7, 8, 9); // buraya yazilan kullanilacak seylere "argument" denir.

    }

    // Iki sayiyi toplayan method olusturunuz
    public static void addTwoNumbers(int a, int b) {
        System.out.println(a + b);
    }

    // Iki sayiyi toplayan method olusturunuz
    public static void addThreeNumbers(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    // Istediginiz sayida sayiyi toplamak icin bir method olusturunuz.
    public static void add(int... a) { // "..." ===> varargs'tir. Kullanici kac tane sayi girerse girsin toplar.
                                // "..." mutlaka data type ile variable arasina konulur.
        int sum = 0;
        for (int w : a) {
            sum += w;
        }
        System.out.println(sum);
    }


}

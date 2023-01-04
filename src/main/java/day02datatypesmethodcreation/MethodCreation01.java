package day02datatypesmethodcreation;

public class MethodCreation01 {
        /*
        Java`da method nasil olusturulur?
                1) Main Method`un disinda olusturulur.
                2) Access modifier + Return type (sonucun data tipi 3+5=8  ==> int gibi ) + method ismi (icerikle uyumlu olacak)
                   + method isminden sonra () koylacak + {} koy ==> entera bas
                3) Parantez icine return verecegimiz sayilari vermemiz lazim.


         Olusturulan Methodlar nasil kullanilir?
                1) Main Methodun icinden kullanilir.
                2) Methodun ismi yazilir.
                3) Islem yapacagimiz sayilari parantezin icine koyariz.

         */


    public static void main(String[] args) {

        int sonuc = add(30,50); /* parantezin icine sayi verdik. Java bunlari topladi.
                                        sonucu gormek icin memoryde yer acmamiz lazim. "sonuc" adinda int olarak memoryde bir yer olusturduk.
                                        Java. assigment operator (=) gorurse once islemin sag tarafini yapar. Islemimizi yaptiktan sonra degeri bulup
                                        sol tarafta memoryde olusturdugumuz "sonuc" isimli yere atama yapar. */
        System.out.println(sonuc); // Bu degeri yazdirdik.

//------------------------------------------------------------------------------------------------------------------------

        long carpmaSonucu = multiply(3,6); /* parantezin icine sayi verdik. Java bunlari carpti.
                                                    sonucu gormek icin memoryde yer acmamiz lazim. "carpmaSonucu" adinda long olarak memoryde bir yer olusturduk.
                                                    Java. assigment operator (=) gorurse once islemin sag tarafini yapar. Islemimizi yaptiktan sonra degeri bulup
                                                    sol tarafta memoryde olusturdugumuz "carpmaSonucu" isimli yere atama yapar. */
        System.out.println(carpmaSonucu); // Bu degeri yazdirdik.

//------------------------------------------------------------------------------------------------------------------------

        // Odev 1`in cevabi :
        int ucluSonuc = firsTwoMultiplyThirdAdd(2,5,8);
        System.out.println(ucluSonuc);

//------------------------------------------------------------------------------------------------------------------------

        //Odev 2`nin cevabi :
        double kup = getCube(5);
        System.out.println(kup);


    }

    // Toplama islemi methodu olusturalim.
    public static int add(int a, int b){ // () icine toplayacagimiz sayi degerlerini yazariz.
        return a+b; // return yazmazsan javaya sayiyi verirsin ama java susar. javaya sonucu return et demedin ki. bu yuzden return deriz.
    }

    // Carpma islemi methodu olusturalim.
    protected static long multiply(int a, int b){ // () icine toplayacagimiz sayi degerlerini yazariz.
        return a*b; // return yazmazsan javaya sayiyi verirsin ama java susar. javaya sonucu return et demedin ki. bu yuzden return deriz.
    }



    // Odev 1: Verilen 3 sayidan ilk ikisini carpan ve sonucu 3. sayi ile toplayan methodu olusturun ve kullanin.
    private static int firsTwoMultiplyThirdAdd(int a, int b, int c){
        return a*b+c;
    }

    // Odev 2: Verilen bir ondalik sayinin kupunu hesaplayan methodu olusturup kullaniniz.

    static double getCube (float a){ /* Access modifieri default yapmak icin access modifier YAZMAYIN.
                                        Default YAZMAYINCA olur. default yazarsan hata verir. */
        return a*a*a;
    }

    // Odev 3: Dikdortgenin alanini hesaplayan methodu olusturup yazdirin.
    // Odev 4: Dikdortgenin cevresini hesaplayan methodu olusturup yazdirin.
    // Odev 5: Dairenin cevresini hesaplayan methodu olusturup yazdirin.
    // Odev 6: Dairenin alanini hesaplayan methodu olusturup yazdirin.

}

package day20passbyvaluemethodoverloading;

public class PassByValue01 {
    public static void main(String[] args) {

         /*
                    "Pass By Value" sayesinde Java orjinal degeri koruma altina alir.
             pass by value ==> java value'nin kopyasini kullanir.



             Pass by value kullanilmazsa ;
                 Mesela 100 TL olan bir shirt'te ogrenciler icin 10 TL indirim yaparsaniz
             Shirt'in asil degeri de degisir.
                 Ama yaslilar icin de 20 TL indirim yapilirsa yaslilarin 80 TL'ye satilmasi
             gerekirken pass by value kullanilmadigi icin asil deger ogrencilere indirim
             yapildiginda 10 TL inmis olur. Sistem yaslilara 80 yerine 70'e satis yapar.


                    "Pass By Reference" sayesinde Java orjinal degeri koruma altina ALMAZ.

             pass by reference ==> java referencein kopyasini kullanir.
             Harita sahte de olsa gercek de olsa ayni hazineyi gosterir.
             Bu yuzden pass by reference kullanilirsa orjinal degeri degistirir.



                Java her zaman pass by value kullanir. Hicbir zaman pass by reference kullanmaz.
                Ama mesela "C" dilleri pass by reference kullanir, dedi.

             Example :
                 Asagidaki ornekte 100 tl olan tisortu
                 ogrenci gazi ve yaslilar icin asil fiyati
                 degistirmeden indirim yapan kodu yazicaz.
         */

        double shirt = 100;

        //Java valuenin kopyasini cikartip methodun icine kopyasini yollar. Bu yuzden asil fiyati degismez.

        double studentShirtPrice = discount("student", shirt);
        double veteranShirtPrice = discount("veteran", shirt);
        double seniorShirtPrice = discount("senior", shirt);

        System.out.println(shirt); // 100  ==> orjinal deger korundu.
        System.out.println(studentShirtPrice);// 90
        System.out.println(veteranShirtPrice); // 80
        System.out.println(seniorShirtPrice); // 95


        // gaziler icin yaptigimiz indirimleri herkes icin yapalim dersek
        shirt = discount("veteran", shirt);
        System.out.println(shirt); // 80

    }


    public static double discount(String state, double price) { // fiyatta indirim yapan bir method yapiyoruz.

        switch (state) {

            case "student":
                price = price * 0.90;
                break;
            case "veteran":
                price = price * 0.80;
                break;
            case "senior":
                price = price * 0.95;
                break;
            default:
                price = price;
        }

        return price;
    }


}

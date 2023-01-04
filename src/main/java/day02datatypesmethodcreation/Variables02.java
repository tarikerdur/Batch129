package day02datatypesmethodcreation;

public class Variables02 {

            /*
            Non-Primitive Data Types:
                    String
                    Array
               Primitive gibi sinirli sayida degildir. Sinirsiz olarak HERKES tarafindan uretebilir.
               Classlar urettigimiz non primitive data type`lara ornektir.

               Non-Primitive Data Type isimleri buyuk harfle baslar.
               Non-Primitive Data Typelarin tamami icin Java memoryde ayni miktarda yer ayirir.

        ***   Bunlari ezberle mulakatlarda cat cat soylemek lazim
            ***   Interview sorusu: Primitive ve non Primitive arasindaki farklar nedir?
                       1) Primitiveler sadece bizim atadigimiz degeri icerir.
                       Non Primitiveler bizim atadigimiz deger ve methodlar icerir. (cok onemli ozellik mutlaka bunu soyle)

                       2) Primitiveler kucuk harfle baslar non primitiveler buyuk harfle baslar.
                       3) Primitiveleri Java uretmistir 8 tanedir.
                       Non Primitiveleri Java ve developerlar uretebilir. Sinirsiz sayidadir. Her class bır non primitivedir.
                       4) Primitiveler memoryde data tipine gore yer kaplar.
                       Non Primitiveler icin Java memoryde hep ayni buyuklukte yer ayirir.
             */

    public static void main(String[] args) {
        // Ornek 1: Sehir isimleri icin bir variable olusturun ve bir value atayip onu ekrana yazdirin.

        String cityName = "Izmir";
        System.out.println(cityName);


    }
}

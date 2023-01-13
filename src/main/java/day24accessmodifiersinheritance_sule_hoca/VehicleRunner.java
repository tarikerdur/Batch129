package day24accessmodifiersinheritance_sule_hoca;

public class VehicleRunner {

    // Car turunde rengi beyaz olan 54000 km'de 250000 TL fiyati
    // olan 2020 model bir honda accord ariyoruz.


    public static void main(String[] args) {

        HondaAccord endut = new HondaAccord(250000,2020,"Honda","Accord");
        System.out.println(endut);

//      extends = extends ettiği class taki methodları kullanabilir
//      extends olmadan = obje oluşturarak farklı class taki methodları kullanabiliriz



    }

}

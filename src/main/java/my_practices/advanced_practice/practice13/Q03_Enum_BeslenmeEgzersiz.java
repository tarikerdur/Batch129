package my_practices.advanced_practice.practice13;

public class Q03_Enum_BeslenmeEgzersiz {

    public static void main(String[] args) {

        //Aylara göre sebze ve meyve tavsiyesi içeren ve toplam yapılması gereken egzersiz saatlerini söyleyen bir kod yazınız.
        //20 saat üstü egzersiz yapılacak ayları ekrana yazdırınız.


        for (BeslenmeEgzersiz w : BeslenmeEgzersiz.values()){
            if (w.toplamEgzersizSaati>=20){
                System.out.println(w);
            }
        }

    }
}

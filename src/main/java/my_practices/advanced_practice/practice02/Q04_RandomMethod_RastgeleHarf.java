package my_practices.advanced_practice.practice02;

public class Q04_RandomMethod_RastgeleHarf {

    public static void main(String[] args) {
        /*
        Rastgele bir harf veren bir method oluşturun ve ardından methodu kullanarak aşağıdakileri yazdırınız.
        ‘A’ ve ‘a’ için “İlk Karakter” yazdırınız.
        ‘B’ ve ‘b’ için “İkinci Karakter” yazdırınız.
        ‘C’ ve ‘c’ için “Üçüncü Karakter” yazdırınız.
        ‘D’ ve ‘d’ için “Dördüncü Karakter” yazdırınız.
        Diğerleri için “Diğer Karakterleri” yazdırınız.
        */

        String rastgeleHarf = rastgeleHarf().toLowerCase();

        switch (rastgeleHarf) {
            case "a":
                System.out.println("İlk Karakter : " + rastgeleHarf);
                break;
            case "b":
                System.out.println("İkinci Karakter : " + rastgeleHarf);
                break;
            case "c":
                System.out.println("Üçüncü Karakter : " + rastgeleHarf);
                break;
            case "d":
                System.out.println("Dördüncü Karakter : " + rastgeleHarf);
                break;
            default:
                System.out.println("Diğer Karakterler : " + rastgeleHarf);
        }


    }


    public static String rastgeleHarf() {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        int maxIndex = alphabet.length();
        int rastgeleIndex = (int) (Math.random() * maxIndex);

        return alphabet.substring(rastgeleIndex, rastgeleIndex + 1);
    }
}

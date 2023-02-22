package my_practices.my_likedin_packages.ssgstringbuilder;

public class C06_Equals {

    public static void main(String[] args) {
        String str = "Java";
        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Java");

        // StringBuilder'da equals() referencelari da compare eder. Ayni "==" gibi.
        // Bu yuzden valuelar ayni olmasina ragmen asagida false gorduk.
        System.out.println(sb1.equals(sb2)); // false
        System.out.println(sb1.equals(str)); // false

        System.out.println(sb1.toString().equals(str)); // true

        System.out.println(sb1.compareTo(sb2)); // 0 return etti cunku farkli karakterler yok.
        // Eger farkli karakterle karsilasirsa karakterler arasindaki ascii farki return eder.

            /*
		compareTo() iki stringBuilder'i bastan baslayarak harf harf karsilastirir
        ilk harf ayni ise, ikincisine gecer
        ikinciler ayni ise 3.lere gecer ve ilk farkli olan harfe kadar gider
        farkli olan iki harfin ascii kodlari arasindaki farki verir
		cikti 0 ise iki stringBuilder ayni degerlere sahiptir
            */
    }
}
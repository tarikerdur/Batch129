package day20passbyvaluemethodoverloading;

public class PassByValue02 {
    public static void main(String[] args) {
        // Stringin sonuna "Jr" ekleyen method olusturalim
        String nameMain = "Tom Hanks";

        System.out.println(updateName(nameMain,"Jr."));

        System.out.println(nameMain); // ==> "Tom Hanks"
                                      // Java methodun icine olusturdugu copy'i
                                      // gonderdigi icin main icindeki asil deger degismedi.

        nameMain = updateName(nameMain,"Jr."); // ==> "Tom Hanks Jr."
        System.out.println(nameMain); // orjinal degere assing ettigimiz icin orjinal degeri degistirdik.
    }

    public static String updateName(String name, String add) { // Stringin sonuna "Jr" ekleyen method olusturalim

        name = name + " " + add;

        return name;
    }


}

package my_practices.my_likedin_packages.ssgstringbuilder;

public class C01_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("kedi, kopek");
        StringBuilder sb3 = new StringBuilder(7);

        System.out.println(sb1.capacity()); // 16
        System.out.println(sb1.length()); // 0

        sb1.append("ali");
        System.out.println(sb1.capacity()); // (capacity'i asmadigimiz icin capacity degismedi)
        System.out.println(sb1.length()); // 3

        System.out.println(sb3.capacity()); // 7
        System.out.println(sb3.length()); // 0

        System.out.println(sb2.capacity()); // 16 + 11 = 27
        System.out.println(sb2.length()); // 11
        sb2.append("at");
        System.out.println(sb2.capacity()); // 27 (capacity'i asmadigimiz icin capacity degismedi)
    }
}
package my_practices.my_likedin_packages.ssgstringbuilder;

public class C03_Reverse {
    public static void main(String[] args) {
        // verilen bir inputu tersine cevirip return eden bir method olustur.
        System.out.println(reverse("Java"));
    }
    static String reverse (String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
}
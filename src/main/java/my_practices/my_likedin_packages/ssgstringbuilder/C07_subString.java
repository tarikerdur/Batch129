package my_practices.my_likedin_packages.ssgstringbuilder;

public class C07_subString {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("dunya cok guzel");
        System.out.println(sb1.substring(0, 5));//dunya
        System.out.println(sb1.subSequence(6, 9)); //cok
        System.out.println(sb1.substring(9)); // guzel
    }
}
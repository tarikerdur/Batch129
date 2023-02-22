package my_practices.my_likedin_packages.ssgstringbuilder;

public class C05_IndexOf {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java cok guzel");

        System.out.println(sb.indexOf("l",sb.length()-1)); // 13
                          // ==> sonuncu indexe bak dedik ve orada bulunca indexi return etti.

        sb.replace(5,8,"yarrak");
        System.out.println(sb);

        sb.setCharAt(7,'p');
        System.out.println(sb);
    }
}
package my_practices.my_likedin_packages.ssgstringbuilder;

import java.util.Arrays;

public class C04_Delete {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java cok guzel");

        sb.delete(5, 9);
        System.out.println(sb); // Java guzel

        sb.deleteCharAt(4);
        System.out.println(sb); // Javaguzel

        sb.delete(0,sb.length());
        System.out.println(Arrays.asList(sb)); // []

        sb.append(1);
        System.out.println(sb); // 1
    }
}
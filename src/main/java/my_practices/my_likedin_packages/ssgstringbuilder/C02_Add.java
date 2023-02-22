package my_practices.my_likedin_packages.ssgstringbuilder;

public class C02_Add {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        sb.append("! Java Cok Guzeldir",0,1);
        sb.insert(1," cok");
        System.out.println(sb);
    }
}
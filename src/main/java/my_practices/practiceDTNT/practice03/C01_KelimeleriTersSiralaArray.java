package my_practices.practiceDTNT.practice03;

import java.util.Arrays;

public class C01_KelimeleriTersSiralaArray {
    /*
    Her girdi satırı, tek boşluklarla ayrılmış bir veya birkaç sözcük içerir.
    Sözcükler değişmeden,her giriş satırındaki sözcüklerin sırasını
    tersine çevirmek için kod yazınız.
    Çıktınızın satırlarında sonunda veya başında boşluk olmamalıdır.
    Örnek; Kemal Can Kuzu, Kuzu Can Kemal'e dönüşecektir
    */
    public static void main(String[] args) {


        String str = "Kemal Can Kuzu";
        String arr[] = str.split(" ");
        System.out.println(Arrays.toString(arr));

        int idx = 0;
        String [] brr = new String[arr.length];

        for (int i = arr.length-1; i >=0 ; i--) {
            brr [i] = arr [idx];
            idx++;
        }
        System.out.println(Arrays.toString(brr));
    }
}

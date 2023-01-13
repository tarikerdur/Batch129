package my_practices.advanced_practice.practice05;

public class Q06_Arrays_Simetrik {
    public static void main(String[] args) {

        // Bir Array'in simetrik olup olmadığını kontrol eden bir method oluşturunuz.
        int[] arr = {0, 1, 2, 3, 4, 5, 5, 4, 3, 2, 1, 0};
        System.out.println(isSimetric(arr));
    }

    public static boolean isSimetric(int[] arr) {

        boolean isSimetric = false;

        for (int i = 0; i < arr.length/2; i++) {
            // son index --- index ne kadar ilerlerse sondan basa dogru da o kadar gelsin diye -i dedik
            if (arr[i] == arr[arr.length - 1 - i]) {
                isSimetric = true;
            } else {
                isSimetric = false;
                break;
            }
        }

        return isSimetric;
    }


}

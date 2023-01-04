package my_likedin_packages;

import java.util.Arrays;
import java.util.Scanner;

public class GeneratingFibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            System.out.println("Enter the number of Fibonacci Strings you want\t: ");
            int num = input.nextInt();
            generatingFibonacci(num);
    }

    private static void generatingFibonacci(int numOfFibo) {

        int fibonacci[] = new int[numOfFibo];
        fibonacci[0] = 1;
        fibonacci[1] = 1;

        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        System.out.println(Arrays.toString(fibonacci));
    }
}

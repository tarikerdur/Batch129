package my_practices.oylesinecalismalar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Asd {
    public static void main(String[] args) {
        m3("Result: ");
    }
    public static void m3(String x, int... y) {
        int p = 1;
        for(int w: y) {
            p = p * w;
        }
        System.out.print(x);
        System.out.println(p);
    }
}

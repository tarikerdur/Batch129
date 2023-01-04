package day11forloop;

public class NestedForLoop {
    public static void main(String[] args) {
                /*
        Example 1: Asagidaki ciktiyi verecek kodu yaziniz
                    Week: 1
                      Day: 1
                      Day: 2
                      Day: 3
                      Day: 4
                      Day: 5
                      Day: 6
                      Day: 7
                      .....
                    Week: 2
                      Day: 1
                      Day: 2
                      Day: 3
                      Day: 4
                      Day: 5
                      Day: 6
                      Day: 7
                      ....
                    Week: 3
                      Day: 1
                      Day: 2
                      Day: 3
                      Day: 4
                      Day: 5
                      Day: 6
                      Day: 7
                      ....
                */
        for (int i = 1; i < 4; i++) {
            System.out.println("Week: " + i);

            for (int j = 1; j < 8; j++) {
                System.out.println("Day: " + j);
                if (j == 7) {
                    System.out.println("....");
                }
            }
        }
    }
}

package day30exceptionsinterface;


public class Exception02 {

    /*
            Java'da "Throwable" diye bir Class var.
            Object Class, Throwable'in parent'idir.

            "Throwable" ikiye ayrilir.
                1)  "Error" (Geri donusu olmayan unexpected issues'dur. Error'lar "Handle" edilemezdir.) (Throwable'in Child'i)
                        1.1) OutOfMemoryError
                        1.2) StackOverFlowError
                        1.3) VirtualMachineError etc.

                2)  "Exceptions" (Throwable'in Child'i)
                        2.1) RunTimeExceptions (Unchecked Exceptions)
                            2.1.1) ArithmeticExceptions
                            2.1.2) NullPointerException
                            2.1.3) StringOutOfBoundException
                            2.1.4) NumberFormatException
                            2.1.5) ArrayIndexOutOfBoundException
                            2.1.6) ClassCastException
                            2.1.7) IllegalArgumentException

                        2.2) CompileTimeExceptions (Checked Exceptions)
                            2.2.1) FileNotFoundException
                            2.2.2) IOException


    */

    public static void main(String[] args) {

        int a = 12;
        int b = 3;
        int[] c = {3, 6, 9, 12};

        m(c,a,b);

    }

    public static void m(int[] c, int a, int b) {

        try {
            int idx = a / b;
            int element = c[idx];
            System.out.println(element);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}

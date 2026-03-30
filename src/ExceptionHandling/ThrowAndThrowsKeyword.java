package ExceptionHandling;

import java.util.Scanner;

public class ThrowAndThrowsKeyword {

    // Inner class
    class A {

        // method declaring exception using throws
        public void LetsCheckException() throws ArrayIndexOutOfBoundsException {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the index");
            int index = sc.nextInt();

            int[] arr = new int[5];

            // This line can throw ArrayIndexOutOfBoundsException
            System.out.println("Value at index: " + arr[index]);
        }
    }

    public static void main(String args[]) {

        ThrowAndThrowsKeyword outer = new ThrowAndThrowsKeyword();
        A obj = outer.new A();

        try {
            obj.LetsCheckException();
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("This is ArrayIndexOutOfBoundsException");
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = sc.nextInt();

        System.out.println("Enter b: ");
        int b = sc.nextInt();

        try {

            // manually throwing exception
            if (a == 0) {
                throw new ArithmeticException("ArithmeticException: value of a is " + a);
            }

            if (b == 0) {
                throw new ArithmeticException("ArithmeticException: value of b is " + b);
            }

            int result1 = a / b;
            int result2 = b / a;

            System.out.println("result1: " + result1 + " result2: " + result2);
        }

        catch (ArithmeticException e) {
            System.out.println(e.getMessage() + " -> ArithmeticException occurs");
        }

        System.out.println("Program executed successfully");
    }
}
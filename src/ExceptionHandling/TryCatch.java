package ExceptionHandling;
import java.io.*;
import java.util.Scanner;
public class TryCatch {
    // This method calls itself recursively.
    // It has no stopping condition, so it will cause StackOverflowError.
    static void fun(){
        fun();
    }

    public static void main(String args []){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int br_var = Integer.parseInt(br.readLine());

        }catch (IOException e){
            System.out.println("this is IOException BufferedReader : ");
        }
        // Scanner object for taking input from user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the dividend");
        int a = sc.nextInt();

        int b = 100;

        System.out.println("Enter the index number ");
        int index = sc.nextInt();

        try {

            // Risky statement: may throw ArithmeticException if b = 0
            int result = a / b;

            // Creating an array of size 5 (index range 0–4)
            int [] arr = new int [5];

            // Loop for printing array values
            for (int i=0; i<5; i++){
                arr[i]=i;
                System.out.println(arr[i] + " ");
            }

            // Calling recursive function which will cause StackOverflowError
            fun();
        }
        // Multiple catch blocks can be used for different exceptions.
        // Only the FIRST matching exception block executes.


        // ArithmeticException occurs when dividing by zero
        catch (ArithmeticException e) {
            System.out.println(e + " : Cannot divide by 0");
        }

        // NullPointerException occurs when we try to use an object that is null
        catch(NullPointerException e){
            System.out.println("This is NullPointerException");
        }

        // IndexOutOfBoundsException occurs when array index is invalid
        catch (IndexOutOfBoundsException e ){
            System.out.println(e + " : We are out of array bounds");
        }


        // StackOverflowError occurs due to infinite recursion
        catch (StackOverflowError e){
            System.out.println("StackOverflowError occurred due to recursion");
        }

        // Generic exception handler for all remaining exceptions
        catch (Exception e){
            System.out.println("Exception occurred: " + e.getMessage());
        }

        // Throwable is the parent of both Error and Exception
        // It catches everything but usually not recommended to use
        catch(Throwable e){
            System.out.println("Throwable caught: " + e.getMessage());
        }

        // finally block always executes whether exception occurs or not
        finally {
            System.out.println("Finally block always executes");
        }

        // This line executes after exception handling
        System.out.println("Exception handled successfully");
    }
}
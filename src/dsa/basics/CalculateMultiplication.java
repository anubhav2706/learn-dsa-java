package dsa.basics;
import java.util.*;

public class CalculateMultiplication {

    // Method to multiply two integers
    public static int multiply(int a, int b) {
        int mul = a * b;
        return mul;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Ask the user for two numbers
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        
        // Call the multiply method
        int mul = multiply(a, b);
        
        // Display the result
        System.out.println("The multiplication result is: " + mul);
        
        sc.close();
    }
}
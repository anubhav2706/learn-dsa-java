package dsa.basics.mathematicalOperation;
import java.util.*;

public class CalculateSum {
	
	// Method to calculate sum of two integers
	public static int calculateSum(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Ask the user for two numbers
		System.out.print("Enter the first number: ");
		int a = sc.nextInt();
		
		System.out.print("Enter the second number: ");
		int b = sc.nextInt();
		
		// Call the method and store the result
		int sum = calculateSum(a, b);
		
		// Display the result
		System.out.println("The sum is: " + sum);
		
		sc.close();
	}
}
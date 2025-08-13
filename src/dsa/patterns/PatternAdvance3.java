package dsa.patterns;
import java.util.*;

public class PatternAdvance3 {

	public static void main(String[] args) {
		// Create Scanner object to take user input
		Scanner sc = new Scanner(System.in);

		// Ask user for number of rows
		System.out.print("Enter number of rows: ");
		int r = sc.nextInt();
		
		// Outer loop for each row
		for (int i = 1; i <= r; i++) {
			
			// Print spaces before the numbers
			for (int j = 1; j <= r - i; j++) {
				System.out.print("  ");
			}
			
			// Print numbers and spaces in the pattern
			for (int j = r - i + 1; j <= r + i; j++) {
				if ((i + j) % 2 == 0) {					
					System.out.print(i + " "); // Print the row number
				} else {
					System.out.print("  "); // Print space for gaps
				}
			}
			
			// Move to next line after each row
			System.out.println();
		}
		sc.close();
	}
}
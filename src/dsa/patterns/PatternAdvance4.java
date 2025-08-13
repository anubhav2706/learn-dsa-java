package dsa.patterns;
import java.util.*;

public class PatternAdvance4 {

	public static void main(String[] args) {
		// Scanner object to take user input
		Scanner sc = new Scanner(System.in);

		// Prompt the user to enter the number of rows
		System.out.print("Enter number of rows: ");
		int r = sc.nextInt();

		// Outer loop for rows
		for (int i = 1; i <= r; i++) {
			
			// Printing spaces before numbers
			for (int j = 1; j <= r - i; j++) {
				System.out.print("  ");
			}

			// Printing decreasing sequence (left side)
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}

			// Printing increasing sequence (right side)
			for (int j = 2; j <= i; j++) {
				System.out.print(j + " ");
			}

			// Move to the next line after each row
			System.out.println();
		}
	}
}
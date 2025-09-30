package dsa.patterns;

import java.util.Scanner;

public class PatternAdvance6 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		 int pyramidHeight = n / 2;

	        // --- Top Pyramid ---
	        for (int i = 0; i < pyramidHeight+1; i++) {
	            // spaces before stars
	            for (int j = 0; j < n + 2 - i; j++) {
	                System.out.print(" ");
	            }
	            // stars
	            for (int j = 0; j < (2 * i + 1); j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	        // --- Middle rows ---
	        for (int i = 0; i < n - 1; i++) {
	            System.out.print("e");
	            for (int j = 0; j < n + 1; j++) {
	                System.out.print(" ");
	            }
	            System.out.println("e");
	        }

	        // --- Bottom row ---
	        for (int i = 0; i < n + 3; i++) {
	            System.out.print("e");
	        }
	}

}


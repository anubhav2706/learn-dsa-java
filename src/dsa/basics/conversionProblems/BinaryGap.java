package dsa.basics.conversionProblems;

import java.util.Scanner;

// A Binary Gap is the longest sequence of consecutive 0s surrounded by 1s in the binary representation of a number.

public class BinaryGap {

    // Function to find the longest binary gap
    public static int binaryGap(int n) {
        int maxGap = 0, currentGap = -1;

        while (n > 0) {
            if ((n & 1) == 1) { 
                // If bit is 1
                if (currentGap > maxGap) maxGap = currentGap;
                currentGap = 0; // reset gap counter
            } else if (currentGap != -1) {
                // If bit is 0 (and already saw a 1 before)
                currentGap++;
            }
            n >>= 1; // right shift to check next bit
        }

        return maxGap;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int gap = binaryGap(n);
        System.out.println("Binary representation: " + Integer.toBinaryString(n));

        if (gap > 0)
            System.out.println("Longest Binary Gap = " + gap);
        else
            System.out.println("No Binary Gap found.");

        sc.close();
    }
}

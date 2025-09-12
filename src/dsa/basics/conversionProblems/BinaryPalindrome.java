package dsa.basics.conversionProblems;

import java.util.Scanner;

public class BinaryPalindrome {

    // Function to check if binary string is palindrome
    public static boolean isBinaryPalindrome(int n) {
        String bin = "";
        int temp = n;

        // Convert decimal to binary (manual way, without inbuilt functions)
        while (temp > 0) {
            bin = (temp % 2) + bin;
            temp /= 2;
        }

        // Check palindrome
        int i = 0, j = bin.length() - 1;
        while (i < j) {
            if (bin.charAt(i) != bin.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Binary representation: " + Integer.toBinaryString(n));
        if (isBinaryPalindrome(n))
            System.out.println(n + " → Palindrome in Binary");
        else
            System.out.println(n + " → Not Palindrome in Binary");

        sc.close();
    }
}

package dsa.basics;

import java.util.Scanner;

public class SwapFirstLastDigit {

    // Function to swap first and last digit
    public static int swapDigits(int n) {
        String str = Integer.toString(n);
        if (str.length() == 1) return n; // single digit → no swap

        char[] arr = str.toCharArray();
        char temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

        return Integer.parseInt(new String(arr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int swapped = swapDigits(n);
        System.out.println("After swapping first and last digit: " + swapped);

        sc.close();
    }
}

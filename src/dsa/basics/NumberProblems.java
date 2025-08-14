package dsa.basics;
import java.util.*;

public class NumberProblems {

    // 3. Sum of Digits of a Number
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;  // take last digit
            n /= 10;        // remove last digit
        }
        return sum;
    }

    // 4. Reverse a Number
    public static int reverseNumber(int n) {
        int reversed = 0;
        while (n > 0) {
            int digit = n % 10;          // take last digit
            reversed = reversed * 10 + digit; // append digit
            n /= 10;                     // remove last digit
        }
        return reversed;
    }

  
    public static void main(String[] args) {
    	System.out.print("Please input any number: ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        
        sc.close();

        // Problem 3: Sum of Digits
        int sum = sumOfDigits(n1);
        System.out.println("Input: n = " + n1);
        System.out.println("Output (Sum of Digits): " + sum);

        // Problem 4: Reverse a Number
        int reversed = reverseNumber(n1);
        System.out.println("Input: n = " + n1);
        System.out.println("Output (Reversed Number): " + reversed);
    }
}

package dsa.basics;
import java.util.*;

public class PalindromeCheck {

    public static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for string
        System.out.print("Enter a string to check if it's a palindrome: ");
        String str = sc.nextLine();

        // Input for number
        System.out.print("Enter a number to check if it's a palindrome: ");
        int num = sc.nextInt();

        // Results
        System.out.println(str + " → " + (isPalindrome(str) ? "Palindrome" : "Not Palindrome"));
        System.out.println(num + " → " + (isPalindrome(Integer.toString(num)) ? "Palindrome" : "Not Palindrome"));

        sc.close();
    }
}

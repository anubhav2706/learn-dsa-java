package dsa.basics;

import java.util.*;

public class KaprekarConstant {
    
    // helper: make 4-digit with leading zeros
    private static String formatFour(int n) {
        return String.format("%04d", n);
    }

    // perform Kaprekar process
    public static void kaprekarProcess(int num) {
        if (num < 1000 || num > 9999) {
            System.out.println("Number must be 4-digit.");
            return;
        }

        // check if all digits same (like 1111, stuck at 0)
        String str = String.valueOf(num);
        if (str.chars().distinct().count() == 1) {
            System.out.println(num + " → all digits same, process stuck at 0 ❌ Not Kaprekar processable");
            return;
        }

        System.out.println("Kaprekar process for: " + num);
        int count = 0;

        while (num != 6174) {
            String digits = formatFour(num);

            // descending
            char[] arr = digits.toCharArray();
            Arrays.sort(arr);
            String asc = new String(arr);
            String desc = new StringBuilder(asc).reverse().toString();

            int big = Integer.parseInt(desc);
            int small = Integer.parseInt(asc);
            num = big - small;
            count++;

            System.out.println(desc + " - " + asc + " = " + formatFour(num));

            if (num == 6174) {
                System.out.println("Reached Kaprekar’s Constant 6174 ✅ in " + count + " steps");
                return;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 4-digit number: ");
        int n = sc.nextInt();
        kaprekarProcess(n);
        sc.close();
    }
}

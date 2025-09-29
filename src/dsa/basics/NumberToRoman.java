package dsa.basics;

import java.util.Scanner;

public class NumberToRoman {

    public static String toRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                sb.append(symbols[i]);
                num -= values[i];
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (1 - 3999): ");
        int n = sc.nextInt();

        if (n <= 0 || n > 3999) {
            System.out.println("Roman numerals not defined for this number ❌");
        } else {
            System.out.println(n + " → " + toRoman(n));
        }

        sc.close();
    }
}

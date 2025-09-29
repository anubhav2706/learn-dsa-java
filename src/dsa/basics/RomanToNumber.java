package dsa.basics;

import java.util.Scanner;

public class RomanToNumber {

    public static int romanToInt(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int curr = value(s.charAt(i));

            // Check next character
            if (i + 1 < s.length()) {
                int next = value(s.charAt(i + 1));

                if (curr < next) {
                    result -= curr; // subtract case
                } else {
                    result += curr; // add case
                }
            } else {
                result += curr; // last character always added
            }
        }

        return result;
    }

    private static int value(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0; // invalid char
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Roman numeral: ");
        String roman = sc.next().toUpperCase();

        int number = romanToInt(roman);
        if (number == 0) {
            System.out.println("Invalid Roman numeral ❌");
        } else {
            System.out.println(roman + " → " + number);
        }

        sc.close();
    }
}

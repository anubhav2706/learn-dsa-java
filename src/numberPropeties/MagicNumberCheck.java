package numberPropeties;

import java.util.Scanner;

public class MagicNumberCheck {

    // Function to calculate recursive sum of digits
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    // Function to check Magic Number
    public static boolean isMagicNumber(int num) {
        while (num > 9) {   // repeat until single digit
            num = sumOfDigits(num);
        }
        return num == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isMagicNumber(num)) {
            System.out.println(num + " is a Magic Number.");
        } else {
            System.out.println(num + " is NOT a Magic Number.");
        }

        sc.close();
    }
}

package numberPropeties;

import java.util.Scanner;

public class PronicNumber {

    public static boolean isPronic(int n) {
        for (int i = 0; i <= n; i++) {
            if (i * (i + 1) == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isPronic(n))
            System.out.println(n + " → Pronic Number");
        else
            System.out.println(n + " → Not a Pronic Number");

        sc.close();
    }
}

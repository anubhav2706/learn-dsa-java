package dsa.basics;

import java.util.Scanner;

public class VowelConsonantCount {

    public static void countVC(String str) {
        int vowels = 0, consonants = 0;
        str = str.toLowerCase();
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') { // check only alphabets
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                    vowels++;
                else
                    consonants++;
            }
        }
        System.out.println("The string \"" + str + "\" has:");
        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Call method
        countVC(str);

        sc.close();
    }
}

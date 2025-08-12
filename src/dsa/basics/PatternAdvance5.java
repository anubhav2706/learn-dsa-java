package dsa.basics;
import java.util.*;
public class PatternAdvance5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		
		for(int i = 1; i <= r; i++) {
			for(int j = 1; j <= r-i; j++) {
				System.out.print("  ");
			}
			for(int j = 1; j <= 2*i-1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i = r; i >= 1; i--) {
			for(int j = 1; j <= r-i; j++) {
				System.out.print("  ");
			}
			for(int j = 1; j <= 2*i-1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}

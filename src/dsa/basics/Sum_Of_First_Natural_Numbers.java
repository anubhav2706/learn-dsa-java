package dsa.basics;
import java.util.*;

public class Sum_Of_First_Natural_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter value of n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		int sum = 0;
		while(i <= n) {
			sum = sum + i;
			i++;
		}
		System.out.println(sum);
	}

}

// WAP to print factorial of numbers using recursion.

import java.util.Scanner;

public class RecursionFactorial {
	
	public static int fact(int x) {
		if(x>1) {
			return x * fact(x-1);
		}
		else {
			return 1;
		}
	}
	
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		int x=a.nextInt();
		System.out.println(fact(x));

	}
}

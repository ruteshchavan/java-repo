// WAP to generate Fibonacci Triangle.

import java.util.Scanner;

public class FibonacciTriangle {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int a=0;
		int b=1;
		int c=0;
		System.out.println("Enter the no. of row's :");
		int n=obj.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<2;i++){
			arr[i]=i;
		}
		
		for(int i=2;i<n;i++){
			c=a+b;
			arr[i]=c;
			a=b;
			b=c;
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.println(arr[j] + " ");
			}
			System.out.println();
		}
		
		
	}

}

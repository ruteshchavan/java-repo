import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. to check wether Armstrong no :");
		int a = sc.nextInt();
		 
		int var=num(a);
		if(a==var) {
			System.out.println("Is a Armstrong Number");
		}
		else {
			System.out.println("Not a Armstrong Number");
		}
		
	}

	public static int num(int x) {
		int sum=0;
				
		while(x>0) {
			int x1=x%10;
			sum+=Math.pow(x1,3);
			x/=10;
		}
		
		return sum;
	}
}

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter two no. to find GCD :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int abc=num(a,b);
		System.out.println("GCD of "+a+" & "+b+" is "+abc);
	}
	
	public static int num(int x,int y) {
		int gcd=1;
		int i=2;
		int least= least(x,y);
		while(i<=least) {
			if(x%i==0 && y%i==0) {
				gcd=i;
			}
			i++;
		}
		return gcd;		
	}
	
	public static int least(int a,int b) {
		if(a<b) {
			return a;
		}else {
			return b;
		}
	}
	

}
 
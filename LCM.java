import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter two no. to find LCM :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int abc=num(a,b);
		System.out.println("LCM of "+a+" & "+b+" is "+abc);

	}
	public static int num(int x,int y) {
		int no = 0;
		for(int i=1;i<=(x*y);i++) {
			if(i%x==0 && i%y==0) {
				no=i;
				break;
			}
		}
		return no;
	}
}

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter to your number to generate table :");
		int x=sc.nextInt();
		table(x);
		
	}
		public static void table(int num) {
			for(int i=1;i<=10;i++) {
				System.out.println(num+" X "+i+" = "+(i*num));
			}
			
		}
}

import java.util.Scanner;

public class JupiterNumber {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int x=obj.nextInt();
		int lastdigit=x%10; //stores last digit of input
		int temp=x;
		int rev=0;
		
		// loop to reverse a number a obtain last digit of reverse number.
		
		while(temp>0){
			rev=rev*10 + temp%10;
			temp=temp/10;
		}
		
		int firstdigit=rev%10;
		int sum=firstdigit+lastdigit;
		
		if(x%sum==0) {
			System.out.println("Is a Jupiter Number");
		}else {
			System.out.println("Not a Jupiter Number");
		}
		
		

	}

}

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int x=obj.nextInt();
		String a="";
		int y=x;
		
		while(y>0) {
			int b=y%2;
			y=y/2;
			a=b+a;
			
		}
		
		System.out.println("Binary of "+x+" is : "+a);
	}

}

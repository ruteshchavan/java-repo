import java.util.Scanner;

public class ReverseNumber {
	
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int a=obj.nextInt();
        
        int reverse=0;

        while (a>0) {
            reverse=reverse*10 + a%10;
            a=a/10;
        }
        System.out.println("Reverse Number = "+reverse);
    }
}

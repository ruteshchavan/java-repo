// WAP to sum the digits of given number.
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=obj.nextInt();
        int sum=0;

        while (num>0) { 
            sum=num%10 + sum;
            num/=10;
        }
        System.out.println("Total Sum of digit's : "+sum);
    }
}

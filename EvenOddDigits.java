// WAP to print total number of even and odd digit's.
import java.util.Scanner;

public class EvenOddDigits {
    public static void main(String[] args) {
        
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=obj.nextInt();
        int var=0;
        int odd=0;
        int even=0;

        while (num>0) { 
            var=num%10;
            if (var%2==0) {
               even++; 
            }
            else{
                odd++;
            }
            num/=10;
        }
        System.out.println("Total Even Digit's : "+even);
        System.out.println("Total Odd Digit's : "+odd);
    }
}

// WAP to print fibonacci serie's.
// Fibonacci serie's means sum of two preceding number's.
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number to print upto fibnonacci serie's : ");
        int num=obj.nextInt();
        int a=0;
        int b=1;
        int sum=0;
        System.out.print("Fibonacci Serie's : "+a+" "+b);

        for(int i=2;i<num;i++){
            sum=a+b;
            System.out.print(" "+sum);
            a=b;
            b=sum;
        }

    }
}


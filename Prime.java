// WAP to check wether a no is prime or not.
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the Number to check Prime :");
        int a = obj.nextInt();
        int i;

        for (i=2;i<=a;i++) {
            if (a%i==0) {
                break;
            }
        }
        if(i==a){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a Prime Number");
        }
    }
}

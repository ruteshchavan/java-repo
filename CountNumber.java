// WAP to count the number of digit's.
import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=obj.nextInt();
        int count=0;

        while (num>0) { 
            num/=10;
            count++;
        }
        System.out.println("Total Number of digit's : "+count);
    }
}

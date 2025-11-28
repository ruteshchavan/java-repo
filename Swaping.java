import java.util.Scanner;

public class Swaping {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the values :");
        int a=obj.nextInt();
        int b=obj.nextInt();
        
        System.out.println("Before swapping a="+a+" b="+b);

        int c=a;
        a=b;
        b=c;

        System.out.println("After swapping a="+a+" b="+b);
        
    }
}

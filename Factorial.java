// WAP to print the factorial of a number.

import java.util.*;

public class Factorial{
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter a Number to print a Factorial of it : ");
        int x=obj.nextInt();
        long fact=1;

        for(int i=1;i<=x;i++) {
            fact*=i;
        }
        System.out.println("Factorial of "+x+"!"+" is : "+fact);
    }
}
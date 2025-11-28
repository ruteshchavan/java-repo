// WAP to print the largest number of n number's.

import java.util.Scanner;

public class LargestOfNumber {
    public static void main(String[] args) {
      Scanner obj=new Scanner(System.in);
      System.out.println("Enter the three number's");
      int a,b,c;
      a=b=c=obj.nextInt();

      if (a>b && a>c) {
        System.out.println("Greatest value is : "+a);
    }
      else if(b>a && b>c){
        System.out.println("Greatest value is : "+b);
      }
      else{
        System.out.println("Greatest value is : "+c);
      }
      
    }
}

//WAP to sum the elements of an array.
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int x=obj.nextInt();
        int arr[]=new int[x];
        int sum=0;
        System.out.print("Enter the elemnet's of array : ");

        
        for(int i=0;i<x;i++){
            arr[i]=obj.nextInt();
        }

        for(int a : arr){
            sum+=a;
        }

        System.out.println("Sum of array is : "+sum);
        
    }
}

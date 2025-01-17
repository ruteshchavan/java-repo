import java.util.Scanner;

public class ArrayEvenOdd {
    public static void main(String[] args) {
        
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int x=obj.nextInt();
        int arr[]=new int[x];
        int sum=0;
        System.out.print("Enter the element's of array : ");

        for(int i=0;i<x;i++){
            arr[i]=obj.nextInt();
        }

        // loop to print even elements of array.
        System.out.print("Even elements in Array are : ");
        for(int value:arr){         // enhanced for loop
            if(value%2==0){
                System.out.print(value+" ");
            }
        }

        System.out.println();

        // loop to print odd elements of array.   
        System.out.print("Odd elements in Array are : ");
        for(int value:arr){
            if(value%2!=0){
                System.out.print(value+" ");
            }
        }
        
    }
}

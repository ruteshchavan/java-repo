//WAP to find maximum and minimum element from array.

import java.util.Scanner;

public class ArrayMaxMin {
    public static void main(String[] args) {
        
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size=obj.nextInt();
        int arr[]=new int[size];

        System.out.println("Enter the elements :");
        for(int i = 0; i < size; i++){
            arr[i]=obj.nextInt();
        }

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int var:arr){
            if(var<min){
                min=var;
            }

            if(var>max) {
                max=var;
            }
        }

        System.out.println("Maximum element from array is : "+max);
        System.out.println("Minimum element from array is : "+min);


    }
}


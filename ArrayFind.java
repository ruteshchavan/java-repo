// Take an array as input from user.Search for given number x and print the index at which it occur's. (Linear Search)

import java.util.Scanner;

public class ArrayFind {
    public static void main(String[] args) {
    
        Scanner obj=new Scanner(System.in);
        int arr[]={10,20,30,40,50,60};

        System.out.println("Enter the number to find array element and print the index :");
        int no=obj.nextInt();

        for (int i=0;i<arr.length;i++) {
            if(no==arr[i]) {
                System.out.println(i);
                break;
            }
        }
    }
}

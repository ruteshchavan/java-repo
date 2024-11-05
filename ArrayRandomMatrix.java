// WAP to generate a random array of matrix.

import java.util.Scanner;

public class ArrayRandomMatrix {

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the array size of matrix : ");
        int n=obj.nextInt();
        int m=obj.nextInt();
        int arr[][]=new int[n][m];

        //input
        for(int i=0;i<n;i++){ 
        	for(int j=0;j<m;j++){ 
            arr[i][j]=(int) (Math.random()*100);
        }
     }
        //output
        for(int i=0;i<n;i++){ 
        	for(int j=0;j<m;j++){ 
            System.out.print(arr[i][j]  + " ");
        	}
        System.out.println();
        }
	
	}
}

// Take matrix input from user . Search for a given no. and print the indices at which it occurs.

import java.util.Scanner;

public class ArrayMatrixIndex {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        
        System.out.println("Enter the no of rows and columns for Matrix :");
        int rows=obj.nextInt();
        int columns=obj.nextInt();

        int[][] arr=new int[rows][columns];

        // for array input
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                arr[i][j]=obj.nextInt();
            }
        }
        
        System.out.println();

        // for array output
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();

        // to check whether element is present and print index
        System.out.println("Enter the element to check and print the index of the element :");

        int x=obj.nextInt();
        int i=0;
        int j=0;

        for( i=0;i<rows;i++){
            for(j=0;j<columns;j++){
                if (x==arr[i][j]) {
                    System.out.println("Element found at index :"+"["+i+" "+j+"]");
                    break;
                }
            }
        }
       

    }
}


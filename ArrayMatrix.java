import java.util.Scanner;

public class ArrayMatrix {
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

        // for array output
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}

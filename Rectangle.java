import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter no. of rows and column:");
        int row=obj.nextInt();
        int column=obj.nextInt();

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
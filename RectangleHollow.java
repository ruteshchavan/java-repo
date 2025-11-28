import java.util.Scanner;

public class RectangleHollow {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter no. of rows and column:");
        int row=obj.nextInt();
        int column=obj.nextInt();

        for(int i=1;i<=row;i++){
            for(int j=1;j<=column;j++) {
                if (i==1 || j==1 || i==row || j==column) {
                    System.out.print("* "); 
                     }
                     else{
                        System.out.print("  ");
                     }
                }
             System.out.println();
            }
         
        }
    }

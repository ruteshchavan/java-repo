
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[]=new int[n];

        //input
        for(int i=0;i<n;i++){ 
            arr[i]=obj.nextInt();
        }

        //output
        for(int i=0;i<n;i++){ 
            System.out.println(arr[i]);
        }
    }
}

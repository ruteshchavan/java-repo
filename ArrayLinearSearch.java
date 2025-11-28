import java.util.Scanner;

public class ArrayLinearSearch {
    public static void main(String[] args) {
        
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the sixe of Array : ");
        int n=obj.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the Element's : ");

        //input
        for(int i=0;i<n;i++){ 
            arr[i]=obj.nextInt();
        }

        System.out.print("Enter the Element to be find in Array : ");
        int x=obj.nextInt();
        boolean flag=false; 

        for(int i=0;i<n;i++) {
            if(x==arr[i]){
                flag=true;
                break;
            }
        }

        if(flag==true){
            System.out.println("Element found");
        }
        else {
            System.out.println("Element NOT found");
        }
        
    }
}

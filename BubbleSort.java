import java.util.Scanner;

public class BubbleSort {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter size of array and it's Element's : ");
        int x=obj.nextInt();
        int arr[]=new int[x];

        // array input
        for(int i=0;i<arr.length;i++){
            arr[i]=obj.nextInt();
        }
                                                  
        //bubble sort
        for(int i=0;i<arr.length-1;i++) {

            for(int j=0;j<arr.length-1-i;j++){

                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        printArr(arr);

    }
}

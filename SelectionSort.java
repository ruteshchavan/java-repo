import java.util.Scanner;

public class SelectionSort {

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

        // selection sort
        for(int i=0;i<arr.length-1;i++) {
                int small=i;

            for(int j=i+1;j<arr.length;j++){
                    if(arr[small]>arr[j]){
                        small=j;
                    }     
                }   

                    int temp=arr[small];
                    arr[small]=arr[i];
                    arr[i]=temp;
            }
            printArr(arr);
    }
}
 
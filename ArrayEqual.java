
import java.util.Arrays;

public class ArrayEqual {
    public static void main(String[] args) {
        
        int[] arr1= {1,2,3,4,5};
        int[] arr2= {1,2,3,4,5};

        boolean value=Arrays.equals(arr1,arr2);

        if(value==true){
            System.out.println("Array's are Equal");
        }
        else{
            System.out.println("Array's are NOT equal");
        }
    }
}

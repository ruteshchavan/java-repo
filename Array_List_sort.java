/*
WAP to sort an array.

Another useful class in the java.util package is the Collections class, 
which include the sort() method for sorting lists alphabetically or numerically.

Collection framework is a combination of classes and interfaces.

*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Array_List_sort {
    public static void main(String[] args) {
    Scanner a=new Scanner(System.in);
    ArrayList<Integer> num = new ArrayList<Integer>();
    
    System.out.println("Enter size of array and elements of it :");
    int x=a.nextInt();
    
    // array input and storing it
    for(int i=0;i<x;i++) {
    		num.add(a.nextInt());
    }
    
    // Original array output
    System.out.print("Original Array : "); 
    System.out.println(num);
    
	System.out.println();
    
    // sorted array output
    System.out.print("Sorted Array : "); 
    Collections.sort(num);
    System.out.println(num);
    
    }
}

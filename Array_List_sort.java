/*
WAP to sort an array.

Another useful class in the java.util package is the Collections class, 
which include the sort() method for sorting lists alphabetically or numerically.

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
    for(Integer no : num) {
    	System.out.print(no+" ");
    }
    
	System.out.println();
    
    // sorted array output
    System.out.print("Sorted Array : "); 
    Collections.sort(num);    
    for(Integer no : num) {
    	System.out.print(no+" ");
    	}   
    
    }
}

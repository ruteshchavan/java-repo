import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the String to be reversed : ");
		String a=obj.nextLine();
		
		String[] str=a.split("\\s");
		
		String word="";
		
		for(String s:str){
			StringBuilder x=new StringBuilder(s);
			x.reverse();
			
			word=word+ x.toString()+" ";
		}
		
		System.out.println(word);

	}

}

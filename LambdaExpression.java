/*
It provides a clear and concise way to represent one method interface using an expression. 
Lambda expression provides implementation of functional interface. An interface which has only one abstract method is called functional interface.

*/

interface Sayable{  
    public String say();  
}  

interface Add{
	public int sum(int i , int j);
}

public class LambdaExpression {
	public static void main(String[] args) {
		
		Sayable a = ()-> {
			return ("I have nothing to say...");
		}; 
		System.out.println(a.say()); 
		
		Add b= (i,j) -> i+j;
		int result=b.sum(4,9);
		System.out.println(result);
		
	}
}

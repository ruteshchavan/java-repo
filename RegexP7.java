/*
\w	- Any word character, short for [a-zA-Z_0-9]
\W	- Any non-word character, short for [^\w] 
    
*/



import java.util.regex.Pattern;

public class RegexP7 {

	public static void main(String[] args) {
		
		// single character 
		  	System.out.println(Pattern.matches("\\w", "a"));
	        System.out.println(Pattern.matches("\\w", "9"));
	        System.out.println(Pattern.matches("\\w", "_"));
	        System.out.println(Pattern.matches("\\w", "a9"));   
	        
	    // more than 1 character
	        System.out.println(Pattern.matches("\\w*", "peter_99"));
	        System.out.println(Pattern.matches("\\w*", "peter_99@"));
	        
	        System.out.println(Pattern.matches("\\W", "@"));
	        System.out.println(Pattern.matches("\\W", "a"));
	        System.out.println(Pattern.matches("\\W", "9"));
	        System.out.println(Pattern.matches("\\W", "@@"));
	        	        	        
	        System.out.println(Pattern.matches("\\W*", "@@"));
	        System.out.println(Pattern.matches("\\W*", "@@peter"));

	}

}

/*

\s	-	Any whitespace character, short for [\t\n\x0B\f\r]
\S	-	Any non-whitespace character, short for [^\s]

 */


import java.util.regex.Pattern;

public class RegexP6 {

	public static void main(String[] args) {

		 System.out.println(Pattern.matches("\\s", " "));
	     System.out.println(Pattern.matches("\\s", "\t"));
	     System.out.println(Pattern.matches("\\s", "ab"));
	     System.out.println(Pattern.matches("\\s", "     "));
	     System.out.println(Pattern.matches("\\s*", "       "));
	     
	     System.out.println();
	     
	     System.out.println(Pattern.matches("\\S", "a"));
	     System.out.println(Pattern.matches("\\S", "ab"));
	     System.out.println(Pattern.matches("\\S", " "));
	     System.out.println(Pattern.matches("\\S", "\t"));
	     System.out.println(Pattern.matches("\\S*", "peter"));
	     
	     
	}
}

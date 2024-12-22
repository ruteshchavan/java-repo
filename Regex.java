/*
Regular Expression is an API to define a pattern for searching or manipulating strings.
Regular expressions can be used to perform all types of text search and text replace operations.

Import the java.util.regex package to work with regular expressions.
The package includes the following classes:
Pattern Class - Defines a pattern (to be used in a search).
Matcher Class - Used to search for the pattern.
PatternSyntaxException Class - Indicates syntax error in a regular expression pattern.

*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
	
		Pattern pattern = Pattern.compile("java", Pattern.CASE_INSENSITIVE);  
// The first parameter indicates which pattern is being searched for and 
// the second parameter indicates that the search should be case-insensitive , second parameter is optional.
// Pattern.CASE_INSENSITIVE - The case of letters will be ignored when performing a search.
	   
		Matcher matcher = pattern.matcher("Welcome to world of JAVA!!!!");  // matcher() method is used to search for the pattern in a string.
	    boolean matchFound = matcher.find(); // find() method returns true or false based on pattern found.
	    if(matchFound) {
	      System.out.println("Match found");
	    } 
	    else {
	      System.out.println("Match not found");  
	    }

	}
}


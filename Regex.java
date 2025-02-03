/*
Regular Expression (regex) is an powerful tool for defining patterns that can be used for searching , manipulating and editing strings.
It is widely used to define the constraint on strings such as password and email validation. 
Regular expressions can be used to perform all types of text search and text replace operations.

Import the java.util.regex package to work with regular expressions.
The package includes the following classes:
Pattern Class - Defines a pattern (to be used in a search).
Matcher Class - Used to search for the pattern.
PatternSyntaxException Class - Indicates syntax error in a regular expression pattern.

Brackets are used to find a range of characters:
[abc]	Find one character from the options between the brackets
[^abc]	Find one character NOT between the brackets
[0-9]	Find one character from the range 0 to 9

Quantifiers define quantities:
X? - X occurs once or not at all
X+ - X occurs once or more times
X* - X occurs zero or more times
X{n} - X occurs n times only
X{n,} - X occurs n or more times
X{y,z} - X occurs at least y times but less than z times

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


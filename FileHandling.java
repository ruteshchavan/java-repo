/*
The File class from the java.io package, allows us to work with files.
To use the File class, create an object of the class, and specify the filename or directory name:
*/

import java.io.File;
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.PrintWriter;  // write content into the file 


public class FileHandling {
	public static void main(String args[] ) {
		
// To create a file in Java, you can use the createNewFile() method.
		try {
		File simple=new File("empty.txt");
		
		if(!simple.exists()) {
			simple.createNewFile();
			}
		
		PrintWriter p= new PrintWriter(simple);
		p.println("this is new content");
		p.println(1000);
		p.close();  // close the file
		System.out.println("File created..");
		}
		
		catch(IOException e) {
			System.out.println(e);
		}
	}
}
	
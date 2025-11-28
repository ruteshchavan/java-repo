/* Program to get more information about the file.

File methods :
getName() - String Returns the name of the file.(String)
getAbsolutePath() - Returns the absolute pathname of the file.(String)
canWrite() - Tests whether the file is writable or not.(Boolean)
canRead() - Tests whether the file is readable or not.(Boolean)
length() - Returns the size of the file in bytes.(Long)
exists() - Tests whether the file exists.(Boolean)
delete() - Deletes a file.(Boolean)

*/
import java.io.File;

public class FileInfo {

	public static void main(String[] args) {
		
		File a=new File("empty.txt");
		if(a.exists()) {
			System.out.println("File name: " + a.getName());   
		      System.out.println("Absolute path: " + a.getAbsolutePath());
		      System.out.println("Writeable: " + a.canWrite());
		      System.out.println("Readable " + a.canRead());
		      System.out.println("File size in bytes " + a.length());
		}
		else {
			System.out.println("File dosen't exists...");
		}
	}

}

import java.io.BufferedReader;  // used to store the data.
import java.io.FileReader;  // used to read the file.
import java.io.IOException;


public class FileRead {

	public static void main(String[] args) {
		BufferedReader a=null;
		
		try {
			a=new BufferedReader(new FileReader("empty.txt"));
			String line;
			
			while((line=a.readLine()) != null) {
				System.out.println(line);
			}
			
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally {
			try {
				a.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
			
	}

}
	
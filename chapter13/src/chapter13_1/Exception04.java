package chapter13_1;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exception04 {
	public static void main(String [] args) {
	
		try {
			FileReader file = new FileReader("a.txt");
			int i;
			while (( i = file.read()) != -1) {
				System.out.println((char)i);
				
			}
file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
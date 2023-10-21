package File_Input_Output;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("demo.txt");
			int data = fis.read();
			System.out.println((char)data);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}						
	}
}

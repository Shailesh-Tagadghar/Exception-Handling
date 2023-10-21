package File_Input_Output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoForWrite {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new  FileOutputStream("file1.txt");
			fos.write(65);
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}

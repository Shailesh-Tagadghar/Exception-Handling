package First;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionMethods {
	public static void main(String[] args) {
		ExceptionMethods em = new ExceptionMethods();	
		em.demo();
	}
	
	public void demo() {
		try {
			FileInputStream fis = new FileInputStream("file1.txt");
		} catch (FileNotFoundException e) {
			System.out.println("Class : "+e.getClass());
			System.out.println("Message : "+e.getMessage());
			
			e.printStackTrace(); //developers, to track the exception, with all details
			System.err.println("sorry, the file you are tryimg to open is does not exit");
		}
	}
}

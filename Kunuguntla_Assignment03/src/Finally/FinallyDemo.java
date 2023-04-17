package Finally;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream file = null;
		try {
			System.out.println("Inside try block");
			file = new FileInputStream("finally.txt");

		} catch (FileNotFoundException f){
			// handle exception 
			System.out.println("file not found");
			
		} finally {
			try {
				file.close();
			} catch(IOException o) {
			System.out.println("ioexception");	
			}
		}
		
	}

}

package Unchecked_Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileReader fr = null;
		try {
			 fr = new FileReader("D:\\Github.txt");
			}catch(FileNotFoundException e)
		{
				e.printStackTrace();
				
		}
		finally {
		try {
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	

}

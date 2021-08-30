package Checked_exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileReader fr = new FileReader("C:\\demo.txt");
		}catch(FileNotFoundException f)
		{
			f.printStackTrace();
		}
		
	}

}

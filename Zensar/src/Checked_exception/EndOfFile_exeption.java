package Checked_exception;

import java.io.DataInputStream;
import java.io.FileInputStream;





public class EndOfFile_exeption {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		DataInputStream dis = new DataInputStream(new FileInputStream("D:\\Zensar.txt"));
	
		while(true)
		{
			char ch;
			ch=dis.readChar();
			System.out.print(ch);
		}
	}

}

package Unchecked_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Multiple_exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two nos:- ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		try {
			int add=x+y;
			System.out.println("Addition is:- "+add);
			int mul=x*y;
			System.out.println("Multiplocation is:- "+mul);
			int div =x/y;
			System.out.println("Division is:- "+div);
			
		}catch( InputMismatchException i)
		{
			i.printStackTrace();
	
		}catch(ArithmeticException a)
		{
			System.out.println("ArithmeticException occured");
			a.printStackTrace();
		}
		/*catch(Exception e)
		{
			e.printStackTrace();
		}*/
		finally
		{
			System.out.println("Thank you!!");
		}
		
	}

}

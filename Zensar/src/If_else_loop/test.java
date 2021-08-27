package If_else_loop;

import java.util.Scanner;

public class test
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter any no to check 3 digit or not:-  ");
		int digit = sc.nextInt();
		
		if(digit>=100 && digit<=999)
		{
			System.out.println("No is 3 digit no");
			int num1=digit%10;
			int num2=digit/100;
			System.out.println(num1);
			System.out.println(num2);
			System.out.println("Addition is :- "+(num1+num2));
			
		}else
		{
			System.out.println("No is not 3 digit no");
		}
		sc.close();
	}

}

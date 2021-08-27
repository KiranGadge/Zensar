package Switchcase;

import java.util.Scanner;

public class Switchdemo
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter any no :-  ");
		int digit = sc.nextInt();
		
		switch(digit)
		{
			case 1:
				System.out.println("one");
				break;
			case 2:
				System.out.println("two");
				break;
			case 3:
				System.out.println("three");
				break;
			case 4:
				System.out.println("four");
				break;
			case 5:
				System.out.println("five");
				break;
			default:
				System.out.println("Wrong input!!");
		}
		sc.close();
	}

}

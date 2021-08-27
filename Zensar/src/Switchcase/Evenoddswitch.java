package Switchcase;

import java.util.Scanner;

public class Evenoddswitch
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no to check even or odd:- ");
		int num = sc.nextInt();
		
		switch(num)
		{
		case 1:
				System.out.println("odd");
			    break;
		case 2:
				System.out.println("even");
				break;
		case 3:
			System.out.println("odd");
			break;
		case 4:
			System.out.println("even");
		}
		sc.close();
	}

}

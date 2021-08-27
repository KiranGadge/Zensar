package Switchcase;

import java.util.Scanner;

public class Days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter your choice:- ");
		int ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tueday");
			break;
		case 3:
			System.out.println("Wednsday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("error!! day does not exist");
		}
		sc.close();
	}

}

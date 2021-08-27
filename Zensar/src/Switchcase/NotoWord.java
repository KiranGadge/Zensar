package Switchcase;

import java.util.Scanner;

public class NotoWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter No:- ");
		int no=sc.nextInt();
		
		/*if(no>=1 && no<=5)
		{
			
		}else
		{
			System.out.println("Please enter no between 1 to 5!");
		}
		*/
		switch(no)
		{
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		default:
			System.out.println("Please enter no between 1 to 5!");
		}
		sc.close();
	}

}

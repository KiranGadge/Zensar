package Switchcase;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("********Menu********");
		System.out.println("1.Check balance 2.Deposite  3.withdraw");
		int ch = sc.nextInt();
		int balance=50000;
		
		switch(ch)
		{
		case 1:
			System.out.println("Your balance is:- "+ balance);
			break;
		case 2:
			System.out.println("Enter amount to deposite:-");
			int add = sc.nextInt();
			int dept = add + balance;
			System.out.println("Your balance after deposite is :- "+ dept);
			break;
		case 3:
			System.out.println("Enter amount to withdraw:- ");
			int sub = sc.nextInt();
			
			if(sub < balance)
			{
				int withdraw = balance - sub;
				System.out.println("Your balance after withdraw is:- "+withdraw);
			}else
			{
				System.out.println("No sufficient balance");
			}
			break;
		default:
			System.out.println("Invalid choice");
			
		}
		sc.close();
	}

}

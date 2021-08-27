package Oops;

import java.util.Scanner;
//display method is not working for default constructor
public class Account {

	private int accno;
	private String holder_name;
	private int balance;
	Scanner sc = new Scanner(System.in);
	Account(int accno,String holder_name,int balance)
	{
		this.accno=accno;
		this.holder_name=holder_name;
		this.balance=balance;
		System.out.println("Im in parameterised constructor");
	}
	/*Account()
	{
		
	}*/
	

	void insert()
	{
		System.out.println("Enter your account no:- ");
		accno = sc.nextInt();
		System.out.println("Enter holder name:- ");
		holder_name = sc.next();
	}
	void display()
	{
		System.out.println("your account no is:- "+accno);
		System.out.println("your name is:- "+holder_name);
	}
	void checkbalance()
	{
		System.out.println("Your balance is:- "+balance);
		
	}
	
	void deposite()
	{
		System.out.println("Enter amount to deposite:- ");
		int deposite = sc.nextInt();
		int dep = balance + deposite;
		System.out.println("Balance after deposite:- "+dep);
	}
	
	void withdraw()
	{
		
		System.out.println("Enter amount to withdraw:- ");
		int withdraw = sc.nextInt();
		if(withdraw <balance)
		{
			int wd=balance - withdraw;
			System.out.println("Balance after withdraw is:- "+wd);
		}else
		{
			System.out.println("you have insufficient balance");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Account acc= new Account();
		acc.insert();
		acc.display();
		acc.deposite();
		acc.checkbalance();
		acc.withdraw();*/
		Account acc1 = new Account(10,"ABC",500000);
		Account acc2 = new Account(11,"XYZ",50000);
		acc1.display();
}
}

package Switchcase;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc =  new Scanner(System.in);
	System.out.println("Enter your choice:- ");
	String str = sc.nextLine();
	switch(str)
		{
		case "one":
			System.out.println("1");
			break;
		case "two":
			System.out.println("2");
			break;
		case "three":
			System.out.println("3");
			break;
		default:
			System.out.println("Error!!");
		}
	sc.close();
	}

}

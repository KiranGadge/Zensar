package Switchcase;

import java.util.Scanner;

public class MonthDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any month:- ");
		String month = sc.nextLine();
		
		switch(month)
		{
		case "jan":
		case "mar":
		case "may":
		case "jul":
		case "aug":
		case "oct":
		case "dec":
			System.out.println("31 days");
			break;
		case "feb":
			System.out.println("Enter year:-");
			int yr = sc.nextInt();
			if(yr %4==0)
			{
				System.out.println("29 days");
			}
			else
			{
				System.out.println("28 days");
			}
			break;
		
		case "apr":
		case "jun":
		case "sep":
		case "nov":
			System.out.println("30 days");
			break;
			default:
				System.out.println("Invalid!!");
		}
		sc.close();
	}

}

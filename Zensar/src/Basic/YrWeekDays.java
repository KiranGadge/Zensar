package Basic;

import java.util.Scanner;

public class YrWeekDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no to convert:- ");
		int no = sc.nextInt();
		
		int year,week,days;
		final int days_in_week = 7;
		year = no/365;
		week = (no % 365) / days_in_week;
		days = (no % 365) % days_in_week;
		
		System.out.println("Years:- "+year);
		System.out.println("Weeks:- "+week);
		System.out.println("Days:- "+days);
		sc.close();
	}

}

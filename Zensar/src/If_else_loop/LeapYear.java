package If_else_loop;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year to check:- ");
		int yr = sc.nextInt();
		
		if(yr%4==0)
		{
			System.out.println("This is a leap year");
		}else
		{
			System.out.println("This is not a leap year");
		}
		sc.close();
	}

}

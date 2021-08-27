package Switchcase;

import java.util.Scanner;

public class Greater_in2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two  no to check greater:- ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a>b)
		{
			System.out.println(a+" is greater");
		}else 
		{
			System.out.println(b+" is greater");
		}
		sc.close();
	}

}

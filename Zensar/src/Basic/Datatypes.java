package Basic;

import java.util.Scanner;

public class Datatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three nos to add:- ");
		int no1 = sc.nextInt();
		byte no2 = sc.nextByte();
		short no3 = sc.nextShort();
		System.out.println("Enter your name:- ");
		String name = sc.next();
		System.out.println("Enter your age:- ");
		int age = sc.nextInt();
		System.out.println("Enter your height:- ");
		float ht = sc.nextFloat();
		System.out.println("Enter your gender:-(M/F) ");
		char gender = sc.next().charAt(0);
		System.out.println("Enter your mobile no:- ");
		long mob = sc.nextLong();
		System.out.println("Are you developer?? ");
		boolean value = sc.hasNextBoolean();
		
		
		System.out.println("Addition of nos is:- "+(no1+no2+no3));
		System.out.println("Name is:- "+name);
		System.out.println("Age is :- "+age);
		System.out.println("Height is:- "+ht);
		System.out.println("Gender is:- "+gender);
		System.out.println("Mobile no is:- "+mob);
		System.out.println("You are developer??" +value);
		sc.close();
	}

}

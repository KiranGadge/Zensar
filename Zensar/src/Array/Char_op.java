package Array;

import java.util.Scanner;

public class Char_op {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:- ");
		String str = sc.nextLine();
		System.out.println("Which char occurance you want to check??");
		char ch = sc.next().charAt(0);
		
		System.out.println("First occurance of"+ch+" is:- "+str.indexOf(ch));
		System.out.println("Last occurance of"+ch+" is:- "+str.lastIndexOf(ch));
		System.out.println("Enter a string to trim white spaces:- ");
		String str2 =sc.next();
		String s =str2.trim();
		System.out.println("After triming white spaces:- "+s);
	}

}

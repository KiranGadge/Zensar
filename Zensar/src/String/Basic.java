package String;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1= "Kiran";
		System.out.println(s1);
		
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string:- ");
		String str = sc.nextLine();
		String s2=str.toUpperCase();
		System.out.println("Upper case:- "+s2);
		
		String s3 =str.toLowerCase();
		System.out.println("Lower case:- "+s3);
		
		char last =str.charAt(str.length()-1);
		System.out.println("Last letter of string is:- "+last);
		
		System.out.println("Index of r is:- "+s1.indexOf('r'));
		
		String subs = str.substring(2);
		CharSequence ss = s1.subSequence(0,3);
		System.out.println("CharSequence:- "+ss);
		
		System.out.println("Sub string:- "+subs);
		
		System.out.println("computer".endsWith("ter"));
		System.out.println("Welcome".startsWith("W"));
		
	}

}

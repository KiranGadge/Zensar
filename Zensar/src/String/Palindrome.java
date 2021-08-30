package String;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter string:- ");
		String str = sc.next();

		str=str.toLowerCase();
		int end=str.length()-1;
		int flag=1;
		for(int start=0;start<end;start++)
		{
			if(str.charAt(start)!=str.charAt(end))
			{
			flag=0;
			break;
			}
			end--;
		}
		if(flag==1)
			System.out.println("Palindrome");
		else
			System.out.println("Not palindrome");
		
	}

}

package String;

import java.util.Scanner;

public class Reverse_string {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter string:- ");
		String str = sc.next();
		
		char []arr=str.toCharArray();
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(arr[i]);
		}System.out.println();
		
		
	}
	
}


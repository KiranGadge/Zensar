package WhileLoop;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no to check palindrome:- ");
		int no = sc.nextInt();
		
		int  a = no;
		int reverse = 0;
		
		while(no>0)
		{
			int r = no%10;
			reverse = reverse*10+r;
			no = no/10;
		}
		if (reverse == a)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}

	}

}

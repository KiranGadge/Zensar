package WhileLoop;

import java.util.Scanner;

public class CountOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no to count digits:- ");
		int n = sc.nextInt();
		
		int a = n;
		int c = 0;
		while(n>0)
		{
			c++;
			n = n/10;
		}
		System.out.println(c);
	}

}

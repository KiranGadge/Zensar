package WhileLoop;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter no to check Armstrong no:- ");
		int n = sc.nextInt();
		
		int a = n;
		int c = 0;
		while(n>0)
		{
			c++;
			n = n/10;
		}
		n=a;
		int sum = 0;
		while(n>0)
		{
			int r = n%10;
			sum = sum +(int)Math.pow(r, c);
			n = n/10;
		}
		if(sum ==a)
		{
			System.out.println("Armstrong no");
		}else
		{
			System.out.println("Not Armstrong no");
		}
	}

}

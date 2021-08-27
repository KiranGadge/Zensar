package Forloop;

import java.util.Scanner;
//check prime no or not
public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no to check prime:-");
		int num =sc.nextInt();
		boolean flag=true;
		
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println("num is prime");
		else
			System.out.println("num is not prime");
		sc.close();
	}

}

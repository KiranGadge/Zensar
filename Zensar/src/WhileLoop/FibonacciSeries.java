package WhileLoop;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of terms:- ");
		int n = sc.nextInt();
		int n1=0,n2=1;
		int i=1;
		while(i<=n)
		{
			System.out.println(n1+" ");
			int n3 = n1+n2;
			n1=n2;
			n2=n3;
			i++;
		}
		
	}

}

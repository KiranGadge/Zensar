package Forloop;

import java.util.Scanner;

public class Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//program for 1 3 7 15 31 63
		/*System.out.println("Enter no of terms:- ");
		int n = sc.nextInt();
		
		int t=0;
		for(int i=0;i<=n;i++)
		{
			 t=t*2+1;
			System.out.println(t);
		}*/

		//factorial
		/*System.out.println("Enter a no for factorial:- ");
		int no = sc.nextInt();
		int fact=1;
		for(int i=1;i<=no;i++)
		{
			 fact =fact*i;
		}
		System.out.println(fact);
		 sc.close();
		 */
		//factorial series
		 System.out.println("Enter a no for factorial series:- ");
			int no = sc.nextInt();
			int fact;
			for(int i=1;i<=no;i++)
			{
				fact=1;
				for(int j=1;j<=i;j++)
				{
					fact=fact*j;
				}
				System.out.println(fact);
			}
			sc.close();
	}

}

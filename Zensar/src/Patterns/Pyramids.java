package Patterns;

import java.util.Scanner;

public class Pyramids {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the no of rows: ");
		//int row = sc.nextInt();
		//
		/*
		    *
		   ***
		  *****
		 *******
		*********
		 
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row-i;j++)
				System.out.print(" ");
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}*/
	//************************************		
		/*
		 
		 	1
			12
			123
			1234
			12345
		 
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}*/
		
	//************************************************
		/*
		* 
		* * 
		* * * 
		* * * * 
		* * * * *
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	  */
		//************************************************
		/*
		* * * * * 
		* * * * 
		* * * 
		* * 
		*
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}*/
	//************************************************************	
	/*
		   * 
         * * 
       * * * 
     * * * * 
   * * * * *
	*/
		
		int row=5;
		for(int i=0;i<row;i++)
		{
			for(int j=2*(row-i);j>=0;j--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
		
	}

}

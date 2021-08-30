package Array_2D;

import java.util.Scanner;

public class Diagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows and cols for square matrix:- ");
		int r = sc.nextInt();
		int c = sc.nextInt();
		
		
		int [][] arr = new int[r][c];
		for(r=0;r<arr.length;r++)
		{
			System.out.println("Enter elements for row "+r);
			for(c=0;c<arr[0].length;c++)
			{
				arr[r][c] = sc.nextInt();
			}
		}
		System.out.println("Primary diagonal elements are:- ");
		for(r=0;r<arr.length;r++)
		{
			for(c=0;c<arr[0].length;c++)
				if(r==c)
				{
					System.out.print(arr[r][c]+" ");
				}
		}System.out.println();
		System.out.println("Secondary diagonal elements are:- ");
		for(r=0;r<arr.length;r++)
		{
			for(c=0;c<arr[0].length;c++)
				if((r+c)==(arr.length-1))
				{
					System.out.print(arr[r][c]+" ");
				}
		}System.out.println();
	}

}

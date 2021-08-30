package Array_2D;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr =new int [2][3];
		System.out.println("No of rows:-"+arr.length);
		System.out.println("No of columns:- "+arr[0].length);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows and cols:- ");
		int r = sc.nextInt();
		int c = sc.nextInt();
		
		for(r=0;r<arr.length;r++)
		{
			System.out.println("Enter elements for row "+r);
			for(c=0;c<arr[0].length;c++)
			{
				arr[r][c] = sc.nextInt();
			}
		}
		for(r=0;r<arr.length;r++)
		{
			for(c=0;c<arr[0].length;c++)
			{
				System.out.print(arr[r][c]);
			}
			System.out.println();
		}

	}

}

package Array_2D;

import java.util.Scanner;

public class Jagged_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] [] a= new int[3][];
		a[0] = new int[4];
		a[1] = new int[2];
		a[2] = new int[3];
		
		Scanner sc = new Scanner(System.in);
		for(int r=0;r<a.length;r++)
		{
			System.out.println("Enter "+a[r].length+" elements for row "+r);
			for(int c=0;c<a[r].length;c++)
			{
				a[r][c] =sc.nextInt();
			}
		}
		for(int[] x:a)
		{
			for(int d:x)
			{
				System.out.print(d);
			}
			System.out.println();
		}
	}

}

package Forloop;

import java.util.Scanner;

public class TableofNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter any no:- ");
		int num = sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			int j=num*i;
			System.out.println(j);
		}
		sc.close();
	}

}

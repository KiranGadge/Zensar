package Array;

import java.util.Scanner;
public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int [5];
		System.out.println("Enter numbers to place in array:- ");
		
		for(int i=0;i<5;i++)
		{
			arr [i] = sc.nextInt();
		}
		System.out.println("Asending order:-");
		for(int i=0;i<5;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Desending order:-");
		for(int i=4;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Alternate nos:-");
		for(int i=0;i<5;i=i+2)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("************************");
		for(int i=1;i<5;i+=2)
		{
			System.out.println(arr[i]+" ");
		}
	}

}

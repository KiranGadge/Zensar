package Array;

import java.util.Scanner;

public class Linear_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:- ");
		int size = sc.nextInt();
		int [] a = new int[size];
		System.out.println("Enter "+a.length+" nos:- ");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter search element:- ");	
		int search=sc.nextInt();
		int found=0;
		for(int i=0;i<a.length;i++)
		{
			if(search==a[i])
			{   found=1;
				System.out.println("Element present at position:- "+i);
			}
			
		}
		
		
		if(found==0)
			System.out.println("element not present");


	}

}

package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:- ");
		int size = sc.nextInt();
		int [] a =new int[size];
		
		System.out.println("Enter "+a.length+" elements:- ");
		for(int i=0;i<5;i++)
		{
			a [i] = sc.nextInt();
		}
	System.out.println("Desending sorting:- ");	
	for(int k=0;k<a.length;k++)
	{
		int flag=0;
		for(int j=0;j<a.length-1-k;j++)
		{
			if(a[j]<a[j+1])
			{
				flag=1;
				int t=a[j];
				a[j]=a[j+1];
				a[j+1]=t;
			}
		}
		
		if(flag==0)
		{
			break;
		}
		System.out.println(Arrays.toString(a));
	}
	System.out.println("Asending sorting:- ");	
	for(int k=0;k<a.length;k++)
	{
		int flag=0;
		for(int j=a.length-1-k;j>0;j--)
		{
			if(a[j]<a[j-1])
			{
				flag=1;
				int t=a[j];
				a[j]=a[j-1];
				a[j-1]=t;
			}
		}
		
		if(flag==0)
		{
			break;
		}
		System.out.println(Arrays.toString(a));
	}
	
	}

}

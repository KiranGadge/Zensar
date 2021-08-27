package Array;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:- ");
		int size = sc.nextInt();
		int [] arr = new int[size];
		System.out.println("Enter "+arr.length+" nos:- ");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(min >arr[i])
				arr[i]=min;
		}
		System.out.println("Minimum no is:- "+min);
		
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max < arr[i])
				max=arr[i];
		}
		System.out.println("Maximum no is:- "+max);
	}

}

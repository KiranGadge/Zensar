package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_search {

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
		
		System.out.println("Enter search element:- ");	
		int key=sc.nextInt();
		//System.out.println(Arrays.binarySearch(arr, key));
		
		
	}

}

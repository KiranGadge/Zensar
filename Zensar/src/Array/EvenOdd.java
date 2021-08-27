package Array;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:- ");
		int size = sc.nextInt();
		int [] arr =new int[size];
		
		System.out.println("Enter "+arr.length+" elements:- ");
		for(int i=0;i<5;i++)
		{
			arr [i] = sc.nextInt();
		}
		int p=0,n=0,e=0,o=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
				e++;
			else
				o++;
			if(arr[i]>=0)
				p++;
			else
				n++;
		}
		System.out.println("Positive nos :- "+p);
		System.out.println("Negative nos :- "+n);
		System.out.println("Even nos :- "+e);
		System.out.println("Odd nos :- "+o);
	}


}

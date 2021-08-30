package Array;

import java.util.Scanner;

public class Average {
	
	public static int avg(int [] array)
	{
		int avg=0,sum=0;
		for(int i=0;i<array.length;i++)
		{
			sum=sum+array[i];
		}
		avg=sum/array.length;
		System.out.println("Average is :- "+avg);
		return avg;
	}
	
	public static double avg(double [] array)
	{
		double avg=0,sum=0;
		for(int i=0;i<array.length;i++)
		{
			sum=sum+array[i];
		}
		avg=sum/array.length;
		System.out.println("Average is :- "+avg);
		return avg;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:- ");
		int size = sc.nextInt();
		int [] array = new int[size];
		
		System.out.println("Enter "+array.length+" nos:- ");
		
		for(int i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
		}
		
		Average a = new Average();
		a.avg(array);
		System.out.println("Enter size of array:- ");
		int size1 = sc.nextInt();
		double [] arr = new double[size1];
		System.out.println("Enter "+arr.length+" nos:- ");
		for(double j=0;j<arr.length;j++)
		{
			arr[(int) j]=sc.nextDouble();
		}
		a.avg(arr);
		
	}

}

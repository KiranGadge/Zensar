package String;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = {"Kiran","Gadge","Zensar"};
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].compareTo(arr[j])>0)
				{
					String t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
				
			}
			
		}System.out.println(Arrays.toString(arr));
		
	}

}

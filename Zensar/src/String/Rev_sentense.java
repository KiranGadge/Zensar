package String;

import java.util.Scanner;

public class Rev_sentense {

	static String reverse(String str)
	{
		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--)
		{
			reverse = reverse + str.charAt(i);
		}

		return reverse;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:- ");
		String s = sc.next();

		String[] arr = s.split(" ");

		for (int i = 0; i < arr.length; i++)
		{
			String s1 = reverse(arr[i]);
			System.out.print(s1 + " ");
			
		}

	}

}

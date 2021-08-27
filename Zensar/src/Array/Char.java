package Array;

import java.util.Scanner;

public class Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter characters to check:- ");
		
		char [] ch = new char [5];
		
		int c=0;
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=sc.next().charAt(0);
		}
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a' || ch[i]=='o' || ch[i]=='i' || ch[i]=='e' || ch[i]=='u')
			{
				c++;
			}
		}
		
		System.out.println(c);

	}

}

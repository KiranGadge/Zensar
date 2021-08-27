package If_else_loop;

import java.util.Scanner;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

				System.out.println("Enter any no to check divisible by 5 and 11:- ");
				int no = sc.nextInt();
				
				if(no%5==0 && no%11==0)
				{
					System.out.println("No is divisible by 5 and 11");
				}else
				{
					System.out.println("No is not divisible by 5 and 11");
				}
			//*************************************************************
				System.out.println("Enter any three nos to check greater no:- ");
				int a= sc.nextInt();
				int b= sc.nextInt();
				int c= sc.nextInt();
				
				if(a>b && a>c)
				{
					System.out.println(a+ " is a greater no");
				}else if(b>a && b>c)
				{
					System.out.println(b+ " is a greater no");
				}else
				{
					System.out.println(c+ " is a greater no");
				}
			//*****************************************************************
				System.out.println("Enter a character to check vowel / consonant:- ");
				char ch = sc.next().charAt(0);
				
				if(ch=='A'|| ch=='a'||ch=='E'|| ch=='e'||ch=='I'|| ch=='i'||ch=='O'|| ch=='o'||ch=='U'|| ch=='u')
				{
					System.out.println("It is a vowel");
				}else
				{
					System.out.println("It is a consonant");
				}
			//*****************************************************************
				System.out.println("Enter a no to check positive / negative /zero:- ");
				int num= sc.nextInt();
				
				if(num==0)
				{
					System.out.println("No is ZERO");
				}else if(num<0)
				{
					System.out.println("No is NEGATIVE");
				}else if(num>0)
				{
					System.out.println("No is POSITIVE");
				}
			//*****************************************************************
				System.out.println("Enter a character to check alphabet / digit /special char");
				char chh = sc.next().charAt(0);
				
				if((chh>='a'&& chh>='z') || (chh>='A'&& chh>='Z'))
				{
					System.out.println("This is a alphabet");
				}else if(chh>='0' && chh<='9')
				{
					System.out.println("This is a digit");
				}else
				{
					System.out.println("This is a special charater");
				}
				
			//*****************************************************************	
				System.out.println("Enter no to check even or odd:- ");
				int n = sc.nextInt();
				
				if(n%2==0)
				{
					System.out.println("This no is even no");
				}else
				{
					System.out.println("This no is odd no");
				}
			//******************************************************************
				System.out.println("Enter any no to check 3 digit or not:-  ");
				int digit = sc.nextInt();
				
				if(digit>=100 && digit<=999)
				{
					System.out.println("No is 3 digit no");
					int num1=digit%10;
					int num2=digit/100;
					System.out.println(num1);
					System.out.println(num2);
					System.out.println("Addition is :- "+(num1+num2));
					
				}else
				{
					System.out.println("No is not 3 digit no");
				}
				sc.close();
	}

}

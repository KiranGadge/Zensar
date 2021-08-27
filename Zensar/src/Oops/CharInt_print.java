package Oops;

public class CharInt_print {

	void print(int a ,char ch)
	{
		System.out.println("Integer is:- "+a);
		System.out.println("Character is:- "+ch);
	}

	void print(char ch,int a)
	{
		System.out.println("Character is:- "+ch);
		System.out.println("Integer is:- "+a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		CharInt_print Ch = new CharInt_print();
		Ch.print(5,'K');
		Ch.print('G',10);
	}

}

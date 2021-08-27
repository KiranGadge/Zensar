package Oops;

public class Account2 {

	public long accno;
	public String Name;
	
	Account2()
	{
		long accno = 101;
		String Name = "kiran";
		System.out.println("Im in default constructor");
		System.out.println(accno);
		System.out.println(Name);
	}
	Account2(long accno,String Name)
	{
		this.accno = accno;
		this.Name = Name;
		System.out.println("Im in parameterised constructor");
		System.out.println("Accno:- "+accno+" "+"name:- "+Name);
	}
	public static void main(String[] args) {
		Account2 acc2 = new Account2(102,"gadge");
		Account2 acc1 = new Account2();
	}
}

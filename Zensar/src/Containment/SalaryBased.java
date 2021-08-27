package Containment;

public class SalaryBased extends Teacher{

	int salary;
	
	SalaryBased()
	{
		
	}

	public SalaryBased(int salary) {
		super();
		this.salary = salary;
	}
	
	void salary()
	{
		System.out.println("In SalaryBased class salary method");
	}
}

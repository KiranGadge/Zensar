package Containment;

public class HourlyBased extends Teacher {

	private int rate_per_hr;
	private int hrs;
	
	public HourlyBased(int rate_per_hr, int hrs) {
		super();
		this.rate_per_hr = rate_per_hr;
		this.hrs = hrs;
	}
	
	public HourlyBased() {
		
	}

	void salary()
	{
		System.out.println("In HourlyBased class salary method");
	}
}

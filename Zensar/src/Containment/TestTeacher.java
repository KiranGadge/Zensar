package Containment;

public class TestTeacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HourlyBased hb = new HourlyBased();
		hb.salary();
		SalaryBased sb = new SalaryBased(10000);
		sb.salary();
		
		System.out.println("********************************");
		Teacher t =new SalaryBased();
		t.salary();
		Teacher t2 = new HourlyBased(5,10);
		t.salary();
		
	}

}

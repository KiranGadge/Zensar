package Set;

import java.util.Comparator;

public class Emp {


		private int empid;
		private String empname;
		private int salary;
		
		Emp()
		{
			
		}

		public Emp(int empid, String empname, int salary) {
			super();
			this.empid = empid;
			this.empname = empname;
			this.salary = salary;
		}

		public int getEmpid() {
			return empid;
		}

		public void setEmpid(int empid) {
			this.empid = empid;
		}

		public String getEmpname() {
			return empname;
		}

		public void setEmpname(String empname) {
			this.empname = empname;
		}

		public int getSalary() {
			return salary;
		}

		public void setSalary(int salary) {
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "Emp has--> empid=" + empid + ", empname=" + empname + ", salary=" + salary ;
		}
}

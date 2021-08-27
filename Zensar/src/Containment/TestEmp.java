package Containment;

import java.util.Scanner;

public class TestEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Emp emp = new Emp();
		System.out.println("Enter emp id,emp name,salary");
		int id = sc.nextInt();
		String name =sc.next();
		int sal = sc.nextInt();
		emp.setEid(id);
		emp.setName(name);
		emp.setSalary(sal);
		
		System.out.println("Enter your deptid and dname");
		int did = sc.nextInt();
		String dname =sc.next();
		Department d1 = new Department(did,dname);
		emp.setDept(d1);
		
		System.out.println("Emp id is:- "+emp.getEid());
		System.out.println("Name is:- "+emp.getName());
		System.out.println("Salary is:- "+emp.getSalary());
		System.out.println("Departnemt id :- "+emp.getDept().getDeptid());
		System.out.println("Department name:- "+emp.getDept().getDeptname());
		
	}

}

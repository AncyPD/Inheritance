package org.multiple;

public class Student implements Company, Employee {

	@Override
	public void employeeId() {
		System.out.println("Employee Id: 123");
	}

	@Override
	public void employeeName() {
		System.out.println("Employee Name: Sham");
	}

	@Override
	public void companyId() {
		System.out.println("Company Id: 789");
	}

	@Override
	public void companyName() {
		System.out.println("Company Name: Greens");
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.companyId();
		s.companyName();
		s.employeeId();
		s.employeeName();
	}
}

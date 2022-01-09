package org.Student;

import org.Department.Department;

public class Student extends Department {
	
	public void studentname() {
		
		System.out.println("SHIV");

	}
	public void studentdept() {
	System.out.println("ROBOTICS");

	}
	public void studentid() {
		System.out.println("708976");

	}

	public static void main(String[] args) {
	
		Student studentdetails = new Student();
		studentdetails.CollegeName();
		studentdetails.deptname();
		studentdetails.studentdept();
		studentdetails.CollegeCode();
		studentdetails.CollegeRank();
		

	}

}

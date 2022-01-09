package org.Department;

import org.College.College;

public class Department extends College{
	
	public void deptname() {
		
System.out.println("ARTIFICIAL INELLIGENCE");
	}

	public static void main(String[] args) {
		Department deptdetails = new Department();
		deptdetails.CollegeName();
		deptdetails.deptname();
		deptdetails.CollegeCode();
		deptdetails.CollegeRank();
		

	}

}

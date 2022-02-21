package com.abc.labs.ex4;

public class EmployeeServiceImpl implements EmployeeService{

	public Employee getDetails(int empId) {
		EmployeeDao emp=new EmployeeDao();
		return emp.getDetails(empId);
	}
 
}
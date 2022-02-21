package com.abc.labs.ex4;

import java.util.List;

public class EmployeeDao {
	
	private static List<Employee> emplist;
	public List<Employee> getEmplist() {
		return emplist;
	}
	public void setEmplist(List<Employee> emplist) {
		this.emplist = emplist;
		System.out.println(this.emplist);
	}
	public Employee getDetails(int empId){
		for(Employee data:emplist){
			if(data.getEmployeeId()==empId)
				return data;
		}
		return null;
	}

}

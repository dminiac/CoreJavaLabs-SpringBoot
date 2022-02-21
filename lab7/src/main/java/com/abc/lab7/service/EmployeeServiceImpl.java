package com.abc.lab7.service;

import java.util.List;

import com.abc.lab7.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeDao edao = new EmployeeDaoImpl();

	@Override
	public String addEmployee(Employee e) {
		if (e.getId().length() == 0 || e.getName().length() == 0 || e.getSalary() <= 0) {
			return "Enter Valid Data";
		} else {
			return edao.addEmployee(e);
		}
	}

	@Override
	public String insuranceScheme(double salary, String designation) {
		if (salary <= 0 || designation.length() == 0) {
			return "Enter Valid Data";
		} else {
			return edao.insuranceScheme(salary, designation);
		}
	}

	@Override
	public List<Employee> AllEmployee() {
		return edao.AllEmployee();
	}

}
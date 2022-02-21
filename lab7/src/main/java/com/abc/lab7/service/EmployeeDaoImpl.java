package com.abc.lab7.service;

import java.util.ArrayList;
import java.util.List;

import com.abc.lab7.bean.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	List<Employee> li = new ArrayList<Employee>();

	@Override
	public String addEmployee(Employee e) {
		if ((e.getSalary() > 5000 && e.getSalary() < 20000) && e.getDesignation().equals("System Associate")) {
			e.setInsuranceScheme("Scheme C");
		} else if ((e.getSalary() >= 20000 && e.getSalary() < 40000) && e.getDesignation().equals("Programmer")) {
			e.setInsuranceScheme("Scheme B");
		} else if (e.getSalary() >= 40000 && e.getDesignation().equals("Manager")) {
			e.setInsuranceScheme("Scheme A");
		} else {
			e.setInsuranceScheme("No Scheme");
		}

		li.add(e);
		return "Employee Added";
	}

	@Override
	public String insuranceScheme(double salary, String designation) {

		if ((salary > 5000 && salary < 20000) && designation.equals("System Associate")) {
			return "Scheme C";
		} else if ((salary >= 20000 && salary < 40000) && designation.equals("Programmer")) {
			return "Scheme B";
		} else if (salary >= 40000 && designation.equals("Manager")) {
			return "Scheme A";
		} else {
			return "No Scheme";
		}

	}

	@Override
	public List<Employee> AllEmployee() {
		return li;
	}

}
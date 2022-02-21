package com.abc.lab7.service;

import java.util.List;

import com.abc.lab7.bean.Employee;

public interface EmployeeDao {

	public String addEmployee(Employee e);
	public String insuranceScheme(double salary,String designation);
	public List<Employee> AllEmployee();
}
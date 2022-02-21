package CaseStudySteamApi;

import java.time.LocalDate;

public class EmployeeRepository {

	private int id, managerId;
	private String firstName, lastName, email, phoneNumber, designation;
	private LocalDate hireDate;
	private Double salary;
	private Department department;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", managerId=" + managerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", phoneNumber=" + phoneNumber + ", designation=" + designation + ", hireDate="
				+ hireDate + ", salary=" + salary + ", department=" + department + "]";
	}

	public EmployeeRepository(int id, int managerId, String firstName, String lastName, String email,
			String phoneNumber, String designation, LocalDate hireDate, Double salary, Department department) {
		super();
		this.id = id;
		this.managerId = managerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.designation = designation;
		this.hireDate = hireDate;
		this.salary = salary;
		this.department = department;
	}
}

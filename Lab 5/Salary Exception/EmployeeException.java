import java.util.Scanner;

public class EmployeeException {

	static void getSalary(double salary) throws EmployeeSalaryException {
		if (salary < 3000)
			throw new EmployeeSalaryException("Salary is below 3000");
		else
			System.out.println("Salary is: " + salary);

	}

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the salary = ");
		double salary = scr.nextDouble();
		try {
			getSalary(salary);

		} catch (EmployeeSalaryException e) {
			e.printStackTrace();
		} finally {
			scr.close();
		}
	}

}
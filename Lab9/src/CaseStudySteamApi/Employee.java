package CaseStudySteamApi;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Employee {
	public static void main(String[] args) {

		Department dept = new Department(1, 10, "abc");
		Department dept1 = new Department(2, 20, "xyz");
		List<EmployeeRepository> empList = new ArrayList<EmployeeRepository>();
		empList = Arrays.asList(
				new EmployeeRepository(100, 1, "Ayush", "Shukla", "aashukla7@gmail.com", "9158106688", "Executive",
						LocalDate.of(2021, 4, 17), 25000d, dept),
				new EmployeeRepository(201, 2, "Shyam", "Kumar", "shyammkumar1@gmail.com", "9096684836", "Analyst",
						LocalDate.of(2021, 4, 11), 30000d, dept1),
				new EmployeeRepository(103, 1, "Ananada", "Sharma", "anandaharma@gmail.com", "8983349675", "Analyst",
						LocalDate.of(2021, 4, 05), 20500d, dept),
				new EmployeeRepository(102, 1, "Manish", "Shetty", "manishshetty@gmail.com", "9823079331", "Analyst",
						LocalDate.of(2021, 4, 17), 20000d, dept),
				new EmployeeRepository(101, 1, "Rita", "Dixit", "ritadixit@gmail.com", "9657887314", "Analyst",
						LocalDate.of(2021, 4, 20), 23000d, dept),
				new EmployeeRepository(202, 2, "Aditya", "Damble", "adityadamble@gmail.com", "9865674311", "Executive",
						LocalDate.of(2021, 4, 30), 20000d, dept1));

		for (EmployeeRepository e : empList) {
			System.out.println(e);
		}
		System.out.println("\n\nQ1. Find out the sum of salary of all employees.\n");
		Optional<Double> o = empList.stream().map(emp -> emp.getSalary()).reduce((a, b) -> (a + b));

		if (o.isPresent()) {
			System.out.println("Sum of all Salaries: " + o.get());
		}
		System.out.println("\n\nQ2. List out department names and count of employees in each department.\n");

		Map<Department, Long> de = empList.stream()
				.collect(Collectors.groupingBy(EmployeeRepository::getDepartment, Collectors.counting()));
		System.out.println(de);
		LocalDate d = LocalDate.now();
		System.out.println("\n\nQ3. List employee name and duration of their service in months and days.");
		empList.forEach(e -> System.out.println(e.getFirstName() + "\t " + Period.between(d, e.getHireDate())));
		System.out.println("\n\nQ4. Sort employees by their\r\nEmployee id\r\nDepartment id\r\nFirst name.");
		System.out.println("\nsorting by employee id: ");
		List<EmployeeRepository> e1 = empList.stream().sorted((a, b) -> a.getId() - (b.getId()))
				.collect(Collectors.toList());
		System.out.println(e1);

		for (Object a : e1) {
			System.out.println(a);
		}
		System.out.println("\nsorting by First Name: ");
		e1 = empList.stream().sorted(Comparator.comparing(EmployeeRepository::getFirstName))
				.collect(Collectors.toList());
		System.out.println(e1);

		for (Object a : e1) {
			System.out.println(a);
		}
		System.out.println("\n\nQ5. Find departments with highest count of employees.");
		de = empList.stream().limit(1)
				.collect(Collectors.groupingBy(EmployeeRepository::getDepartment, Collectors.counting()));
		System.out.println(de);

		for (Object a : e1) {
			System.out.println(a);
		}
	}
}

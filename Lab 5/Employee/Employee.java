import java.util.Scanner;

public class Employee {

	String firstName;
	String lastName;

	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		try {
			if (firstName.length() == 0 || lastName.length() == 0) {
				throw new InvalidNameException();
			}
		} catch (InvalidNameException e) {
			System.out.println(e);
			System.exit(0);
		}

	}

	public void display() {
		System.out.println("Employee's name is " + firstName + " " + lastName);
	}

	public static void main(String[] args) {

		String firstName = null;
		String lastName = null;
		Scanner scr = new Scanner(System.in);

		System.out.println("Enter first name: ");
		firstName = scr.nextLine();
		System.out.println("Enter last name: ");
		lastName = scr.nextLine();

		Employee emp = new Employee(firstName, lastName);
		emp.display();

	}

}
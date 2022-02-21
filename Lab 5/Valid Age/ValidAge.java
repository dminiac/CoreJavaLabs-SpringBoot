public class ValidAge {

	static void validate(int age) throws InvalidAgeException {
		if (age < 15)

			throw new InvalidAgeException("Invalid Age");
		else
			System.out.println("Valid Age");
	}

	public static void main(String arg[]) {
		try {
			validate(18);
		} catch (Exception e) {
			System.out.println("Exception occured: " + e);

		}

	}

}
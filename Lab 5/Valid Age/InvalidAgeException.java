public class InvalidAgeException extends Exception {

	public InvalidAgeException(String str) {
		super(str);
	}

	public String toString() {
		return "Age is less than 15 years.";
	}
}
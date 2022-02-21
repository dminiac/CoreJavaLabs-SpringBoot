import java.util.Scanner;

public class JournalPaper extends WrittenItem {

	private int year;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	Scanner sc = new Scanner(System.in);

	public Journal()
	{
		super();
		System.out.println("enter year");
		setYear(sc.nextInt());
	}

	public void print() {
		super.print();
		System.out.println("year is:" + getYear());
	}

}

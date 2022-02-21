import java.util.Scanner;

public abstract class WrittenItem extends Item {
	private String author;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	Scanner sc = new Scanner(System.in);

	public WrittenItem() {

		super();
		System.out.println("enter author:");
		setAuthor(sc.next());

	}

	public WrittenItem(int idno, int copies_count, String title, String author) {
		super(idno, copies_count, title);
		setAuthor(author);

	}

	public void print() {
		super.print();
		System.out.println("author is:" + getAuthor());
	}

}
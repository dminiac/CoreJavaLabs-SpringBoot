import java.util.Scanner;

public abstract class Item {

	private int idno;
	private int copies_count;
	private String title;

	public Item(int idno, int copies_count, String title) {
		this.idno = idno;
		this.copies_count = copies_count;
		this.title = title;
	}

	public int getIdno() {
		return idno;
	}

	public void setIdno(int idno) {
		this.idno = idno;
	}

	public int getCopies_count() {
		return copies_count;
	}

	public void setCopies_count(int copies_count) {
		this.copies_count = copies_count;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Item() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter identification number:");
		setIdno(sc.nextInt());
		System.out.println("enter title:");
		setTitle(sc.next());
		System.out.println("enter nuber of copies:");
		setCopies_count(sc.nextInt());
		sc.close();

	}

	void print() {
		System.out.println("id:" + getIdno() + "\n" + "title:" + getTitle() + "\n" + "copies:" + getCopies_count());
	}
	// abstract int function(int x,int y);
}
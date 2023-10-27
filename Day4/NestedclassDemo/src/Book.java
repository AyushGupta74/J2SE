
public class Book {
	private int bkid;
	private String bkname,author;
	private Lesson l1;
	class Lesson{
		private int lessonid;
		private String lname;
		
		public void m1() {
			System.out.println("in m1"+bkid);
		}
	}
	public Book() {
		super();
	}
	public Book(int bkid, String bkname, String author) {
		super();
		this.bkid = bkid;
		this.bkname = bkname;
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [bkid=" + bkid + ", bkname=" + bkname + ", author=" + author + "]";
	}
	
	

}

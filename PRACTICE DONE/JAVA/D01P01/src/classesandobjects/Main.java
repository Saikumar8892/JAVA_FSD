package classesandobjects;

class Book {

	private String title;
	private double price;
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public double getPrice(){
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}

public class Main {
	public static Book createBooks(String title, double price) {
		Book book = new Book();
		book.setTitle(title);
		book.setPrice(price);
		return book;
	}
	
	public static void showBooks(Book book) {
		System.out.println("Book Title: "+ book.getTitle() + " and Price: " + book.getPrice());
	}
	public static void main(String[] args) {
		String title = "Java Programming";
		double price = 350.00;
		
		Book book = createBooks(title, price);
		
		showBooks(book);
	}
}

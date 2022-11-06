package CollectionDemo;

public class Book {
	private String name;
	private String author;
	private double price;
	private int isbnNo;
	Book(String name, String author, double price, int isbnNo){
		this.name=name;
		this.author=author;
		this.price=price;
		this.isbnNo=isbnNo;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public double getPrice() {
		return price;
	}

	public int getIsbn() {
		return isbnNo;
	}


	public void setPrice(double price) {
		this.price = price;
	}

	public void setQty(int qty) {
		this.isbnNo = qty;
	}
	@Override
	public String toString(){
		return name+" by "+"price:"+price
				+author;
	}
}

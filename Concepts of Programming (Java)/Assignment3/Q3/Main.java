package HasA;

public class Main {
	public static void main(String[] args){
		Author author = new	Author("J.K.Rowling","rowling@gmail.com",'M');
		Book book= new Book("Harry Potter",author,12.55,153);
		System.out.println(book);
	}
}

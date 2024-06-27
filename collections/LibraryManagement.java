package collections;

import java.util.*;

class Book {
	String title;
	String author;
	Boolean isAvailable;
	public Book(String title, String author, Boolean isAvailable) {
		super();
		this.title = title;
		this.author = author;
		this.isAvailable = isAvailable;
	}

	 
	/*void borrowBook() {
		if (isAvailable) {
			isAvailable = false;
		} else {
			System.out.println("the book is not available");
		}
	}

	@Override
	public String toString() {
		return "Book{title='" + title + "', author='" + author + "', isAvailable=" + isAvailable + "}";
	}
*/
}

public class LibraryManagement {

	public static void main(String[] args) {
		Book book1 = new Book("Harry potter and the chamber of secrets", "J K Rowling", false);
		Book book2 = new Book("Harry potter and the chamber of secrets", "J K Rowling", false);
		ArrayList<Book> book = new ArrayList<Book>();
		book.add(book1);
		book.add(book2);

//		book.get(0).borrowBook();

		for (Book b : book) {
			System.out.println(b);
		}

	}
}

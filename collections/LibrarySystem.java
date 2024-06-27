package collections;

import java.util.ArrayList;

class Book {
    String title;
    String author;
    boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
        } else {
            System.out.println("The book is currently not available.");
        }
    }

    void returnBook() {
        isAvailable = true;
    }

    @Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author + "', isAvailable=" + isAvailable + "}";
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<>();

        Book b1=new Book("1984", "George Orwell");
        Book b2=new Book("To Kill a Mockingbird", "Harper Lee");
        library.add(b1);
        library.add(b2);

        // Borrowing a book
        library.get(0).borrowBook();

        // Printing library books
        for (Book book : library) {
            System.out.println(book);
        }
    }
}

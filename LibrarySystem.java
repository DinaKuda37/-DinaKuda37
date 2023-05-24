import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String toString() {
        return "Title: " + title + ", Author: " + author;
    }
}

class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee");
        library.addBook(book1);

        Book book2 = new Book("Pride and Prejudice", "Jane Austen");
        library.addBook(book2);

        Book book3 = new Book("1984", "George Orwell");
        library.addBook(book3);

        System.out.println("All books in the library:");
        library.displayBooks();

        System.out.println("Removing book: " + book2.getTitle());
        library.removeBook(book2);

        System.out.println("Updated book list:");
        library.displayBooks();
    }
}

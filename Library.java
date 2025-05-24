
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    private Map<String, Book> booksByIsbn;
    private Map<String, List<Book>> booksByTitle;
    private Map<String, List<Book>> booksByAuthor;

    public Library() {
        booksByIsbn = new HashMap<>();
        booksByTitle = new HashMap<>();
        booksByAuthor = new HashMap<>();
    }

    // Add a book to the library 
    public void addBook(Book book) {
        booksByIsbn.put(book.getIsbn(), book);

        // Add to title map
        booksByTitle.computeIfAbsent(book.getTitle().toLowerCase(), k -> new ArrayList<>()).add(book);

        // Add to author map
        booksByAuthor.computeIfAbsent(book.getAuthor().toLowerCase(), k-> new ArrayList<>()).add(book);
    }

    // Search book of ISBN
    public Book searchByIsbn(String isbn) throws Exception {
        Book book = booksByIsbn.get(isbn);
        if (book == null) {
            throw new Exception("Book not found with ISBN: "+ isbn);
        }
        return book;
    }

    // Search books by Title (can be multiple)
    public List<Book> searchByTitle (String title) {
        return booksByTitle.getOrDefault(title.toLowerCase(), new ArrayList<>());
    }

    // Search books by Author (can be mutilple)
    public List<Book> searchByAuthor(String author) {
        return booksByAuthor.getOrDefault(author.toLowerCase(), new ArrayList<>());
    }

    // Borrow a book by ISBN
    public void borrowBook(String isbn) throws Exception {
        Book book = searchByIsbn(isbn);
        book.borrow();
        System.out.println("Book borrowed: " + book.getTitle());
    }

    // Return a book by ISBN
    public void returnBook(String isbn) throws Exception {
        Book book = searchByIsbn(isbn);
        if(!book.isBorrowed()) {
            throw new Exception("Book was not borrowed: " + book.getTitle());
        }
        book.returned();
        System.out.println("Book returned: " + book.getTitle());
    }

    //List all books
    public void ListAllBooks() {
        if (booksByIsbn.isEmpty()) {
            System.out.println("Library is empty.");
            return;
        }
        System.out.println("Library Books:");
        for (Book book : booksByIsbn.values()) {
            System.out.println(book);
        }
    }
}
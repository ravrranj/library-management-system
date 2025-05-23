

public class Book {
    private String isbn;
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book (String isbn, String title, String  author) {
        this.isbn = isbn;
        title.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public booleab isBorrowed() {
        return isBorrowed;
    }

    public void borrow() throws Exception {
        if (isBorrowed) {
            throw new Exception("Book already borrowed");
        }
        isBorrowed = true;
    }

    public void returned() {
        isBorrowed = false;
    }

    @Override
    public String toString() {
        return String.format("Book{ISBN= '%s' , Title= '%s', Author= '%s', Borrowed= %b}", isbn, title, author, isBorrowed);
    }
}
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void printAllBooks() {
        for (Book book : books) {
            book.printBookInfo();
        }
    }

    public static void main(String[] args) {
        Library myLibrary = new Library();
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789");
        myLibrary.addBook(book1);
        myLibrary.printAllBooks();
    }
}
package BookStore;
import java.util.*;
public class MockBookDAO implements BookDAO{
private List<Book> books = new ArrayList<Book>();
    
    
    public List<Book> getAllBooks() {
        return books;
    }
    
    
    public void saveBook(Book book) {
        books.add(book);
    }
}

package BookStore;
import java.util.ArrayList;
import java.util.List;
public class PaperBook implements BookDAO{
private List<Book> books = new ArrayList<Book>();
    
    
    public List<Book> getAllBooks() {
        return books;
    }
    
    
    public void saveBook(Book book) {
        books.add(book);
    }
}

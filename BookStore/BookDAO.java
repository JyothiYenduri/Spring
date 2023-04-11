package BookStore;
import java.util.List;
public interface BookDAO {
	List<Book> getAllBooks();
	void saveBook(Book book);
}

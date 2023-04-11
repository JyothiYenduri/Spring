package BookStore;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Bookservice {
	private MockBookDAO bao;
	private PaperBook pb;
	

	
	@Autowired
	public void setBao(MockBookDAO bao) {
		this.bao = bao;
	}
	public void setPb(PaperBook pb) {
		this.pb=pb;
	}
	
	public void addBook(Book book) {
		bao.saveBook(book);
		pb.saveBook(book);
	}
	public List<Book> getAllBooks(){
		return bao.getAllBooks();
	}
	public List<Book> getAllBooks1(){
		return pb.getAllBooks();
	}
}

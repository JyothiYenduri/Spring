package BookStore;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Bookservice obj = (Bookservice) context.getBean("helloWorld");
        Book book=new Book();
        Book book1=new Book();
        book.setAuthor("vinay");
        book.setTitle("its vinay");
        obj.addBook(book);
        book1.setAuthor("kumar");
        book1.setTitle("its kumar");
        obj.addBook(book1);
        List<Book> o1=obj.getAllBooks();
        List<Book> o2=obj.getAllBooks1();
        
        System.out.println(o1);
        System.out.println(o2);
    }
}

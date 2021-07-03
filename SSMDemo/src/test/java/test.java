import com.demo.pojo.Books;
import com.demo.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class test {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationConfig.xml");
        BookService bookServiceImpl = (BookService) context.getBean("BookServiceImpl");
        Books books = new Books(1,"Java",1,"d");
        System.out.println(bookServiceImpl.selectBooksByName("web"));
    }

}

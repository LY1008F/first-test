import com.yu.pojo.Books;
import com.yu.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = (BookService) context.getBean("BookServiceImpl");
//        List<Books> list = bookServiceImpl.queryAllBook();
//        for(Books books:list){
//            System.out.println(list);
//        }

//        bookService.addBook(new Books(4,"op1",25,"ss") );
//         bookServiceImpl.deleteBookById(4);
        System.out.println(bookService.selectBookById(1));
    }
}

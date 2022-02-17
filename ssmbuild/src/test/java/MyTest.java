import com.yu.pojo.Books;
import com.yu.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
       BookService bookService=(BookService) context.getBean("BookServiceImpl");
       List<Books> list= bookService.queryAllBook();
               for(Books books:list){
                   System.out.println(books);
               }
    }

}

import com.User;
import com.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest02 {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserT user = (UserT) context.getBean("t");
        System.out.println(user.toString());
    }
}

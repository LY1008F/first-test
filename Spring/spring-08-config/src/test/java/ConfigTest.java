import com.yu.config.MyConfig;
import com.yu.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigTest {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
        User user = (User) context.getBean("user");
        System.out.println(user.name);
    }
}

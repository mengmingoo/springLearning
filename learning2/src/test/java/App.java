import com.mengming.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        /*
        * 1.定义Bean工厂接口，提供获取bean方法
        * 2.透义Bean工厂接口实现类，解析配置文件，实例化Bean对象
        * 3.实现获取Bean方法
        * */
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        UserService userService2 = (UserService) applicationContext.getBean("userService");
        userService.test();
        System.out.println(userService.hashCode());
        System.out.println(userService2.hashCode());
    }
}

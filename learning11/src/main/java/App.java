import com.meng.config.IocConfig;
import com.meng.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        //基于Java配置类获取Spring的上下文环境
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(IocConfig.class);
        //得到Bean对象
        UserService userService = applicationContext.getBean(UserService.class);
        userService.test();
    }
}

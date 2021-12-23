import com.meng.config.IocConfig3;
import com.meng.config.IocConfig4;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App4 {
    public static void main(String[] args) {
        //基于Java配置类获取Spring的上下文环境
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(IocConfig4.class);
        //得到Bean对象
        IocConfig4 iocConfig4 = applicationContext.getBean(IocConfig4.class);
        iocConfig4.test();
    }
}

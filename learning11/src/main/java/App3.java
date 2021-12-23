import com.meng.config.IocConfig3;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App3 {
    public static void main(String[] args) {
        //基于Java配置类获取Spring的上下文环境
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(IocConfig3.class);
        //得到Bean对象
        IocConfig3 iocConfig3 = applicationContext.getBean(IocConfig3.class);
        iocConfig3.test();
    }
}

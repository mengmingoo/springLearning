import com.meng.config.IocConfig;
import com.meng.config.IocConfig2;
import com.meng.dao.AccountDao;
import com.meng.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App2 {
    public static void main(String[] args) {
        //基于Java配置类获取Spring的上下文环境
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(IocConfig2.class);
        //得到Bean对象
        AccountDao accountDao = applicationContext.getBean(AccountDao.class);
        accountDao.test();
    }
}

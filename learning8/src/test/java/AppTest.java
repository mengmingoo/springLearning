import com.mengming.controller.UserController;
import com.mengming.dao.AccountDao;
import com.mengming.po.vo.ResultInfo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {
    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserController userController = (UserController) applicationContext.getBean("userController");
        ResultInfo resultInfo = userController.login("admin", "admin");
        System.out.println(resultInfo);
    }

    @Test
    public void test2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        System.out.println(applicationContext.getBean("accountDao"));
        System.out.println(applicationContext.getBean("accountDao"));

        //判断指定的bean对象是否是单例
        System.out.println(applicationContext.isSingleton("accountDao"));
    }

    @Test
    public void test3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        System.out.println(applicationContext.getBean("accountDao"));
    }

    @Test
    public void test4() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        System.out.println(applicationContext.getBean("testDao"));
    }
}

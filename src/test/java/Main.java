import com.nigel.readbox.entity.UserInfo;
import com.nigel.readbox.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * this is description of class .
 *
 * @author nigel.wang
 * @version 1.0.0
 * @Date 2017/3/12 0012  21:19
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:config/spring/applicationContext-*.xml");
        UserService userService;
        userService = (UserService) ctx.getBean("userServiceImpl");
        UserInfo a = userService.searchUserInfo("99");
        System.out.println(a);
    }
}

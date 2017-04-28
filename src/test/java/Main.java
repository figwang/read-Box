import com.nigel.readbox.common.util.Util;
import com.nigel.readbox.service.AdminService;
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
        AdminService adminService;
        adminService = (AdminService) ctx.getBean("adminServiceImpl");

        System.out.println(adminService.searchListByAdminInfo(Util.convert("AM")));
    }
}

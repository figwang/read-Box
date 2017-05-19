/*
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
*/
/** ReadBox单元测试
 * @author nigel.wang
 * @version 1.0.0
 * @Date 2017/5/17 0017  0:31
 *//*

public class ReadTest {
    @Before
    public void before(){
        */
/**spring容器初始化*//*

        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:config/spring/applicationContext-*.xml");
        */
/**微信公众号基本信息配置包括为公众号openid,secret*//*

        String appid = "wx46126c68d98f25b7";
        String secret = "629ce902a1b930959e4aabb105c04977";
        config = new ApiConfig(appid, secret);
        TestConfigChangeHandle configChangeHandle = new TestConfigChangeHandle();
        config.addHandle(configChangeHandle);
   }
        */
/**
         * 创建菜单
         * @param config API配置
         *//*

        @Test
        public void createMenu(ApiConfig config) {
            MenuAPI menuAPI = new MenuAPI(config);
            //先删除之前的菜单
            menuAPI.deleteMenu();
            Menu request = new Menu();
            //准备一级主菜单
            MenuButton main1 = new MenuButton();
            main1.setType(MenuType.CLICK);
            main1.setKey("main1");
            main1.setName("测试");
            //准备子菜单
            MenuButton sub1 = new MenuButton();
            sub1.setKey("sub1");
            sub1.setName("授权");
            sub1.setType(MenuType.VIEW);
            //OAuth2.0
            sub1.setUrl("https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx46126c68d98f25b7&redirect_uri=http://www.sevenfan.cn/wechat/index.html&response_type=code&scope=snsapi_userinfo&state=123#wechat_redirect");
            MenuButton sub2 = new MenuButton();
            sub2.setKey("sub2");
            sub2.setName("点击");
            sub2.setType(MenuType.CLICK);
            List<MenuButton> list = new ArrayList<MenuButton>();
            list.add(sub1);
            list.add(sub2);
            //将子菜单放入主菜单里
            main1.setSubButton(list);
            List<MenuButton> mainList = new ArrayList<MenuButton>();
            mainList.add(main1);
            //将主菜单加入请求对象
            request.setButton(mainList);
            LOG.debug(request.toJsonString());
            //创建菜单
            ResultType resultType = menuAPI.createMenu(request);
            LOG.debug(resultType.toString());
        }
}
*/

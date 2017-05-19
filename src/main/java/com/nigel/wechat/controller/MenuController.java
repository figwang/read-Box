package com.nigel.wechat.controller;

import com.github.sd4324530.fastweixin.api.MenuAPI;
import com.github.sd4324530.fastweixin.api.entity.Menu;
import com.github.sd4324530.fastweixin.api.entity.MenuButton;
import com.github.sd4324530.fastweixin.api.enums.MenuType;
import com.github.sd4324530.fastweixin.api.enums.ResultType;
import com.github.sd4324530.fastweixin.api.response.GetMenuResponse;
import com.nigel.wechat.common.constant.WeixinConfig;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * 微信菜单管理 .
 *
 * @author nigel.wang
 * @version 1.0.0
 * @Date 2017/5/1 0001  13:16
 */
@Controller
@RequestMapping("/wechat")
public class MenuController {
    //菜单接口
    MenuAPI menuAPI = new MenuAPI(WeixinConfig.config);

    /**
     * 获取菜单信息
     * @return
     */
    @RequestMapping(value = "/getMenu.do" ,method = RequestMethod.GET)
    @ResponseBody public GetMenuResponse getMenu(){
        GetMenuResponse a = menuAPI.getMenu();
        return a;
    }

    /**
     * 删除菜单信息
     * @return
     */
    @RequestMapping(value = "/deleteMenu.do",method = RequestMethod.GET)
    @ResponseBody public ResultType deleteMenu(){
        return menuAPI.deleteMenu();
    }

    /**
     * 生成菜单信息
     * @return
     */
    @RequestMapping(value = "/createMenu.do",method = RequestMethod.GET)
    @ResponseBody public ResultType createMenu(){
        Menu m = new Menu();
        MenuButton librarySearch = new MenuButton();
        librarySearch.setKey("001001");
        librarySearch.setName("图书检索");
        librarySearch.setType(MenuType.VIEW);
        librarySearch.setUrl("http://sevenfan.imwork.net/readBox/view/wechatView/book_search.html");

        MenuButton libraryIndex = new MenuButton();
        libraryIndex.setKey("001002");
        libraryIndex.setName("主页");
        libraryIndex.setType(MenuType.VIEW);
        libraryIndex.setUrl("http://sevenfan.imwork.net/readBox/view/wechatView/index.html");

        MenuButton  libraryBorrow= new MenuButton();
        libraryBorrow.setKey("001003");
        libraryBorrow.setName("借阅/续借");
        libraryBorrow.setType(MenuType.VIEW);
        libraryBorrow.setUrl("http://sevenfan.imwork.net/readBox/view/wechatView/book_search.html");

        MenuButton  libraryCardBind= new MenuButton();
        libraryCardBind.setKey("001004");
        libraryCardBind.setName("证件号绑定");
        libraryCardBind.setType(MenuType.VIEW);
        libraryCardBind.setUrl("http://sevenfan.imwork.net/readBox/view/wechatView/account_bind.html");

        MenuButton  libraryCloseCardBind = new MenuButton();
        libraryCloseCardBind.setKey("001005");
        libraryCloseCardBind.setName("证件号解绑");
        libraryCloseCardBind.setType(MenuType.VIEW);
        libraryCloseCardBind.setUrl("http://sevenfan.imwork.net/readBox/view/wechatView/account_bind.html");


        MenuButton  call = new MenuButton();
        call.setKey("003001");
        call.setName("联系方式");
        call.setType(MenuType.VIEW);
        call.setUrl("http://sevenfan.imwork.net/readBox/view/wechatView/account_bind.html");

        MenuButton  info = new MenuButton();
        info.setKey("003002");
        info.setName("公告信息");
        info.setType(MenuType.VIEW);
        info.setUrl("http://sevenfan.imwork.net/readBox/view/adminView/article.html");

        List<MenuButton> libraayMeun = new ArrayList<MenuButton>();

        libraayMeun.add(libraryBorrow);
        libraayMeun.add(libraryCloseCardBind);
        libraayMeun.add(libraryCardBind);
        libraayMeun.add(librarySearch);
        libraayMeun.add(libraryIndex);


        MenuButton library = new MenuButton();
        library.setKey("001");
        library.setName("图书馆");
        library.setType(MenuType.CLICK);
        library.setSubButton(libraayMeun);


        MenuButton cloud = new MenuButton();
        cloud.setKey("002");
        cloud.setName("云阅读");
        cloud.setType(MenuType.VIEW);
        cloud.setUrl("http://sevenfan.imwork.net/readBox/view/wechatView/readCloud/viewer.html");
        List<MenuButton> otherServerMeun = new ArrayList<MenuButton>();
        otherServerMeun.add(call);
        otherServerMeun.add(info);

        MenuButton otherServer = new MenuButton();
        otherServer.setKey("003");
        otherServer.setName("相关服务");
        otherServer.setType(MenuType.CLICK);
        otherServer.setSubButton(otherServerMeun);

        List<MenuButton> a = new ArrayList<MenuButton>();
        a.add(library);
        a.add(cloud);
        a.add(otherServer);
        m.setButton(a);
        return menuAPI.createMenu(m);
    }
}

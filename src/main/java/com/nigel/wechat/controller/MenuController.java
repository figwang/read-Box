package com.nigel.wechat.controller;

import com.github.sd4324530.fastweixin.api.MenuAPI;
import com.github.sd4324530.fastweixin.api.entity.Menu;
import com.github.sd4324530.fastweixin.api.entity.MenuButton;
import com.github.sd4324530.fastweixin.api.enums.MenuType;
import com.github.sd4324530.fastweixin.api.enums.ResultType;
import com.github.sd4324530.fastweixin.api.response.GetMenuResponse;
import com.nigel.wechat.common.constant.WeixinConfig;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
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
    @RequestMapping(value = "/createMenu.do",method = RequestMethod.POST)
    @ResponseBody public ResultType createMenu(@RequestBody Menu menu){
        Menu m = new Menu();
        MenuButton menuButton = new MenuButton();
        menuButton.setKey("001");
        menuButton.setName("主页");
        menuButton.setMediaId("Med001");
        menuButton.setType(MenuType.VIEW);
        menuButton.setUrl("http://sevenfan.imwork.net/readBox/view/wechatView/readCloud/viewer.html");
        MenuButton menuButton2 = new MenuButton();
        menuButton2.setKey("002");
        menuButton2.setName("云阅读");
        menuButton2.setMediaId("Med002");
        menuButton2.setType(MenuType.VIEW);
        menuButton2.setUrl("http://sevenfan.imwork.net/readBox/view/wechatView/index.html");
        List<MenuButton> a = new ArrayList<MenuButton>();
        a.add(menuButton);
        a.add(menuButton2);
        m.setButton(a);
        return menuAPI.createMenu(m);
    }
}

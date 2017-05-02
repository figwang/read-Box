package com.nigel.wechat.controller;

import com.github.sd4324530.fastweixin.api.UserAPI;
import com.github.sd4324530.fastweixin.api.response.GetUserInfoResponse;
import com.nigel.wechat.common.constant.WeixinConfig;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 微信用户管理类 .
 *
 * @author nigel.wang
 * @version 1.0.0
 * @Date 2017/5/1 0001  13:16
 */
@Controller
@RequestMapping("/wechat")
public class AccountController {

    @RequestMapping(value = "/getAllAccount.do", method = RequestMethod.GET)
    public @ResponseBody
    List<GetUserInfoResponse> getAllAccount(){
        UserAPI userAPI = new UserAPI(WeixinConfig.config);

        //userAPI.getUserInfoList(userAPI.get);

        return null;
    }

}

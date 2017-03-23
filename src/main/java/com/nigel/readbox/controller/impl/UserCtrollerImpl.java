package com.nigel.readbox.controller.impl;

import com.nigel.readbox.controller.UserController;
import com.nigel.readbox.entity.UserInfo;
import com.nigel.readbox.entity.vo.BaseUserInfoVO;
import com.nigel.readbox.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * this is description of class .
 *
 * @author nigel.wang
 * @version 1.0.0
 * @Date 2017/3/23 0023  23:14
 */
@Controller
public class UserCtrollerImpl implements UserController{

    @Autowired
    UserService userService;

    public String addUserInfo(@RequestBody BaseUserInfoVO userInfo) {
        return null;
    }

    public String delUserInfo(@RequestParam String userCode) {
        return null;
    }

    public List<UserInfo> searchListByUserInfo(@RequestParam String search) {
        return null;
    }

    public UserInfo searchUserInfo(@RequestParam String userCode) {
        return null;
    }

    public String editUserInfo(@RequestBody BaseUserInfoVO userInfo) {
        return null;
    }
}

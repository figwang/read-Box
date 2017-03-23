package com.nigel.readbox.service.impl;

import com.nigel.readbox.dao.UserInfoMapper;
import com.nigel.readbox.entity.UserInfo;
import com.nigel.readbox.entity.vo.BaseUserInfoVO;
import com.nigel.readbox.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * this is description of class .
 *
 * @author nigel.wang
 * @version 1.0.0
 * @Date 2017/3/24 0024  0:01
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserInfoMapper userInfoMapper;

    public String addUserInfo(BaseUserInfoVO userInfo) {
        return null;
    }

    public String delUserInfo(String userCode) {
        return null;
    }

    public List<UserInfo> searchListByUserInfo(String search) {
        return null;
    }

    public UserInfo searchUserInfo(String userCode) {
        return userInfoMapper.selectByPrimaryKey(22);
    }

    public String editUserInfo(BaseUserInfoVO userInfo) {
        return null;
    }
}

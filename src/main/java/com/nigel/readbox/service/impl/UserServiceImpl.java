package com.nigel.readbox.service.impl;

import com.nigel.readbox.dao.UserInfoMapper;
import com.nigel.readbox.entity.UserInfo;
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

    public int addUserInfo(UserInfo userInfo) {
        return userInfoMapper.insertSelective(userInfo);
    }

    public int delUserInfo(String userCode) {
        return userInfoMapper.deleteByUserCode(userCode);
    }

    public List<UserInfo> searchListByUserInfo(String search , String companyCode) {
        return userInfoMapper.selectListByLike(search , companyCode);
    }

    public UserInfo searchUserInfo(String userCode) {
        return userInfoMapper.selectByUserCode(userCode);
    }

    public int editUserInfo(UserInfo userInfo) {
        return userInfoMapper.updateByPrimaryKeySelective(userInfo);
    }
}

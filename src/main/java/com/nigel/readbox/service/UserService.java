package com.nigel.readbox.service;

import com.nigel.readbox.entity.UserInfo;

import java.util.List;

/**
 * this is description of class .
 *
 * @author nigel.wang
 * @version 1.0.0
 * @Date 2017/3/23 0023  23:57
 */
public interface UserService {

    public int addUserInfo(UserInfo userInfo);

    public int  delUserInfo(String userCode);

    public List<UserInfo> searchListByUserInfo(String search, String companyCode);

    public UserInfo searchUserInfo(String userCode);

    public int editUserInfo(UserInfo userInfo);

}

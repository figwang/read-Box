package com.nigel.readbox.dao;

import com.nigel.readbox.entity.UserInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserInfoMapper {

    int deleteByPrimaryKey(Integer id);

    int deleteByUserCode(String userCode);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Integer id);

    UserInfo selectByUserCode(String userCode);

    UserInfo selectByUserOpenid(String userOpenid);

    List<UserInfo> selectListByLike(String search , String companyCode);

    List<UserInfo> selectWeChatListByLike(String search , String companyCode);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}
package com.nigel.readbox.dao;

import com.nigel.readbox.entity.UserInfo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserInfoMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}
package com.nigel.readbox.dao;

import com.nigel.readbox.entity.UserInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}
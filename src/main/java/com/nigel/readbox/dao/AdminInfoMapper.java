package com.nigel.readbox.dao;

import com.nigel.readbox.entity.AdminInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminInfoMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(AdminInfo record);

    int insertSelective(AdminInfo record);

    AdminInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AdminInfo record);

    int updateByPrimaryKey(AdminInfo record);
}
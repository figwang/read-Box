package com.nigel.readbox.dao;

import com.nigel.readbox.entity.AdminInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminInfoMapper {

    int deleteByPrimaryKey(Integer id);

    int deleteByAdminCode(String adminCode);

    int insert(AdminInfo record);

    int insertSelective(AdminInfo record);

    AdminInfo selectByPrimaryKey(Integer id);

    AdminInfo selectByAdminCode(String adminCode);

    List<AdminInfo> selectListByLike(String search);

    int updateByPrimaryKeySelective(AdminInfo record);

    int updateByPrimaryKey(AdminInfo record);
}
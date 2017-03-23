package com.nigel.readbox.dao;

import com.nigel.readbox.entity.CompanyInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyInfoMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(CompanyInfo record);

    int insertSelective(CompanyInfo record);

    CompanyInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CompanyInfo record);

    int updateByPrimaryKey(CompanyInfo record);
}
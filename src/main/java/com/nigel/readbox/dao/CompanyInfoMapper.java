package com.nigel.readbox.dao;

import com.nigel.readbox.entity.CompanyInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyInfoMapper {

    int deleteByPrimaryKey(Integer id);

    int deleteByCompanyCode(String companyCode);

    int insert(CompanyInfo record);

    int insertSelective(CompanyInfo record);

    CompanyInfo selectByPrimaryKey(Integer id);

    CompanyInfo selectByCompanyCode(String companyCode);

    List<CompanyInfo> selecListByLike(String search);

    int updateByPrimaryKeySelective(CompanyInfo record);

    int updateByPrimaryKey(CompanyInfo record);
}
package com.nigel.readbox.service.impl;

import com.nigel.readbox.dao.CompanyInfoMapper;
import com.nigel.readbox.entity.CompanyInfo;
import com.nigel.readbox.service.CompanyService;
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
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    CompanyInfoMapper companyInfoMapper;

    public int addCompanyInfo(CompanyInfo companyInfo) {
        return companyInfoMapper.insert(companyInfo);
    }

    public int delCompanyInfo(String companyCode) {
        return companyInfoMapper.deleteByCompanyCode(companyCode);
    }

    public List<CompanyInfo> searchListByCompanyInfo(String search) {
        return companyInfoMapper.selecListByLike(search);
    }

    public CompanyInfo searchCompanyInfo(String companyCode) {
        return companyInfoMapper.selectByCompanyCode(companyCode);
    }

    public int editCompanyInfo(CompanyInfo companyInfo) {
        return companyInfoMapper.updateByPrimaryKeySelective(companyInfo);
    }
}

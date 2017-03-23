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

    public String addCompanyInfo(CompanyInfo companyInfo) {
        return null;
    }

    public String delCompanyInfo(String companyCode) {
        return null;
    }

    public List<CompanyInfo> searchListByCompanyInfo(String search) {
        return null;
    }

    public CompanyInfo searchCompanyInfo(String companyCode) {
        return null;
    }

    public String editCompanyInfo(CompanyInfo companyInfo) {
        return null;
    }
}

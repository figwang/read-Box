package com.nigel.readbox.service;

import com.nigel.readbox.entity.CompanyInfo;

import java.util.List;

/**
 * this is description of class .
 *
 * @author nigel.wang
 * @version 1.0.0
 * @Date 2017/3/23 0023  23:58
 */
public interface CompanyService {

    public int addCompanyInfo(CompanyInfo companyInfo);

    public int delCompanyInfo(String companyCode);

    public List<CompanyInfo> searchListByCompanyInfo(String search);

    public CompanyInfo searchCompanyInfo(String companyCode);

    public int editCompanyInfo(CompanyInfo companyInfo);

}

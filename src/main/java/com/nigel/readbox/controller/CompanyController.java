package com.nigel.readbox.controller;

import com.nigel.readbox.entity.CompanyInfo;
import java.util.List;

/**
 * 图书所属单位管理 .
 *
 * @author nigel.wang
 * @version 1.0.0
 * @Date 2017/3/20 0020  22:23
 */
public interface CompanyController {
    /**
     * 添加单位(学校)信息
     * @param companyInfo 单位(学校)信息
     * @return  成功返回success，失败返回fail
     */
    public String addCompanyInfo(CompanyInfo companyInfo);

    /**
     * 删除单位(学校)信息
     * @param companyCode 单位(学校)唯一身份编码
     * @return 成功返回success，失败返回fail
     */
    public String delCompanyInfo(String companyCode);

    /**
     * 模糊查询单位(学校)信息
     * @param search 模糊查询条件
     * @return 返回单位(学校)信息列表
     */
    public List<CompanyInfo> searchListByCompanyInfo(String search);

    /**
     * 查询单位(学校)详细信息
     * @param companyCode 单位(学校)唯一身份编码
     * @return 单位(学校)详细信息，失败返回异常fail
     */
    public CompanyInfo searchCompanyInfo(String companyCode);

    /**
     * 修改单位(学校)信息
     * @param companyInfo 单位(学校)基本信息
     * @return 成功返回success，失败返回fail
     */
    public String editCompanyInfo(CompanyInfo companyInfo);
}

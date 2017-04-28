package com.nigel.readbox.controller;

import com.nigel.readbox.entity.CompanyInfo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 图书所属单位管理 .
 *
 * @author nigel.wang
 * @version 1.0.0
 * @Date 2017/3/20 0020  22:23
 */
@RequestMapping("/company")
public interface CompanyController {
    /**
     * 添加单位(学校)信息
     * @param companyInfo 单位(学校)信息
     * @return  成功返回success，失败返回fail
     */
    @RequestMapping(value = "/addCompanyInfo.do", method = RequestMethod.POST)
    public @ResponseBody
    String addCompanyInfo(@RequestBody CompanyInfo companyInfo);

    /**
     * 删除单位(学校)信息
     * @param companyCode 单位(学校)唯一身份编码
     * @return 成功返回success，失败返回fail
     */
    @RequestMapping(value = "/delCompanyInfo.do", method = RequestMethod.GET)
    public @ResponseBody
    String delCompanyInfo(@RequestParam String companyCode);

    /**
     * 模糊查询单位(学校)信息
     * @param search 模糊查询条件
     * @return 返回单位(学校)信息列表
     */
    @RequestMapping(value = "/searchListByCompanyInfo.do", method = RequestMethod.GET)
    public @ResponseBody
    List<CompanyInfo> searchListByCompanyInfo(@RequestParam String search);

    /**
     * 查询单位(学校)详细信息
     * @param companyCode 单位(学校)唯一身份编码
     * @return 单位(学校)详细信息，失败返回异常fail
     */
    @RequestMapping(value = "/searchCompanyInfo.do", method = RequestMethod.GET)
    public @ResponseBody
    CompanyInfo searchCompanyInfo(@RequestParam String companyCode);

    /**
     * 修改单位(学校)信息
     * @param companyInfo 单位(学校)基本信息
     * @return 成功返回success，失败返回fail
     */
    @RequestMapping(value = "/editCompanyInfo.do", method = RequestMethod.POST)
    public @ResponseBody
    String editCompanyInfo(@RequestBody CompanyInfo companyInfo);
}

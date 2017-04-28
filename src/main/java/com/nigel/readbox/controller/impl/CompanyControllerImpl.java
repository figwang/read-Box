package com.nigel.readbox.controller.impl;

import com.nigel.readbox.common.constant.Result;
import com.nigel.readbox.controller.CompanyController;
import com.nigel.readbox.entity.CompanyInfo;
import com.nigel.readbox.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * this is description of class .
 *
 * @author nigel.wang
 * @version 1.0.0
 * @Date 2017/3/23 0023  23:50
 */
@Controller
public class CompanyControllerImpl implements CompanyController {

    @Autowired
    CompanyService companyService;

    public String addCompanyInfo(@RequestBody CompanyInfo companyInfo) {
        int result = companyService.addCompanyInfo(companyInfo);
        if(result > 0)
        {
            return Result.SUCCESS;
        }
        else
        {
            return Result.FAIL;
        }
    }

    public String delCompanyInfo(@RequestBody String companyCode) {
        int result = companyService.delCompanyInfo(companyCode);
        if(result > 0)
        {
            return Result.SUCCESS;
        }
        else
        {
            return Result.FAIL;
        }
    }

    public List<CompanyInfo> searchListByCompanyInfo(@RequestParam String search) {
        return companyService.searchListByCompanyInfo(search);
    }

    public CompanyInfo searchCompanyInfo(@RequestParam String companyCode) {
        return companyService.searchCompanyInfo(companyCode);
    }

    public String editCompanyInfo(@RequestBody CompanyInfo companyInfo) {
        int result = companyService.editCompanyInfo(companyInfo);
        if(result > 0)
        {
            return Result.SUCCESS;
        }
        else
        {
            return Result.FAIL;
        }
    }
}

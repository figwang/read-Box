package com.nigel.readbox.controller.impl;

import com.nigel.readbox.controller.CompanyController;
import com.nigel.readbox.entity.CompanyInfo;
import com.nigel.readbox.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

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
        return null;
    }

    public String delCompanyInfo(@RequestBody String companyCode) {
        return null;
    }

    public List<CompanyInfo> searchListByCompanyInfo(@RequestBody String search) {
        return null;
    }

    public CompanyInfo searchCompanyInfo(@RequestBody String companyCode) {
        return null;
    }

    public String editCompanyInfo(@RequestBody CompanyInfo companyInfo) {
        return null;
    }
}

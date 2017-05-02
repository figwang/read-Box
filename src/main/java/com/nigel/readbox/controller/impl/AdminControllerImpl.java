package com.nigel.readbox.controller.impl;

import com.nigel.readbox.common.constant.Result;
import com.nigel.readbox.controller.AdminController;
import com.nigel.readbox.entity.AdminInfo;
import com.nigel.readbox.service.AdminService;
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
 * @Date 2017/3/23 0023  23:49
 */
@Controller
public class AdminControllerImpl implements AdminController {

    @Autowired
    AdminService adminService;

    public String addAdminInfo(@RequestBody AdminInfo adminInfo) {

        int result = adminService.addAdminInfo(adminInfo);
        if( result > 0)
        {
            return Result.SUCCESS;
        }else
        {
            return  Result.FAIL;
        }
    }

    public String delAdminInfo(@RequestParam List<String> adminCodes) {
        if(adminCodes == null){
            return Result.FAIL;
        }
        for (String adminCode: adminCodes) {
            adminService.delAdminInfo(adminCode);
        }
        return Result.SUCCESS;
    }

    public List<AdminInfo> searchListByAdminInfo() {
       return adminService.searchAllAdminInfo() ;
    }

    public AdminInfo searchAdminInfo(@RequestParam String adminCode) {
        return adminService.searchAdminInfo(adminCode);
    }

    public String editAdminInfo(@RequestBody AdminInfo adminInfo) {
        int result = adminService.editAdminInfo(adminInfo);
        if( result > 0)
        {
            return Result.SUCCESS;
        }else {
            return Result.FAIL;
        }
    }
}

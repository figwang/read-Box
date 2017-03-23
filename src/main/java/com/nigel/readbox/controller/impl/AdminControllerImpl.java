package com.nigel.readbox.controller.impl;

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
        return null;
    }

    public String delAdminInfo(@RequestParam String adminCode) {
        return null;
    }

    public List<AdminInfo> searchListByAdminInfo(@RequestParam String search) {
        return null;
    }

    public AdminInfo searchAdminInfo(@RequestParam String adminCode) {
        return null;
    }

    public String editAdminInfo(@RequestBody AdminInfo adminInfo) {
        return null;
    }
}

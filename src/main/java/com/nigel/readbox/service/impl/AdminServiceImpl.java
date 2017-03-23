package com.nigel.readbox.service.impl;

import com.nigel.readbox.dao.AdminInfoMapper;
import com.nigel.readbox.entity.AdminInfo;
import com.nigel.readbox.service.AdminService;
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
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminInfoMapper adminInfoMapper;

    public String addAdminInfo(AdminInfo adminInfo) {
        return null;
    }

    public String delAdminInfo(String adminCode) {
        return null;
    }

    public List<AdminInfo> searchListByAdminInfo(String search) {
        return null;
    }

    public AdminInfo searchAdminInfo(String adminCode) {
        return null;
    }

    public String editAdminInfo(AdminInfo adminInfo) {
        return null;
    }
}

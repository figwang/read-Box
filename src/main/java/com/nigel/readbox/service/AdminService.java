package com.nigel.readbox.service;

import com.nigel.readbox.entity.AdminInfo;

import java.util.List;

/**
 * this is description of class .
 *
 * @author nigel.wang
 * @version 1.0.0
 * @Date 2017/3/23 0023  23:57
 */
public interface AdminService {

    public int addAdminInfo(AdminInfo adminInfo);

    public int delAdminInfo(String adminCode);

    public List<AdminInfo> searchListByAdminInfo(String search);

    public AdminInfo searchAdminInfo(String adminCode);

    public int editAdminInfo(AdminInfo adminInfo);
}
